/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import control.ChiNhanhDAO;
import control.NhanVienDAO;
import java.sql.SQLException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChiNhanh;
import model.NhanVien;

/**
 *
 * @author HP
 */
public class GDQLNV extends javax.swing.JFrame {

    private NhanVienDAO nhanVienDAO = new NhanVienDAO();

    public GDQLNV() {
        initComponents();
        showChiNhanh();
        btnLuuSua.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jTabbedPaneThemNV = new javax.swing.JTabbedPane();
        jpanelQuanliNhanvien = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDSNhanVien = new javax.swing.JTable();
        btnXoaNhanVien = new javax.swing.JButton();
        btnSuaNhanVien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnXemDSNhanvien = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanelThemNhanVien1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtCMTNhanvien = new javax.swing.JTextField();
        txtSDTNhanvien = new javax.swing.JTextField();
        txtNgaySinhNV = new javax.swing.JTextField();
        txtDiaChiNV = new javax.swing.JTextField();
        txtChucVuNV = new javax.swing.JTextField();
        cbChiNhanh = new javax.swing.JComboBox<>();
        btnLuu = new javax.swing.JButton();
        btnLuuSua = new javax.swing.JButton();

        jTextField5.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbDSNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên", "SDT", "CMT", "Ngày sinh", "Địa chỉ", "Chức vụ", "Chi nhánh"
            }
        ));
        tbDSNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSNhanVienMouseCick(evt);
            }
        });
        jScrollPane2.setViewportView(tbDSNhanVien);
        tbDSNhanVien.getAccessibleContext().setAccessibleDescription("");

        btnXoaNhanVien.setText("Xóa nhân viên");
        btnXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNhanVienActionPerformed(evt);
            }
        });

        btnSuaNhanVien.setText("Sửa thông tin nhân viên");
        btnSuaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNhanVienActionPerformed(evt);
            }
        });

        jLabel1.setText("DANH SÁCH SINH VIÊN");

        btnXemDSNhanvien.setText("Xem toàn bộ nhân viên");
        btnXemDSNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDSNhanvienActionPerformed(evt);
            }
        });

        jLabel9.setText("THÊM/SỬA NHÂN VIÊN");

        jLabel10.setText("Tên nhân viên");

        jLabel11.setText("Số điện thoại");

        jLabel12.setText("Chứng minh thư");

        jLabel13.setText("Ngày sinh");

        jLabel14.setText("Địa chỉ");

        jLabel15.setText("Chức vụ");

        jLabel16.setText("Chi nhánh");

        btnLuu.setText("LƯU THÊM");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnLuuSua.setText("LƯU SỬA");
        btnLuuSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelThemNhanVien1Layout = new javax.swing.GroupLayout(jPanelThemNhanVien1);
        jPanelThemNhanVien1.setLayout(jPanelThemNhanVien1Layout);
        jPanelThemNhanVien1Layout.setHorizontalGroup(
            jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThemNhanVien1Layout.createSequentialGroup()
                .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelThemNhanVien1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(28, 28, 28)
                        .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChucVuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCMTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbChiNhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelThemNhanVien1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnLuuSua, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanelThemNhanVien1Layout.setVerticalGroup(
            jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThemNhanVien1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSDTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCMTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtNgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDiaChiNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtChucVuNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbChiNhanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelThemNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLuuSua, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanelQuanliNhanvienLayout = new javax.swing.GroupLayout(jpanelQuanliNhanvien);
        jpanelQuanliNhanvien.setLayout(jpanelQuanliNhanvienLayout);
        jpanelQuanliNhanvienLayout.setHorizontalGroup(
            jpanelQuanliNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelQuanliNhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelQuanliNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelQuanliNhanvienLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelQuanliNhanvienLayout.createSequentialGroup()
                        .addGroup(jpanelQuanliNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jPanelThemNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelQuanliNhanvienLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnXemDSNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnXoaNhanVien)
                .addGap(106, 106, 106)
                .addComponent(btnSuaNhanVien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpanelQuanliNhanvienLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jpanelQuanliNhanvienLayout.setVerticalGroup(
            jpanelQuanliNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelQuanliNhanvienLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanelQuanliNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXemDSNhanvien)
                    .addComponent(btnXoaNhanVien)
                    .addComponent(btnSuaNhanVien))
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelThemNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneThemNV.addTab("Quản lí nhân viên", jpanelQuanliNhanvien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneThemNV)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuSuaActionPerformed
        try {
            NhanVienDAO nvDAO = new NhanVienDAO();

            String tenNV = txtTenNV.getText();
            String sdt = txtSDTNhanvien.getText();
            String cmt = txtCMTNhanvien.getText();
            String ngaysinh = txtNgaySinhNV.getText();
            String diaChi = txtDiaChiNV.getText();
            String chucvu = txtChucVuNV.getText();
            String machinhanh = cbChiNhanh.getSelectedItem().toString().split(". ")[0];

            int machinhanh2 = Integer.parseInt(machinhanh);
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date ngaysinh2 = format.parse(ngaysinh);

            NhanVien nv = new NhanVien(tenNV, sdt, cmt, ngaysinh2, diaChi, chucvu, machinhanh2);

            int index = chonNhanVien();
            if (nvDAO.suaNhanVien(index, nv)) {
                JOptionPane.showMessageDialog(this, "Sửa thành công!");

                txtTenNV.setText("");
                txtSDTNhanvien.setText("");
                txtCMTNhanvien.setText("");
                txtNgaySinhNV.setText("");
                txtDiaChiNV.setText("");
                txtChucVuNV.setText("");

                List<NhanVien> listNV = nvDAO.getAllNhanvien();
                hienThiDSNhanVien(listNV);
                btnLuuSua.setVisible(false);
                btnLuu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Có lỗi xảy ra!");
            }
        } catch (ParseException ex) {
            Logger.getLogger(GDQLNV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLuuSuaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        try {
            NhanVienDAO nvDAO = new NhanVienDAO();

            String tenNV = txtTenNV.getText();
            String sdt = txtSDTNhanvien.getText();
            String cmt = txtCMTNhanvien.getText();
            String ngaysinh = txtNgaySinhNV.getText();
            String diaChi = txtDiaChiNV.getText();
            String chucvu = txtChucVuNV.getText();
            String machinhanh = cbChiNhanh.getSelectedItem().toString().split(". ")[0];

            int machinhanh2 = Integer.parseInt(machinhanh);
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date ngaysinh2 = format.parse(ngaysinh);

            NhanVien nv = new NhanVien(tenNV, sdt, cmt, ngaysinh2, diaChi, chucvu, machinhanh2);

            if (nvDAO.themNhanVien(nv)) {
                List<NhanVien> listNV = nvDAO.getAllNhanvien();
                hienThiDSNhanVien(listNV);
                JOptionPane.showMessageDialog(this, "Thêm thành công");

                txtTenNV.setText("");
                txtSDTNhanvien.setText("");
                txtCMTNhanvien.setText("");
                txtNgaySinhNV.setText("");
                txtDiaChiNV.setText("");
                txtChucVuNV.setText("");
            }
        } catch (ParseException ex) {
             JOptionPane.showMessageDialog(this, "Có lỗi xảy ra!");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXemDSNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDSNhanvienActionPerformed
        NhanVienDAO nvDAO = new NhanVienDAO();
        List<NhanVien> dsNhanViens = nvDAO.getAllNhanvien();
        hienThiDSNhanVien(dsNhanViens);
    }//GEN-LAST:event_btnXemDSNhanvienActionPerformed

    private void btnSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNhanVienActionPerformed
        try {
            layNhanVienTuBang();
            btnLuuSua.setVisible(true);
            btnLuu.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra!");
        }
    }//GEN-LAST:event_btnSuaNhanVienActionPerformed

    private void btnXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNhanVienActionPerformed
        try {
            NhanVienDAO nvDAO = new NhanVienDAO();
            int index = chonNhanVien();
            if (nvDAO.xoaNhanVien(index)) {
                List<NhanVien> listNV = nvDAO.getAllNhanvien();
                hienThiDSNhanVien(listNV);
                JOptionPane.showMessageDialog(this, "Xóa thành công");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra!");
        }
    }//GEN-LAST:event_btnXoaNhanVienActionPerformed

    private void tbDSNhanVienMouseCick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSNhanVienMouseCick

    }//GEN-LAST:event_tbDSNhanVienMouseCick

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
            java.util.logging.Logger.getLogger(GDQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GDQLNV().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnLuuSua;
    private javax.swing.JButton btnSuaNhanVien;
    private javax.swing.JButton btnXemDSNhanvien;
    private javax.swing.JButton btnXoaNhanVien;
    private javax.swing.JComboBox<String> cbChiNhanh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelThemNhanVien1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneThemNV;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel jpanelQuanliNhanvien;
    private javax.swing.JTable tbDSNhanVien;
    private javax.swing.JTextField txtCMTNhanvien;
    private javax.swing.JTextField txtChucVuNV;
    private javax.swing.JTextField txtDiaChiNV;
    private javax.swing.JTextField txtNgaySinhNV;
    private javax.swing.JTextField txtSDTNhanvien;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables

    private void showChiNhanh() {
        ChiNhanhDAO chiNhanhDAO = new ChiNhanhDAO();
        List<ChiNhanh> chiNhanhs = chiNhanhDAO.getAllChiNhanh();
        for (ChiNhanh cn : chiNhanhs) {
            cbChiNhanh.addItem(cn.getID() + ". " + cn.getTenChiNhanh());
        }
    }

    private int chonNhanVien() {
        int Row = tbDSNhanVien.getSelectedRow();
        int maNV = (int) tbDSNhanVien.getValueAt(Row, 0);
        return maNV;
    }

    private void layNhanVienTuBang() {
        //lay thonng tin nhan
        int Row = tbDSNhanVien.getSelectedRow();
        String tennv = (String) tbDSNhanVien.getValueAt(Row, 1);
        String sdt = (String) tbDSNhanVien.getValueAt(Row, 2);
        String cmt = (String) tbDSNhanVien.getValueAt(Row, 3);
        Date ngaysinh = (java.sql.Date) tbDSNhanVien.getValueAt(Row, 4);
        String diaChi = (String) tbDSNhanVien.getValueAt(Row, 5);
        String chucvu = (String) tbDSNhanVien.getValueAt(Row, 6);

        //hien thi thong tin nv
        txtTenNV.setText(tennv);
        txtSDTNhanvien.setText(sdt);
        txtCMTNhanvien.setText(cmt);
        txtNgaySinhNV.setText(ngaysinh.toString());
        txtDiaChiNV.setText(diaChi);
        txtChucVuNV.setText(chucvu);

    }

    private void hienThiDSNhanVien(List<NhanVien> listNV) {
        DefaultTableModel model = (DefaultTableModel) tbDSNhanVien.getModel();
        model.setRowCount(0);
        for (NhanVien nv : listNV) {
            model.addRow(new Object[]{nv.getID(), nv.getTen(), nv.getSdt(),
                nv.getCMT(), nv.getNgaySinh(), nv.getDiaChi(), nv.getChucVu(), nv.getChiNhanh()});
        }
    }
}
