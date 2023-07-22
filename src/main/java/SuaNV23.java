
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Giang
 */
public class SuaNV23 extends javax.swing.JFrame {

    /**
     * Creates new form SuaNV23
     */
    public SuaNV23() {
        initComponents();
    }

    public void setChinhSua(String manv, String tennv, String chucvu, String gioitinh, String ngaysinh, String quequan) {

        ChuaMa.setText(manv);
        ChuaMa.setEditable(false);
        chuaTen.setText(tennv);
        ChuaChucVu.setText(chucvu);
        ChuaGioiTinh.setText(gioitinh);
        ChuaNgaySinh.setText(ngaysinh);
        ChuaQueQuan.setText(quequan);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Ma = new javax.swing.JLabel();
        chuaTen = new javax.swing.JTextField();
        ChuaChucVu = new javax.swing.JTextField();
        ChuaGioiTinh = new javax.swing.JTextField();
        ChuaNgaySinh = new javax.swing.JTextField();
        ChuaQueQuan = new javax.swing.JTextField();
        Tentxt = new javax.swing.JLabel();
        ChucVutxt = new javax.swing.JLabel();
        GioiTinhtxt = new javax.swing.JLabel();
        NgaySinhtxt = new javax.swing.JLabel();
        QueQuanTxt = new javax.swing.JLabel();
        CapNhat = new javax.swing.JButton();
        HuyTxt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ChuaMa = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ma.setText("MANV");

        chuaTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuaTenActionPerformed(evt);
            }
        });

        ChuaGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuaGioiTinhActionPerformed(evt);
            }
        });

        Tentxt.setText("TenNv");

        ChucVutxt.setText("ChucVu");

        GioiTinhtxt.setText("GioiTinh");

        NgaySinhtxt.setText("NgaySinh");

        QueQuanTxt.setText("QueQuan");

        CapNhat.setText("CapNhat");
        CapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CapNhatMouseClicked(evt);
            }
        });
        CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapNhatActionPerformed(evt);
            }
        });

        HuyTxt.setText("Huy");
        HuyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Chỉnh Sửa Nhân Viên");

        ChuaMa.setEditable(false);
        ChuaMa.setBackground(new java.awt.Color(204, 204, 204));
        ChuaMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuaMaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tentxt)
                            .addComponent(ChucVutxt)
                            .addComponent(GioiTinhtxt)
                            .addComponent(NgaySinhtxt)
                            .addComponent(QueQuanTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CapNhat)
                                .addGap(47, 47, 47)
                                .addComponent(HuyTxt))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ChuaQueQuan, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ChuaNgaySinh, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ChuaGioiTinh, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ChuaChucVu, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chuaTen, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Ma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChuaMa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ma)
                    .addComponent(ChuaMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chuaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tentxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChuaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChucVutxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChuaGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GioiTinhtxt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChuaNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgaySinhtxt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChuaQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QueQuanTxt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CapNhat)
                    .addComponent(HuyTxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChuaGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuaGioiTinhActionPerformed

    }//GEN-LAST:event_ChuaGioiTinhActionPerformed

    private void CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapNhatActionPerformed
        
        String ma = ChuaMa.getText();
        String ten = chuaTen.getText();
        String chucvu = ChuaChucVu.getText();
        String gioitinh = ChuaGioiTinh.getText();
        String ngaysinh = ChuaNgaySinh.getText();
        String quequan = ChuaQueQuan.getText();
        
        QuanLy.SuaNV(ma, ten, chucvu, gioitinh, ngaysinh, quequan);
        
        setVisible(false);

    }//GEN-LAST:event_CapNhatActionPerformed

    private void HuyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyTxtActionPerformed
        chuaTen.setText("");
        ChuaChucVu.setText("");
        ChuaGioiTinh.setText("");
        ChuaNgaySinh.setText("");
        ChuaQueQuan.setText("");


    }//GEN-LAST:event_HuyTxtActionPerformed

    private void CapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CapNhatMouseClicked

    }//GEN-LAST:event_CapNhatMouseClicked

    private void chuaTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuaTenActionPerformed

    }//GEN-LAST:event_chuaTenActionPerformed

    private void ChuaMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuaMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChuaMaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuaNV23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaNV23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaNV23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaNV23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaNV23().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CapNhat;
    private javax.swing.JTextField ChuaChucVu;
    private javax.swing.JTextField ChuaGioiTinh;
    private javax.swing.JTextField ChuaMa;
    private javax.swing.JTextField ChuaNgaySinh;
    private javax.swing.JTextField ChuaQueQuan;
    private javax.swing.JLabel ChucVutxt;
    private javax.swing.JLabel GioiTinhtxt;
    private javax.swing.JButton HuyTxt;
    private javax.swing.JLabel Ma;
    private javax.swing.JLabel NgaySinhtxt;
    private javax.swing.JLabel QueQuanTxt;
    private javax.swing.JLabel Tentxt;
    private javax.swing.JTextField chuaTen;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}