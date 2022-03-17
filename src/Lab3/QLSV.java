package Lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLSV extends javax.swing.JFrame {

    private List<Student> list = new ArrayList<>();
    private DefaultTableModel tblModel = new DefaultTableModel();

    public QLSV() {
        initComponents();
        this.setLocationRelativeTo(null);
        iniTable();
        fillTable();
        initNganh();
    }

    
    private void fillTable() {
        tblModel.setRowCount(0);//xóa các hàng trong bảng
        for (Student student : list) {
            tblModel.addRow(new Object[]{student.getName(), student.getDiem(), student.getNganh(), student.getGrade(), (student.isBonus()) ? "Có thưởng" : "Không thưởng"
            });
        }
//        tblModel.fireTableDataChanged();//cập nhật dữ liệu được hiển thị lên bảng
        
    }
//viet phuong thuc khoi tao table model

    private void iniTable() {
        String[] columns = new String[]{"HỌ VÀ TÊN", "ĐIỂM", "NGÀNH", "HỌC LỰC", "THƯỞNG"};
        tblModel.setColumnIdentifiers(columns);

     
        list.add(new Student("Cao Tuấn Anh", 8, "Ứng dụng phần mềm"));
        list.add(new Student("Bùi Đức Quảng", 8, "Thiết kế đồ họa"));
        list.add(new Student("Bùi Thùy Linh", 7, "Khách sạn"));
        list.add(new Student("Hoàng Tuấn Vũ", 9, "Du lịch"));
        list.add(new Student("Nguyễn Hoàng Thúy", 5, "Thiết kế đồ họa"));
        tblStudent.setModel(tblModel);//thiết lập model cho bảng
    }

    private void initNganh() {

        String[] nganh = new String[]{
            "Thiết kế đồ họa", "Ứng dụng phần mềm", "Du lịch"
        };
        DefaultComboBoxModel<String> cbxModel = new DefaultComboBoxModel<>(nganh); //add 
        cbxNganh.setModel(cbxModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ftxDiem = new javax.swing.JFormattedTextField();
        cbxNganh = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        txtHocLuc = new javax.swing.JTextField();
        chkBounes = new javax.swing.JCheckBox();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        btnSxten = new javax.swing.JButton();
        btnSxdiem = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 6, 0));
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setText("HỌ VÀ TÊN");

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        jLabel3.setText("ĐIỂM");

        jLabel4.setText("NGÀNH");

        cbxNganh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNganhActionPerformed(evt);
            }
        });

        jLabel5.setText("HỌC LỰC");

        txtHocLuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHocLucActionPerformed(evt);
            }
        });

        chkBounes.setText("Có phần thưởng?");
        chkBounes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBounesActionPerformed(evt);
            }
        });

        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("CẬP NHẬT");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnNhapMoi.setText("NHẬP MỚI");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen)
                    .addComponent(ftxDiem)
                    .addComponent(txtHocLuc)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkBounes)
                            .addComponent(cbxNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCapNhat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNhapMoi)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkBounes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnNhapMoi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStudent);

        btnSxten.setText("Sắp xếp theo tên");
        btnSxten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSxtenActionPerformed(evt);
            }
        });

        btnSxdiem.setText("Sắp xếp theo điểm");
        btnSxdiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSxdiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSxten)
                        .addGap(18, 18, 18)
                        .addComponent(btnSxdiem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSxten)
                    .addComponent(btnSxdiem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        StringBuilder sb = new StringBuilder();
        if (txtHoTen.getText().equals("")) {
            sb.append("Họ và tên không được để trống!!!\n");
        }
        if (ftxDiem.getText().equals("")) {
            sb.append("Điểm không được để trống!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
  
        Student student = new Student();
        student.setName(txtHoTen.getText());
        student.setDiem(Float.parseFloat(ftxDiem.getText()));
        student.setNganh(cbxNganh.getSelectedItem().toString());

        list.add(student);
        fillTable();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtHoTen.getText().equals("")) {
            sb.append("Họ và tên không được để trống!!!\n");
        }
        if (ftxDiem.getText().equals("")) {
            sb.append("Điểm không được để trống!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
           
            return;
        }

        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Xác nhận lại", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        }

        for (Student student : list) {
            if (student.getName().equals(txtHoTen.getText())) {
                list.remove(student);
                break;
            }
        }
        fillTable();
        btnNhapMoiActionPerformed(evt);//xoá trắng hết
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtHoTen.getText().equals("")) {
            sb.append("Họ và tên không được để trống!!!\n");
        }
        if (ftxDiem.getText().equals("")) {
            sb.append("Điểm không được để trống!!!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật không?", "Xác nhận lại", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        }
        for (Student student : list) {
            if (student.getName().equals(txtHoTen.getText())) {
                student.setName((txtHoTen.getText()));
                student.setDiem(Float.parseFloat(ftxDiem.getText()));
                student.setNganh(cbxNganh.getSelectedItem().toString());
                break;
            }
        }
        fillTable();
        btnNhapMoiActionPerformed(evt);
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        // TODO add your handling code here:
        txtHoTen.setText("");
        txtHocLuc.setText("");
        ftxDiem.setText("");
        chkBounes.setSelected(false);
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void tblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblStudent.getSelectedRow();
        if (selectedRow >= 0) {
            String st = (String) tblStudent.getValueAt(selectedRow, 0);
            for (Student student : list) {
                if (st.equals(student.getName())) {
                    txtHoTen.setText(student.getName());
                    ftxDiem.setText("" + student.getDiem());
                    cbxNganh.setSelectedItem(student.getNganh());
                    txtHocLuc.setText(student.getGrade());
                    chkBounes.setSelected(student.isBonus());
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblStudentMouseClicked

    private void cbxNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNganhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNganhActionPerformed

    private void btnSxtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSxtenActionPerformed
        // TODO add your handling code here:
        Collections.sort(list, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
        fillTable();
    }//GEN-LAST:event_btnSxtenActionPerformed

    private void btnSxdiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSxdiemActionPerformed
        // TODO add your handling code here:
        Collections.sort(list, (o1, o2) -> (o1.getDiem() <= o2.getDiem() ? -1 : 1));
        fillTable();
    }//GEN-LAST:event_btnSxdiemActionPerformed

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void chkBounesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBounesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkBounesActionPerformed

    private void txtHocLucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHocLucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHocLucActionPerformed

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
            java.util.logging.Logger.getLogger(QLSV.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnSxdiem;
    private javax.swing.JButton btnSxten;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxNganh;
    private javax.swing.JCheckBox chkBounes;
    private javax.swing.JFormattedTextField ftxDiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtHocLuc;
    // End of variables declaration//GEN-END:variables
}
