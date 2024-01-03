/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nimgame.controller;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import nimgame.view.OnePlayer;

/**
 *
 * @author Admin
 */
public class NIM_Control_1Player {
    OnePlayer ui = null;
    private JLabel[][] LabelArr;
    private JLabel turn;
    private int count = 0;
    private boolean TURN;
    private JButton Undo;
    private static int UndoVar = -1;
    private static int UndoCol = -1;
    private static int ComMove = -1;
    private static int ComCol = -1;
    
    public void refresh(){
        ui = OnePlayer.getInstance();
        UndoVar = -1;
        UndoCol = -1;
        ComMove = -1;
        ComCol = -1;
        LabelArr = new JLabel[3][7];
        count = 0;
        ui.getLogLabel().setText("");
        turn = ui.getTurn(); turn.setText("Your turn");
        TURN = true;
        LabelArr[0][0] = ui.getStone11();
        LabelArr[0][1] = ui.getStone12();
        LabelArr[0][2] = ui.getStone13();
        LabelArr[0][3] = ui.getStone14();
        LabelArr[0][4] = ui.getStone15();
        LabelArr[0][5] = ui.getStone16();
        LabelArr[0][6] = ui.getStone17();
        
        LabelArr[1][0] = ui.getStone21();
        LabelArr[1][1] = ui.getStone22();
        LabelArr[1][2] = ui.getStone23();
        LabelArr[1][3] = ui.getStone24();
        LabelArr[1][4] = ui.getStone25();
        LabelArr[1][5] = ui.getStone26();
        LabelArr[1][6] = ui.getStone27();
        
        LabelArr[2][0] = ui.getStone31();
        LabelArr[2][1] = ui.getStone32();
        LabelArr[2][2] = ui.getStone33();
        LabelArr[2][3] = ui.getStone34();
        LabelArr[2][4] = ui.getStone35();
        LabelArr[2][5] = ui.getStone36();
        LabelArr[2][6] = ui.getStone37();
        
        for(int i=0; i<LabelArr.length; i++)
            for(int j=0; j<LabelArr[i].length; j++)
                LabelArr[i][j].setVisible(true);
        
        setRandom();
    }
    
    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    
    private void setRandom(){
        int rows = 3;
        int cols = 7;
        for (int i = 0; i < rows; i++) {
            int numLabels = getRandomNumber(4, 7);
            for (int j = numLabels; j < cols; j++) {
                LabelArr[i][j].setVisible(false);
            }
        }
    }
    
    public void setAllLabel(){
        for(int i=0; i<LabelArr.length; i++){
            for(int j=0; j<LabelArr[i].length; j++){
                LabelArr[i][j].setVisible(true);
                final int ni = i;
                final int nj = j;
                
//Thêm sự kiện khi nhấn chuột vào Label
                LabelArr[i][j].addMouseListener(new MouseAdapter() {
                @Override
                    public void mouseClicked(MouseEvent e) {
                        if(TURN==true){
                            UndoVar = 0;
                            UndoCol = ni;
                            // Làm biến mất các label khi nhấn vào
                            for (int n = nj; n < LabelArr[ni].length; n++) {
                                if (LabelArr[ni][n].isVisible()) {
                                    UndoVar++;
                                }
                                LabelArr[ni][n].setVisible(false);
                            }
                            
                        //    Kiểm tra số Label còn lại
                        if(isGameOver() && TURN==true){
                            JOptionPane.showMessageDialog(ui,"You are the Winner!", "YOU WIN", JOptionPane.PLAIN_MESSAGE);
                            refresh();
                            return;
                        }
                            turn.setText("Computer's turn");
                            TURN=false;
                            try {
                                computerMove(LabelArr);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                                System.out.println("Lỗi ở computer move");
                            }
                            return;
                        }
                    }
                });
//Thêm sự kiện khi rê chuột vào
                LabelArr[i][j].addMouseListener(new MouseAdapter() {
                @Override
                    public void mouseEntered(MouseEvent e) {
                        for (int n = nj; n < LabelArr[ni].length; n++) {
                            LabelArr[ni][n].setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Selected.png")));
                        }
                    }
                });
                
//Thêm sự kiện khi rê chuột ra
                LabelArr[i][j].addMouseListener(new MouseAdapter() {
                @Override
                    public void mouseExited(MouseEvent e) {
                        for (int n = nj; n < LabelArr[ni].length; n++) {
                            LabelArr[ni][n].setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png")));
                        }
                    }
                });
            }
        }
    }
    
    public void doUndo(ActionEvent evt){
        try {
            if(UndoVar==-1){
                JOptionPane.showMessageDialog(ui, "Chưa có nước đi nào!", "KHÔNG THỂ QUAY LẠI", JOptionPane.PLAIN_MESSAGE);
            } else if(UndoVar==0){
                    JOptionPane.showMessageDialog(ui, "Bạn chỉ có thể Undo 1 bước!", "KHÔNG THỂ QUAY LẠI", JOptionPane.ERROR_MESSAGE);
            } else {
                for(int i=0; i<LabelArr[ComCol].length; i++){
                    if(LabelArr[ComCol][i].isVisible()){}
                    else 
                        if(!LabelArr[ComCol][i].isVisible()){
                            LabelArr[ComCol][i].setVisible(true);
                            ComMove--;
                        }
                    if(ComMove==0)
                        break;
                }
                
                for(int i=0; i<LabelArr[UndoCol].length; i++){
                    if(LabelArr[UndoCol][i].isVisible()){}
                    else 
                        if(!LabelArr[UndoCol][i].isVisible()){
                            LabelArr[UndoCol][i].setVisible(true);
                            UndoVar--;
                        }
                    if(UndoVar==0)
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static int countLabel(JLabel[][] Arr) {
        int count = 0;
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                if (Arr[i][j].isVisible()) {
                    count++;
                }
            }
        }
        //System.out.println("So luong da con lai: "+ count);
        return count;
    }
    
    public static int countLabel(JLabel[] Arr) {
        int count = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i].isVisible()) {
                count++;
            }
        }
        //System.out.println("So luong da con lai: "+ count);
        return count;
    }
    
    public boolean isGameOver(){
        if(countLabel(LabelArr) > 0)
            return false;
        return true;
    }    
    
    private void computerMove(JLabel[][] Arr) throws InterruptedException {
        int pile;
        int stones;
        Random random = new Random();
        do {
            pile = random.nextInt(Arr.length); // Chọn ngẫu nhiên 1 trong 3 mảng
            stones = random.nextInt(Arr[pile].length + 1) + 1; // Chọn ngẫu nhiên số lượng trong mảng đó
        } while (countLabel(Arr[pile]) < stones);

        final int pil = pile;
        final int stn = stones;

        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                Undo.setEnabled(false);
                Thread.sleep(1000);
                ui.getLogLabel().setText("");
                for (int n = stn; n > 0; n--) {
                    int a = countLabel(Arr[pil]);
                    LabelArr[pil][a - 1].setVisible(false);
                    Thread.sleep(300);
                }
                return null;
            }

            @Override
            protected void done() {
                System.out.println("Máy tính lấy " + stn + " viên đá từ cột " + (pil + 1));
                ui.getLogLabel().setText("Máy tính lấy " + stn + " viên đá từ cột " + (pil + 1));
                Undo.setEnabled(true);
                if (isGameOver() && !TURN) {
                    JOptionPane.showMessageDialog(ui, "Computer is the Winner!", "COMPUTER WIN", JOptionPane.PLAIN_MESSAGE);
                    refresh();
                } else {
                    TURN = true;
                    turn.setText("Your turn");
                }
            }
        };
        worker.execute();
        ComMove=stn;
        ComCol=pil;
    }
    
    private String createStr(){ //Tạo file text từ trạng thái game hiện tại
        String Str = "NIMGAME1PLAYER\n";
        for(int i=0; i<LabelArr.length; i++)
            for(int j=0; j<LabelArr[i].length; j++){
                if(LabelArr[i][j].isVisible())
                    Str += "1\n";
                else Str += "0\n";
            }
        
        //System.out.println("Save String:\n" + Str);
        return Str;
    }
    
    public void saveGame(){
        JFileChooser fc = new JFileChooser();
        //Set file name extension khi hiển thị hộp thoại File Chooser
        FileNameExtensionFilter ft = new FileNameExtensionFilter(".txt", "txt");
        fc.setFileFilter(ft);
        //Cấm chọn nhiều mục
        fc.setMultiSelectionEnabled(false);
        //Cấu hình việc lưu file
        int returnVal = fc.showSaveDialog(this.ui); //returnVal sẽ trả về là có chọn file hay không
        if (returnVal==JFileChooser.APPROVE_OPTION){
            try {
                File file = fc.getSelectedFile();
                //Tự động đặt extension ".txt" cho file nếu không có sẵn
                String fileName = file.getName();
                if (!fileName.endsWith(".txt")) {
                    // Nếu không có phần mở rộng .txt, thêm nó vào
                    file = new File(file.getAbsolutePath() + ".txt");
                }
                
                PrintWriter pw = new PrintWriter(file.getAbsolutePath(), "UTF-8");
                String data = createStr(); // Data được lưu sẽ gán ở đây
                pw.print(data); //Đẩy data vào bộ nhớ đệm trong file
                pw.flush(); //Lưu file lại 
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //Bắt sự kiện nếu không chọn file
    }
    
    public void loadGame(){
        //Khúc này giống khúc trên
        JFileChooser fc = new JFileChooser();
        //Set file name extension khi hiển thị hộp thoại File Chooser
        FileNameExtensionFilter ft = new FileNameExtensionFilter(".txt", "txt");
        fc.setFileFilter(ft);
        //Cấm chọn nhiều mục
        fc.setMultiSelectionEnabled(false);
        
        int returnVal = fc.showOpenDialog(this.ui); //returnVal sẽ trả về là có chọn file hay không
        if (returnVal==JFileChooser.APPROVE_OPTION){
            try {
                refresh();
                File file = fc.getSelectedFile();
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = ""; //tạo chuỗi line để đọc từng dòng vào chuỗi này

                line = br.readLine();
                if (!line.equalsIgnoreCase("NIMGAME1PLAYER")) {
                    if (line.equalsIgnoreCase("NIMGAME2PLAYER")) {
                        JOptionPane.showMessageDialog(this.ui, "Tập tin này là chế độ 2 người chơi", "Lỗi tập tin", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    else {
                        JOptionPane.showMessageDialog(this.ui, "Không thể đọc tập tin này", "Lỗi tập tin", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                
                for(int i=0; i<LabelArr.length; i++) //Đọc file dựa trên số phần tử trong mảng Arr
                    for(int j=0; j<LabelArr[i].length; j++){
                        if((line = br.readLine()).equals("1")) //Đọc từng dòng trong file text
                            LabelArr[i][j].setVisible(true);          //Nếu là 1 thì set visible
                        else
                            LabelArr[i][j].setVisible(false);
                        //System.out.println(line);
                    }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this.ui, "Không thể đọc tập tin này", "Lỗi tập tin", JOptionPane.ERROR_MESSAGE);
            }
        }
        else //Sự kiến nếu không chọn được file
            JOptionPane.showMessageDialog(this.ui, "Chưa chọn file nào!", "Notice", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    // HÀM XÂY DỰNG
    public NIM_Control_1Player(){
        // Thiết lập kích thước chữ cho JOptionPane
        UIManager.put("OptionPane.messageFont", new Font("Futura Bk", Font.BOLD, 20));
        refresh();
        ui.setVisible(true);
        setAllLabel();
        setRandom();
        JMenu savebtn, loadbtn;
        savebtn = ui.getSaveBtn();
        loadbtn = ui.getLoadBtn();
        Undo = ui.getUndo();
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                doUndo(evt);
            }
        });
        
        savebtn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                saveGame();
            }
        });
        
        loadbtn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                loadGame();
            }
        });
    }
}
