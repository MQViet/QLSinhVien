/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

/**
 *
 * @author vietm
 */
public class GioiThieu_Dialog extends java.awt.Dialog {

    /**
     * Creates new form About_Dialog
     */
    public GioiThieu_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        lbl_Fpt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Intro = new javax.swing.JTextPane();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 111, 33), 3));

        lbl_Fpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FPT_Wellcom.png"))); // NOI18N
        lbl_Fpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_FptMouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(null);

        txt_Intro.setEditable(false);
        txt_Intro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_Intro.setForeground(new java.awt.Color(102, 102, 102));
        txt_Intro.setText("PolyPro là dự án mẫu. Mục tiêu chính là huấn luyện sinh viên qui trình thực hiện dự án.\n\nMục tiêu của dự án này là để rèn luyện kỹ năng IO (CDIO) tức là không yêu cầu sinh viên phải thu thập phân tích mà chỉ thực hiện vận hành một phần mềm chuẩn bị cho các dự án sau này. Các kỹ năng CD (trong CDIO) sẽ được huấn luyện ở dự án 1 và dự án 2.\n\nyêu cầu môi trường :\t\t\t\tĐược Phát Triển Bởi :\n1. Hệ điều hành bất kì\t\t\t\tEngineer : Mai Quốc Việt\n2. JDK 1.8 trở lên\t\t\t\tMSSV : PS15755\n3. SQL server 2008 trở lên\t\t\t\t                  \n\t\n\t\t             Thank you for using the software");
        txt_Intro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_IntroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txt_Intro);

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Fpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Fpt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void lbl_FptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FptMouseClicked
        // TODO add your handling code here:
        this.click();
    }//GEN-LAST:event_lbl_FptMouseClicked

    private void txt_IntroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_IntroMouseClicked
        // TODO add your handling code here:
        this.click();
    }//GEN-LAST:event_txt_IntroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GioiThieu_Dialog dialog = new GioiThieu_Dialog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Fpt;
    private javax.swing.JPanel pnl1;
    private javax.swing.JTextPane txt_Intro;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        txt_Intro.setEditable(false);
    }
    private void click(){
        this.dispose();
    }
}
