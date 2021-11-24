/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;
import backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Lenovo
 */
public class FrmPeminjaman extends javax.swing.JFrame {
 private boolean cariData = false;
 /**
 * Creates new form FrmPeminjaman
 */
 public FrmPeminjaman() {
// initComponents();
 tampilkanData();
 kosongkanForm();
 }
 public void kosongkanForm() {
 txtId.setText("0");
 txtIdBuku.setText("");
 txtIdAnggota.setText("");
 labelNama.setText("Nama Anggota");
 labelJudul.setText("Judul Buku");
 txtTanggalPinjam.setText("");
 txtTanggalKembali.setText("");
 }
 public void tampilkanData() {
     String[] kolom = {"ID", "Nama Anggota", "Judul Buku", "Tanggal Pinjam", "Tanggal Kembali"};
 ArrayList<Peminjaman> list = new Peminjaman().getAll();
 Object rowData[] = new Object[5];
 tblPeminjaman.setModel(new DefaultTableModel(new Object[][]{}, kolom));
 for (int i = 0; i < list.size(); i++) {
 rowData[0] = list.get(i).getIdpeminjaman();
 rowData[1] = list.get(i).getAnggota().getNama();
 rowData[2] = list.get(i).getBuku().getJudul();
 rowData[3] = list.get(i).getTanggalpinjam();
 rowData[4] = list.get(i).getTanggalkembali();
 ((DefaultTableModel) tblPeminjaman.getModel()).addRow(rowData);
 }
 }
 public void cari(String keyword) {
 ArrayList<Peminjaman> listAnggota = new Peminjaman().searchAnggota(keyword);
 ArrayList<Peminjaman> listBuku = new Peminjaman().searchBuku(keyword);
 int keywords = Integer.parseInt(keyword);
 Anggota a = new Anggota().getById(keywords);
 Buku b = new Buku().getById(keywords);
 if (cariData) {
 if (a.getIdanggota() != 0) {
 for (Peminjaman pinjam : listAnggota) {
 labelNama.setText(pinjam.getAnggota().getNama());
 }
 } else {
 labelNama.setText("ID Anggota tidak ditemukan");
 }
 } else {
 if (b.getIdbuku() != 0) {
 for (Peminjaman pinjam : listBuku) {
 labelJudul.setText(pinjam.getBuku().getJudul());
 }
 }
 else {
 labelJudul.setText("ID Buku tidak ditemukan");
 } 
 }
 }
private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 Peminjaman pinjam = new Peminjaman();
 pinjam.setIdpeminjaman(Integer.parseInt(txtId.getText()));
 Anggota anggota = new Anggota().getById(Integer.parseInt(txtIdAnggota.getText()));
 pinjam.setAnggota(anggota);
 Buku buku = new Buku().getById(Integer.parseInt(txtIdBuku.getText()));
 pinjam.setBuku(buku);
 pinjam.setTanggalpinjam(txtTanggalPinjam.getText());
 pinjam.setTanggalkembali(txtTanggalKembali.getText());
 pinjam.save();
 txtId.setText(Integer.toString(pinjam.getIdpeminjaman()));
 tampilkanData();
 } 
 private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 DefaultTableModel model = (DefaultTableModel) tblPeminjaman.getModel();
 int row = tblPeminjaman.getSelectedRow();
 Peminjaman pinjam = new 
Peminjaman().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
 pinjam.delete();
 kosongkanForm();
 tampilkanData();
 } 
 private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 kosongkanForm();
 } 
 private void btnAnggotaActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 if (txtIdAnggota.getText().equals("")) {
 labelNama.setText("ID Anggota belum diisi");
 } else {
 cariData = true;
 cari(txtIdAnggota.getText());
 }
 } 
 private void btnBukuActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
    if (txtIdBuku.getText().equals("")) {
    labelJudul.setText("ID Buku belum diisi");
    } else {
    cariData = false;
    cari(txtIdBuku.getText());
    }
 } 
 private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) { 
 // TODO add your handling code here:
 DefaultTableModel model = (DefaultTableModel) tblPeminjaman.getModel();
 int row = tblPeminjaman.getSelectedRow();
 Peminjaman pinjam = new Peminjaman();
 pinjam = pinjam.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
 txtId.setText(String.valueOf(pinjam.getIdpeminjaman()));
 txtIdAnggota.setText(Integer.toString(pinjam.getAnggota().getIdanggota()));
 labelNama.setText(pinjam.getAnggota().getNama());
 txtIdBuku.setText(Integer.toString(pinjam.getBuku().getIdbuku()));
 labelJudul.setText(pinjam.getBuku().getJudul());
 txtTanggalPinjam.setText(pinjam.getTanggalpinjam());
 txtTanggalKembali.setText(pinjam.getTanggalkembali());
 }
public static void main(String args[]) {
 /* Set the Nimbus look and feel */
 //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
 /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and 
feel.
 * For details see 
http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
 */
 try {
 for (javax.swing.UIManager.LookAndFeelInfo info : 
javax.swing.UIManager.getInstalledLookAndFeels()) {
 if ("Nimbus".equals(info.getName())) {
 javax.swing.UIManager.setLookAndFeel(info.getClassName());
 break;
 }
 }
 } catch (ClassNotFoundException ex) {
 
java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.
Level.SEVERE, null, ex);
 } catch (InstantiationException ex) {
 
java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.
Level.SEVERE, null, ex);
 } catch (IllegalAccessException ex) {
 
java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.
Level.SEVERE, null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 
java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.
Level.SEVERE, null, ex);
 }
 //</editor-fold>
 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new FrmPeminjaman().setVisible(true);
 }
 });
 }
 // Variables declaration - do not modify 
 private javax.swing.JButton btnAnggota;
 private javax.swing.JButton btnBuku;
 private javax.swing.JButton btnHapus;
 private javax.swing.JButton btnSimpan;
 private javax.swing.JButton btnTambahBaru;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel5;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JLabel labelJudul;
 private javax.swing.JLabel labelJudul1;
 private javax.swing.JLabel labelJudul2;
 private javax.swing.JLabel labelNama;
 private javax.swing.JTable tblPeminjaman;
 private javax.swing.JTextField txtId;
 private javax.swing.JTextField txtIdAnggota;
 private javax.swing.JTextField txtIdBuku;
 private javax.swing.JTextField txtTanggalKembali;
 private javax.swing.JTextField txtTanggalPinjam;
}