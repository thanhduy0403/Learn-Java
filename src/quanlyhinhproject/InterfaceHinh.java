/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlyhinhproject;

import java.awt.Font;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class InterfaceHinh extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceHinh
     */
    DefaultTableModel model;
    DanhSachHinh dsh;

    public InterfaceHinh() {
        initComponents();
        myInit();
    }

    public void myInit() {
        setTitle("Quan Ly Hinh");
        setLocationRelativeTo(null);
        dsh = new DanhSachHinh();
        model = (DefaultTableModel) tbHinh.getModel();
        tbHinh.setModel(model);
        docFile();
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
        comBoBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHV = new javax.swing.JTextField();
        txtCanh1 = new javax.swing.JTextField();
        txtCanh2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHinh = new javax.swing.JTable();
        btThemMoi = new javax.swing.JButton();
        btInDS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Chon Loai Hinh");

        comBoBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comBoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hinh Vuong", "Hinh Chu Nhat" }));
        comBoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nhap Canh HV");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nhap Canh 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nhap Canh 1");

        txtHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHVActionPerformed(evt);
            }
        });

        txtCanh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCanh1ActionPerformed(evt);
            }
        });

        tbHinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Canh HV", "Canh 1", "Canh 2", "Chu Vi", "Dien Tich"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbHinh);

        btThemMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btThemMoi.setText("Them Moi");
        btThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemMoiActionPerformed(evt);
            }
        });

        btInDS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btInDS.setText("In Danh Sach");
        btInDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInDSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCanh1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCanh2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtHV, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(comBoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btThemMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(btInDS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comBoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCanh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCanh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addComponent(btThemMoi)
                .addGap(29, 29, 29)
                .addComponent(btInDS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comBoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoBoxActionPerformed

    private void txtHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHVActionPerformed

    private void txtCanh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCanh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCanh1ActionPerformed

    private void btThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemMoiActionPerformed
        if (comBoBox.getSelectedIndex() == 0) {
            HinhVuong hv = nhapHV();
            dsh.themHinh(hv);
            them1DongVaoTable(hv);
        } else {
            HinhChuNhat hcn = nhapHCN();
            dsh.themHinh(hcn);
            them1DongVaoTable(hcn);
        }
    }//GEN-LAST:event_btThemMoiActionPerformed

    private void btInDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInDSActionPerformed
        inDSHinh();
    }//GEN-LAST:event_btInDSActionPerformed

    // them du lieu vao table
    public void them1DongVaoTable(IHinh hinh) {
        if (hinh instanceof HinhVuong) {
            model.addRow(new Object[]{((HinhVuong) hinh).getCanh(), "", "",
                hinh.tinhChuVi(), hinh.tinhDienTich()});
        } else {
            HinhChuNhat hcn = (HinhChuNhat) hinh;
            model.addRow(new Object[]{"", hcn.getCanh1(), hcn.getCanh2(),
                hcn.tinhChuVi(), hcn.tinhDienTich()});
        }
    }

    // nhap data vao cac input
    public HinhVuong nhapHV() {
        double canh = Double.parseDouble(txtHV.getText());
        HinhVuong hv = new HinhVuong(canh);
        return hv;
    }

    public HinhChuNhat nhapHCN() {
        double chieuDai = Double.parseDouble(txtCanh1.getText());
        double chieuRong = Double.parseDouble(txtCanh2.getText());
        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuDai);
        return hcn;
    }

    public void inDSHinh() {
        for (IHinh ih : dsh.arr) {
            them1DongVaoTable(ih);
        }
    }

    public void xoaBang() {
        int n = tbHinh.getRowCount();
        for (int i = n; i > 0; i--) {
            model.removeRow(i - 1);
        }
    }

    //doc file
    public void docFile() {
        dsh.docFile("dshinh.txt");

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
            java.util.logging.Logger.getLogger(InterfaceHinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceHinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceHinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceHinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceHinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInDS;
    private javax.swing.JButton btThemMoi;
    private javax.swing.JComboBox<String> comBoBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHinh;
    private javax.swing.JTextField txtCanh1;
    private javax.swing.JTextField txtCanh2;
    private javax.swing.JTextField txtHV;
    // End of variables declaration//GEN-END:variables
}
