/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Color;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author JosCongQuy
 */
public class QLNV extends javax.swing.JFrame {

    /**
     * Creates new form QLNV
     */
    public QLNV() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bntKiemtra = new javax.swing.JButton();
        txtluong = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jLabelNgaysinh = new javax.swing.JLabel();
        jLabelLuong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Quản Lí Nhân Viên");

        bntKiemtra.setText("Kiểm tra");
        bntKiemtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntKiemtraActionPerformed(evt);
            }
        });

        txtluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtluongActionPerformed(evt);
            }
        });

        txtngaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaysinhActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabelName.setText("Họ Và Tên");

        jLabelNgaysinh.setText("Ngày Sinh");

        jLabelLuong.setText("SaLaRy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName)
                            .addComponent(jLabelNgaysinh)
                            .addComponent(jLabelLuong))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(txtngaysinh)
                            .addComponent(txtluong)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(bntKiemtra)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNgaysinh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLuong))
                .addGap(49, 49, 49)
                .addComponent(bntKiemtra)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntKiemtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntKiemtraActionPerformed
        // TODO add your handling code here:

        Kiemtra();

    }//GEN-LAST:event_bntKiemtraActionPerformed

    private void txtluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtluongActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtngaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaysinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaysinhActionPerformed

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
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntKiemtra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLuong;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNgaysinh;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtngaysinh;
    // End of variables declaration//GEN-END:variables

    private void Kiemtra() {
        String Usename = txtname.getText();
        String NgaySinh = txtngaysinh.getText();
        String Salary = txtluong.getText();
        KiemTraloiisEmpty();
        checkNgaySinh();
        checkluong();
    }

    private void checkluong() throws HeadlessException {
        try {
            double salary = Double.parseDouble(txtluong.getText());
            if (salary < 0) {
                JOptionPane.showMessageDialog(null, "lương có giá trị không hợp lệ phải lớn hơn 0");
       txtluong.setBackground(Color.YELLOW);
          
            }else txtluong.setBackground(Color.WHITE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lương có giá trị không hợp lệ phải là 1 số");
        }
    }

    private void checkNgaySinh() throws HeadlessException {
        SimpleDateFormat fomater = new SimpleDateFormat();
        fomater.applyPattern("dd-mm-yyyy");
        try {
//            Date checkNgaySinh = fomater.parse(txtngaysinh.getText());
            XDate xd = new XDate();
            xd.Parse(txtngaysinh.getText(), "dd-mm-yyyy");
            txtngaysinh.setBackground(Color.WHITE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ngày tháng không đúng định dạng");
            txtngaysinh.setBackground(Color.YELLOW);
        }
    }

    private void KiemTraloiisEmpty() throws HeadlessException {
        StringBuilder sb = new StringBuilder();
        if (txtname.getText().isEmpty()) {
            sb.append("Họ Và tên không được để trống\n");
            txtname.setBackground(Color.red);
        }else {txtname.setBackground(Color.WHITE);}
        if (txtngaysinh.getText().isEmpty()) {
            sb.append("Ngày sinh không được để trống\n");
            txtngaysinh.setBackground(Color.red);
        }
        if (txtluong.getText().isEmpty()) {
            sb.append("lương không được để trống");
            txtluong.setBackground(Color.red);
        }
          if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    
        }
    }
}
