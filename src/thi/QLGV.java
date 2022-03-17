/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JosCongQuy
 */
public class QLGV extends javax.swing.JFrame {

    private List<GiaoVien> GV = new ArrayList<>();
    private DefaultTableModel tableModel = new DefaultTableModel();
    String[] gv = new String[]{"tên", "bộ môn", "lương"};

    /**
     * Creates new form QLGV
     */
    public QLGV() {
        initComponents();
      String[] gv = new String[]{"tên", "bộ môn", "lương"};
      tableModel.setColumnIdentifiers(gv);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtten = new javax.swing.JTextField();
        txtluong = new javax.swing.JTextField();
        nganh = new javax.swing.JComboBox();
        PNTMO = new javax.swing.JButton();
        BNTGHI = new javax.swing.JButton();
        BTNXOA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("QUẢN LÍ GIÁO VIÊN");

        jLabel3.setText("TÊN");

        jLabel4.setText("BỘ MÔN");

        jLabel5.setText("LƯƠNG");

        nganh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nganhActionPerformed(evt);
            }
        });

        PNTMO.setText("MỞ");
        PNTMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNTMOActionPerformed(evt);
            }
        });

        BNTGHI.setText("GHI");
        BNTGHI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTGHIActionPerformed(evt);
            }
        });

        BTNXOA.setText("XOÁ");
        BTNXOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNXOAActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TÊN", "BỘ MÔN", "LƯƠNG", "TRẠNG THÁI"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtten)
                            .addComponent(txtluong)
                            .addComponent(nganh, 0, 210, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BTNXOA)
                                .addComponent(PNTMO))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BNTGHI)
                                .addGap(6, 6, 6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel2)))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PNTMO))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BNTGHI)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(BTNXOA)
                        .addGap(74, 74, 74)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public  void ghi() {
       
        try {
           FileOutputStream   fileOutputStream = new FileOutputStream("D:\\thithu.txt");
            ObjectOutputStream os = new  ObjectOutputStream(fileOutputStream);
            os.writeObject(GV);
            os.close();
            JOptionPane.showMessageDialog(null, "ghi thành công", "thành công", JOptionPane.NO_OPTION);
            tableModel.setRowCount(0);
            tableModel.fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(QLGV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public  void mo() {
        FileInputStream fileInputStream = null;
        ObjectInputStream os =null;
        try {
            fileInputStream = new FileInputStream("D:\\thithu.txt");
            os= new ObjectInputStream(os);
            GV = (List<GiaoVien>) os.readObject();
            os.close();
            fileInputStream.close();
            filltable();
        } catch (Exception e) {
        }
    }
    private void PNTMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNTMOActionPerformed
        // TODO add your handling code here:
        StringBuilder ss = new StringBuilder();
        if(txtten.getText().isEmpty()){
        ss.append("tên không dc để trống\n");
        }
        if (txtluong.getText().isEmpty()) {
            ss.append("lương không được để trống");
        }
        if (ss.length()>0) {
            JOptionPane.showMessageDialog(null, ss.toString(), "lỗi", JOptionPane.ERROR_MESSAGE);
        }else{
        add();
        filltable();
        mo();
  
        }
    }//GEN-LAST:event_PNTMOActionPerformed
    public  void nganh() {
        String[] nganh = new String[]{
        "UD","DL","TKDH"
        };
        DefaultComboBoxModel<String> checkComboBoxModel = new DefaultComboBoxModel<>(nganh);
    }
    private void BNTGHIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTGHIActionPerformed
        // TODO add your handling code here:
        ghi();
    }//GEN-LAST:event_BNTGHIActionPerformed

    private void BTNXOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNXOAActionPerformed
        // TODO add your handling code here:
        xoa();
        filltable();
    }//GEN-LAST:event_BTNXOAActionPerformed

    private void nganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nganhActionPerformed
        // TODO add your handling code here:
        nganh();
    }//GEN-LAST:event_nganhActionPerformed
    public  boolean checkluong()  {
           try {
            double luong = Double.parseDouble(txtluong.getText());
            if (luong < 5) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nhập sai định dạng lương", "LỖI", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        GiaoVien tl = GV.get(row);
        txtten.setText(tl.getTen());
        txtluong.setText(tl.getLuong()+ "");
      

    }//GEN-LAST:event_jTable1MouseClicked
public void filltable() {
        tableModel.setRowCount(0);
        for (GiaoVien gv : GV) {
            Object[] aa = new Object[3];
            aa[0] = gv.getTen();
            aa[1] = gv.getMon();
            aa[2] = gv.getLuong();
            tableModel.addRow(aa);
        }
        tableModel.fireTableDataChanged();
    }

    public void add() {
        GiaoVien gv = new GiaoVien();
        gv.setTen(txtten.getText());
        gv.setLuong(Double.parseDouble(txtluong.getText()));
  
        GV.add(gv);
    }
    public  void xoa() {
        int index = jTable1.getSelectedRow();
        GV.remove(index);
    }
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
            java.util.logging.Logger.getLogger(QLGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLGV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNTGHI;
    private javax.swing.JButton BTNXOA;
    private javax.swing.JButton PNTMO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox nganh;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables
}
