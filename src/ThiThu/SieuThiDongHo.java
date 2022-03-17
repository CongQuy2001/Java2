/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiThu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JosCongQuy
 */
public class SieuThiDongHo extends javax.swing.JFrame {

    private DefaultTableModel tableModel = new DefaultTableModel();
    private List<DongHo> dongHos = new ArrayList<>();
    String[] dh = new String[]{"Tensp", "Gia", "Hãng"};
    private Object o1;

    /**
     * Creates new form SieuThiDongHo
     */
    public SieuThiDongHo() {
        initComponents();
        String[] sv = new String[]{"tên", "hãng", "giá"};
        tableModel.setColumnIdentifiers(sv);
        jTable1.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabeltime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        TXTtensp = new javax.swing.JTextField();
        TXTgia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BNTMO = new javax.swing.JButton();
        BNTSXTHEOTEN = new javax.swing.JButton();
        BNTSXTHEOGIA = new javax.swing.JButton();
        BNTGHI = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÍ ĐỒNG HỒ");

        jLabeltime.setText("HH:SS:AA");
        jLabeltime.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabeltimeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setText("TÊN SP");

        jLabel4.setText("GIÁ");

        jLabel5.setText("HÃNG");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "casio", "swat", "minibank", "thể thao" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "tên", "giá", "hãng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BNTMO.setText("MỞ");
        BNTMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTMOActionPerformed(evt);
            }
        });

        BNTSXTHEOTEN.setText("SẮP XẾP THEO TÊN");
        BNTSXTHEOTEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTSXTHEOTENActionPerformed(evt);
            }
        });

        BNTSXTHEOGIA.setText("SẮP XẾP THEO GIÁ");
        BNTSXTHEOGIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTSXTHEOGIAActionPerformed(evt);
            }
        });

        BNTGHI.setText("GHI");
        BNTGHI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTGHIActionPerformed(evt);
            }
        });

        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(559, Short.MAX_VALUE)
                        .addComponent(BNTGHI, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BNTMO, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTtensp)
                                    .addComponent(jComboBox1, 0, 319, Short.MAX_VALUE)
                                    .addComponent(TXTgia))
                                .addGap(119, 119, 119)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BNTSXTHEOTEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BNTSXTHEOGIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabeltime, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXTtensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BNTGHI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXTgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BNTMO))
                .addGap(29, 29, 29)
                .addComponent(BNTSXTHEOTEN)
                .addGap(26, 26, 26)
                .addComponent(BNTSXTHEOGIA)
                .addGap(0, 184, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabeltime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * xoá hết dữ liệu cũ trong table và thêm mới lại từ đầu (lấy ra bởi list dongHos)
     */
    public void filltable() {
        tableModel.setRowCount(0);
        for (DongHo dh : dongHos) {
            Object a[] = new Object[3];
            a[0] = dh.getTenSp();
            a[1] = dh.getHang();
            a[2] = dh.getGia();
            tableModel.addRow(a);
        }
        tableModel.fireTableDataChanged();
    }

    public void add() {
        DongHo dh = new DongHo();
        dh.setTenSp(TXTtensp.getText());
        dh.setGia(Double.parseDouble(TXTgia.getText()));
        dongHos.add(dh);
    }
    
    private void BNTGHIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTGHIActionPerformed
        Savefile();
    }//GEN-LAST:event_BNTGHIActionPerformed

    private void BNTSXTHEOTENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTSXTHEOTENActionPerformed
        // TODO add your handling code here:
            Collections.sort(dongHos, (o1, o2) -> (o1.getTenSp().compareTo(o2.getTenSp())));
          
            filltable();
    }//GEN-LAST:event_BNTSXTHEOTENActionPerformed
 
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        StringBuilder sp = new StringBuilder();
        if (TXTtensp.getText().isEmpty()) {
            sp.append("tên không dc dể trống\n");
        }
        if (TXTgia.getText().isEmpty()) {
            sp.append("giá không dc để trống");
        }
        if (sp.length() > 0) {
            JOptionPane.showMessageDialog(null, sp.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            add();
            filltable();
            TXTtensp.setText("");
            TXTgia.setText("");
        }
    }//GEN-LAST:event_btnThemActionPerformed
    public void Savefile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\thithu.txt");
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            os.writeObject(dongHos);
            os.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ero" + ex);
        } catch (IOException ex) {
            Logger.getLogger(SieuThiDongHo.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Ghi file thành công", "Thành công", JOptionPane.NO_OPTION);
        tableModel.setRowCount(0);
        tableModel.fireTableDataChanged();
    }

    public void openfile() {
        FileInputStream fileInputStream = null;
        ObjectInputStream obj = null;
        try {
            fileInputStream = new FileInputStream("D:\\thithu.txt");
            obj = new ObjectInputStream(fileInputStream);
            dongHos = (List<DongHo>) obj.readObject();
            obj.close();
            fileInputStream.close();
            filltable();
        } catch (Exception e) {
            System.out.println("eror" + e);
        }
    }
    private void BNTMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTMOActionPerformed
        // TODO add your handling code here:
        openfile();
    }//GEN-LAST:event_BNTMOActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabeltimeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabeltimeAncestorAdded
        // TODO add your handling code here:
        time tm = new time(jLabeltime);
        tm.start();
        jLabeltime.setEnabled(true);
    }//GEN-LAST:event_jLabeltimeAncestorAdded

    private void BNTSXTHEOGIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTSXTHEOGIAActionPerformed
        // TODO add your handling code here:
                Collections.sort(dongHos, (o1, o2) -> (o1.getGia()<= o2.getGia()? -1 : 1));
                filltable();
    }//GEN-LAST:event_BNTSXTHEOGIAActionPerformed

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
            java.util.logging.Logger.getLogger(SieuThiDongHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SieuThiDongHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SieuThiDongHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SieuThiDongHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SieuThiDongHo frame = new SieuThiDongHo();

                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNTGHI;
    private javax.swing.JButton BNTMO;
    private javax.swing.JButton BNTSXTHEOGIA;
    private javax.swing.JButton BNTSXTHEOTEN;
    private javax.swing.JTextField TXTgia;
    private javax.swing.JTextField TXTtensp;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabeltime;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}