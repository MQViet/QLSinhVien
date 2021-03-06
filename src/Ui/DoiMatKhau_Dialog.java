/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import DAO.NhanVienDAO;
import Utils.Auth;
import Utils.MsgBox;
import Utils.XImage;

/**
 *
 * @author vietm
 */
public class DoiMatKhau_Dialog extends java.awt.Dialog {

    /**
     * Creates new form DoiMatKhau_Dialog
     */
    public DoiMatKhau_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    NhanVienDAO dao = new NhanVienDAO();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        lbl_DoiMK = new javax.swing.JLabel();
        txt_MaNV = new javax.swing.JTextField();
        txt_Matkhau = new javax.swing.JPasswordField();
        txt_MatkhauMoi = new javax.swing.JPasswordField();
        txt_MatkhauMoi1 = new javax.swing.JPasswordField();
        lbl_TenDN = new javax.swing.JLabel();
        lbl_MatkhauHT = new javax.swing.JLabel();
        lbl_Matkhaumoi = new javax.swing.JLabel();
        lbl_XacnhanMK = new javax.swing.JLabel();
        spr1 = new javax.swing.JSeparator();
        spr2 = new javax.swing.JSeparator();
        spr3 = new javax.swing.JSeparator();
        spr4 = new javax.swing.JSeparator();
        btn_Huybo = new javax.swing.JButton();
        btn_Xacnhan = new javax.swing.JButton();

        setTitle("EduSys - Đổi Mật Khẩu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        pnl1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_DoiMK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_DoiMK.setForeground(new java.awt.Color(102, 102, 102));
        lbl_DoiMK.setText("ĐỔI MẬT KHẨU");

        txt_MaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_MaNV.setForeground(new java.awt.Color(255, 102, 102));
        txt_MaNV.setBorder(null);

        txt_Matkhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Matkhau.setForeground(new java.awt.Color(255, 102, 102));
        txt_Matkhau.setBorder(null);

        txt_MatkhauMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_MatkhauMoi.setForeground(new java.awt.Color(255, 102, 102));
        txt_MatkhauMoi.setBorder(null);

        txt_MatkhauMoi1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_MatkhauMoi1.setForeground(new java.awt.Color(255, 102, 102));
        txt_MatkhauMoi1.setBorder(null);

        lbl_TenDN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_TenDN.setForeground(new java.awt.Color(102, 102, 102));
        lbl_TenDN.setText("Tên Đăng Nhập");

        lbl_MatkhauHT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_MatkhauHT.setForeground(new java.awt.Color(102, 102, 102));
        lbl_MatkhauHT.setText("Mật Khẩu Hiện Tại");

        lbl_Matkhaumoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Matkhaumoi.setForeground(new java.awt.Color(102, 102, 102));
        lbl_Matkhaumoi.setText("Mật Khẩu Mới");

        lbl_XacnhanMK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_XacnhanMK.setForeground(new java.awt.Color(102, 102, 102));
        lbl_XacnhanMK.setText("Xác Nhận Mật Khẩu Mới");

        spr1.setBackground(new java.awt.Color(102, 102, 102));
        spr1.setForeground(new java.awt.Color(102, 102, 102));

        spr2.setBackground(new java.awt.Color(102, 102, 102));
        spr2.setForeground(new java.awt.Color(102, 102, 102));

        spr3.setBackground(new java.awt.Color(102, 102, 102));
        spr3.setForeground(new java.awt.Color(102, 102, 102));

        spr4.setBackground(new java.awt.Color(102, 102, 102));
        spr4.setForeground(new java.awt.Color(102, 102, 102));

        btn_Huybo.setBackground(new java.awt.Color(255, 255, 255));
        btn_Huybo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Huybo.setForeground(new java.awt.Color(102, 102, 102));
        btn_Huybo.setText("Hủy Bỏ");
        btn_Huybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyboActionPerformed(evt);
            }
        });

        btn_Xacnhan.setBackground(new java.awt.Color(102, 102, 102));
        btn_Xacnhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Xacnhan.setForeground(new java.awt.Color(255, 255, 255));
        btn_Xacnhan.setText("Xác Nhận");
        btn_Xacnhan.setBorder(null);
        btn_Xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XacnhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DoiMK)
                            .addGroup(pnl1Layout.createSequentialGroup()
                                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spr1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_MaNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(lbl_TenDN, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(35, 35, 35)
                                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spr2)
                                    .addComponent(txt_Matkhau, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(lbl_MatkhauHT))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spr4)
                            .addComponent(txt_MatkhauMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(lbl_Matkhaumoi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Xacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_XacnhanMK)
                            .addComponent(txt_MatkhauMoi1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(spr3)
                            .addComponent(btn_Huybo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Huybo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Xacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(lbl_DoiMK)
                        .addGap(27, 27, 27)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_TenDN)
                            .addComponent(lbl_MatkhauHT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spr2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                            .addComponent(spr1))
                        .addGap(35, 35, 35)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Matkhaumoi)
                            .addComponent(lbl_XacnhanMK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_MatkhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MatkhauMoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spr3, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                            .addComponent(spr4, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE))
                        .addGap(78, 78, 78)))
                .addGap(45, 45, 45))
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

    private void btn_HuyboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyboActionPerformed
        // TODO add your handling code here:
        this.huyBo();
    }//GEN-LAST:event_btn_HuyboActionPerformed

    private void btn_XacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XacnhanActionPerformed
        // TODO add your handling code here:
        this.doiMatKhau();
    }//GEN-LAST:event_btn_XacnhanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhau_Dialog dialog = new DoiMatKhau_Dialog(new java.awt.Frame(), true);
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
    private javax.swing.JButton btn_Huybo;
    private javax.swing.JButton btn_Xacnhan;
    private javax.swing.JLabel lbl_DoiMK;
    private javax.swing.JLabel lbl_MatkhauHT;
    private javax.swing.JLabel lbl_Matkhaumoi;
    private javax.swing.JLabel lbl_TenDN;
    private javax.swing.JLabel lbl_XacnhanMK;
    private javax.swing.JPanel pnl1;
    private javax.swing.JSeparator spr1;
    private javax.swing.JSeparator spr2;
    private javax.swing.JSeparator spr3;
    private javax.swing.JSeparator spr4;
    private javax.swing.JTextField txt_MaNV;
    private javax.swing.JPasswordField txt_Matkhau;
    private javax.swing.JPasswordField txt_MatkhauMoi;
    private javax.swing.JPasswordField txt_MatkhauMoi1;
    // End of variables declaration//GEN-END:variables

    private void init() {
        //chuyển Dialog ra giữa màn hình
        this.setLocationRelativeTo(null);
        //gọi hàm set icon tiêu đề
        this.setIconImage(XImage.getAppIcon());
    }

    private void doiMatKhau() {
        String manv = txt_MaNV.getText();
        String matKhau = new String(txt_Matkhau.getPassword());
        String matKhauMoi = new String(txt_MatkhauMoi.getPassword());
        String matKhauMoi1 = new String(txt_MatkhauMoi1.getPassword());
        if (!manv.equalsIgnoreCase(Auth.user.getMaNV())) {
            MsgBox.warning(this, "Sai Tên Đăng Nhập !");
        } else if (!matKhau.equals(Auth.user.getMatKhau())) {
            MsgBox.warning(this, "Sai Mật Khẩu !");
        } else if (!matKhauMoi.equals(matKhauMoi1)) {
            MsgBox.warning(this, "Xác Nhận Mật Khẩu Không Đúng !");
        } else if (matKhauMoi.equals("")) {
            MsgBox.warning(this, "Vui Lòng Nhập Mật Khẩu Mới !");
        } else if (matKhauMoi.equals(matKhau)) {
            MsgBox.warning(this, "CẢNH BÁO !!!\nMật Khẩu Mới Trùng Với Mật Khẩu Hiện Tại !\nĐể Đảm Bảo An Toàn Hãy Nhập Mật Khẩu Khác !");
        } else {
            Auth.user.setMatKhau(matKhauMoi);
            dao.update(Auth.user);
            MsgBox.alert(this, "Đổi Mật Khẩu Thành Công");
            this.dispose();
        }
    }

    private void huyBo() {
        this.dispose();
    }
}
