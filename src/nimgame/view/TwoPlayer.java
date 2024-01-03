/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nimgame.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;
import nimgame.controller.NIM_Control_2Player;

/**
 *
 * @author Admin
 */
public class TwoPlayer extends javax.swing.JFrame {
    private static TwoPlayer instance;
    /**
     * Creates new form TwoPlayer
     */
    public TwoPlayer() {
        initComponents();
    }
    
    public static synchronized TwoPlayer getInstance() {
        if (instance == null) {
            instance = new TwoPlayer();
            instance.setVisible(true);
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TwoPlayerPanel = new javax.swing.JPanel();
        Stone37 = new javax.swing.JLabel();
        Stone36 = new javax.swing.JLabel();
        Stone35 = new javax.swing.JLabel();
        Stone34 = new javax.swing.JLabel();
        Stone33 = new javax.swing.JLabel();
        Stone32 = new javax.swing.JLabel();
        Stone31 = new javax.swing.JLabel();
        Stone27 = new javax.swing.JLabel();
        Stone26 = new javax.swing.JLabel();
        Stone25 = new javax.swing.JLabel();
        Stone24 = new javax.swing.JLabel();
        Stone23 = new javax.swing.JLabel();
        Stone22 = new javax.swing.JLabel();
        Stone21 = new javax.swing.JLabel();
        Stone17 = new javax.swing.JLabel();
        Stone16 = new javax.swing.JLabel();
        Stone15 = new javax.swing.JLabel();
        Stone14 = new javax.swing.JLabel();
        Stone13 = new javax.swing.JLabel();
        Stone12 = new javax.swing.JLabel();
        Stone11 = new javax.swing.JLabel();
        TurnLabel = new javax.swing.JLabel();
        PlayerName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UndoBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bg_Table = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        SaveBtn = new javax.swing.JMenu();
        LoadBtn = new javax.swing.JMenu();
        ExitBtn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 250));

        TwoPlayerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stone37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone37, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        Stone36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone36, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        Stone35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone35, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        Stone34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone34, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        Stone33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone33, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        Stone32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone32, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        Stone31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone31, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        Stone27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        Stone26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        Stone25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        Stone24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        Stone23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        Stone22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        Stone21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        Stone17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        Stone16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        Stone15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        Stone14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        Stone13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        Stone12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        Stone11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Stone.png"))); // NOI18N
        TwoPlayerPanel.add(Stone11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        TurnLabel.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        TurnLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TurnLabel.setText("Turn of ");
        TwoPlayerPanel.add(TurnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        PlayerName.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        PlayerName.setText("Player 1");
        TwoPlayerPanel.add(PlayerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/Monkey.png"))); // NOI18N
        TwoPlayerPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -9, -1, 140));

        UndoBtn.setFont(new java.awt.Font("Futura Hv", 0, 22)); // NOI18N
        UndoBtn.setText("Undo");
        UndoBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TwoPlayerPanel.add(UndoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 489, 100, 40));

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2 players mode");
        TwoPlayerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 230, -1));

        bg_Table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimgame/view/images/BG_GamePlay.png"))); // NOI18N
        TwoPlayerPanel.add(bg_Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        SaveBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SaveBtn.setText("Save Game");
        SaveBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaveBtn.setPreferredSize(new java.awt.Dimension(87, 27));
        jMenuBar1.add(SaveBtn);

        LoadBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoadBtn.setText("Load Game");
        LoadBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoadBtn.setPreferredSize(new java.awt.Dimension(87, 27));
        jMenuBar1.add(LoadBtn);

        ExitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitBtn.setText("Exit");
        ExitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExitBtn.setMinimumSize(new java.awt.Dimension(37, 27));
        ExitBtn.setPreferredSize(new java.awt.Dimension(37, 27));
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
        });
        jMenuBar1.add(ExitBtn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TwoPlayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TwoPlayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TwoPlayerPanel.setVisible(true);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        int opt = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát?", "Exit", JOptionPane.OK_CANCEL_OPTION);
        if(opt==JOptionPane.OK_OPTION){
            Start_UI.getInstance();
            instance.setVisible(false);
            instance = null;
            return;
        } else if(opt==JOptionPane.CANCEL_OPTION){
            System.out.println("Không thoát game, người chơi chọn \"Cancel\"");
        }
    }//GEN-LAST:event_ExitBtnMouseClicked

    public JMenu getSaveBtn(){
        return SaveBtn;
    }
    
    public JMenu getLoadBtn(){
        return LoadBtn;
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TwoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TwoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TwoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TwoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TwoPlayer().setVisible(true);
//            }
//        });
//    }

        
    public JLabel getStone11(){
        return Stone11;
    }
    
    public JLabel getStone12(){
        return Stone12;
    }
    
    public JLabel getStone13(){
        return Stone13;
    }
    
    public JLabel getStone14(){
        return Stone14;
    }
    
    public JLabel getStone15(){
        return Stone15;
    }
    
    public JLabel getStone16(){
        return Stone16;
    }
    
    public JLabel getStone17(){
        return Stone17;
    }
    
    public JLabel getStone21(){
        return Stone21;
    }
    
    public JLabel getStone22(){
        return Stone22;
    }
    
    public JLabel getStone23(){
        return Stone23;
    }
    
    public JLabel getStone24(){
        return Stone24;
    }
    
    public JLabel getStone25(){
        return Stone25;
    }
    
    public JLabel getStone26(){
        return Stone26;
    }
    
    public JLabel getStone27(){
        return Stone27;
    }
    
    public JLabel getStone31(){
        return Stone31;
    }
    
    public JLabel getStone32(){
        return Stone32;
    }
    
    public JLabel getStone33(){
        return Stone33;
    }
    
    public JLabel getStone34(){
        return Stone34;
    }
    
    public JLabel getStone35(){
        return Stone35;
    }
    
    public JLabel getStone36(){
        return Stone36;
    }
    
    public JLabel getStone37(){
        return Stone37;
    }
    
    public JLabel getTurn(){
        return PlayerName;
    }
    
    public JButton getUndo(){
        return UndoBtn;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ExitBtn;
    private javax.swing.JMenu LoadBtn;
    private javax.swing.JLabel PlayerName;
    private javax.swing.JMenu SaveBtn;
    private javax.swing.JLabel Stone11;
    private javax.swing.JLabel Stone12;
    private javax.swing.JLabel Stone13;
    private javax.swing.JLabel Stone14;
    private javax.swing.JLabel Stone15;
    private javax.swing.JLabel Stone16;
    private javax.swing.JLabel Stone17;
    private javax.swing.JLabel Stone21;
    private javax.swing.JLabel Stone22;
    private javax.swing.JLabel Stone23;
    private javax.swing.JLabel Stone24;
    private javax.swing.JLabel Stone25;
    private javax.swing.JLabel Stone26;
    private javax.swing.JLabel Stone27;
    private javax.swing.JLabel Stone31;
    private javax.swing.JLabel Stone32;
    private javax.swing.JLabel Stone33;
    private javax.swing.JLabel Stone34;
    private javax.swing.JLabel Stone35;
    private javax.swing.JLabel Stone36;
    private javax.swing.JLabel Stone37;
    private javax.swing.JLabel TurnLabel;
    private javax.swing.JPanel TwoPlayerPanel;
    private javax.swing.JButton UndoBtn;
    private javax.swing.JLabel bg_Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
