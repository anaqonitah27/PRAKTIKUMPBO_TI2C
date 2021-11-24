/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class Peminjaman {
    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tanggalpinjam;
    private String tanggalkembali;
 
    public int getIdpeminjaman() {
        return idpeminjaman;
    }
    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }
    public Anggota getAnggota() {
        return anggota;
    }
    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }
    public Buku getBuku() {
        return buku;
    }
    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    public String getTanggalpinjam() {
        return tanggalpinjam;
    }
    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }
    public String getTanggalkembali() {
        return tanggalkembali;
    }
    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public Peminjaman(){

    }

    public Peminjaman(Anggota anggota, Buku buku, String tanggalpinjam, String tanggalkembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }

    public Peminjaman getById(int idpeminjaman) {
        Peminjaman peminjamanAna = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            + " p.idpeminjaman AS idpeminjaman, "
                                            + " p.tanggalpinjam AS tanggalpinjam, "
                                            + " p.tanggalkembali AS tanggalkembali, "
                                            + " a.idanggota AS idanggota, "
                                            + " a.nama AS nama, "
                                            + " a.alamat AS alamat, "
                                            + " a.telepon AS telepon, "
                                            + " b.idbuku AS idbuku, "
                                            + " b.idkategori AS idkategori, "
                                            + " b.judul AS judul, "
                                            + " b.penerbit AS penerbit, "
                                            + " b.penulis AS penulis "
                                            + " FROM peminjaman p "
                                            + " LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                            + " LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                            + " WHERE p.idpeminjaman = '" + idpeminjaman + "'");
        try {
            while(rs.next()){
                peminjamanAna = new Peminjaman();
                peminjamanAna.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjamanAna.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjamanAna.getAnggota().setNama(rs.getString("nama"));
                peminjamanAna.getAnggota().setAlamat(rs.getString("alamat"));
                peminjamanAna.getAnggota().setTelepon(rs.getString("telepon"));
                peminjamanAna.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjamanAna.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                peminjamanAna.getBuku().setJudul(rs.getString("judul"));
                peminjamanAna.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjamanAna.getBuku().setPenulis(rs.getString("penulis"));
                peminjamanAna.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjamanAna.setTanggalkembali(rs.getString("tanggalkembali"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return peminjamanAna;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPinjam = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            + " p.idpeminjaman AS idpeminjaman, "
                                            + " p.tanggalpinjam AS tanggalpinjam, "
                                            + " p.tanggalkembali AS tanggalkembali, "
                                            + " a.idanggota AS idanggota, "
                                            + " a.nama AS nama, "
                                            + " a.alamat AS alamat, "
                                            + " a.telepon AS telepon, "
                                            + " b.idbuku AS idbuku, "
                                            + " b.idkategori AS idkategori, "
                                            + " b.judul AS judul, "
                                            + " b.penerbit AS penerbit, "
                                            + " b.penulis AS penulis "
                                            + " FROM peminjaman p "
                                            + " LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                            + " LEFT JOIN buku b ON p.idbuku = b.idbuku ");
        try {
            while(rs.next()){
                Peminjaman peminjamanAna = new Peminjaman();
                peminjamanAna.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjamanAna.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjamanAna.getAnggota().setNama(rs.getString("nama"));
                peminjamanAna.getAnggota().setAlamat(rs.getString("alamat"));
                peminjamanAna.getAnggota().setTelepon(rs.getString("telepon"));
                peminjamanAna.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjamanAna.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                peminjamanAna.getBuku().setJudul(rs.getString("judul"));
                peminjamanAna.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjamanAna.getBuku().setPenulis(rs.getString("penulis"));
                peminjamanAna.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjamanAna.setTanggalkembali(rs.getString("tanggalkembali"));

                ListPinjam.add(peminjamanAna);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
            return ListPinjam;
    }

    public ArrayList<Peminjaman> searchBuku(String keyword) {
        ArrayList<Peminjaman> ListPinjam = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            + " p.idpeminjaman AS idpeminjaman, "
                                            + " p.tanggalpinjam AS tanggalpinjam, "
                                            + " p.tanggalkembali AS tanggalkembali, "
                                            + " a.idanggota AS idanggota, "
                                            + " a.nama AS nama, "
                                            + " b.idbuku AS idbuku, "
                                            + " b.idkategori AS idkategori, "
                                            + " b.judul AS judul, "
                                            + " b.penerbit AS penerbit, "
                                            + " b.penulis AS penulis "
                                            + " FROM peminjaman p "
                                            + " RIGHT JOIN buku b ON p.idbuku = b.idbuku "
                                            + " LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                            + " WHERE b.idbuku LIKE '%" + keyword + "%' ");
        try {
            while(rs.next()){
                Peminjaman peminjamanAna = new Peminjaman();
                peminjamanAna.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjamanAna.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjamanAna.getAnggota().setNama(rs.getString("nama"));
                peminjamanAna.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjamanAna.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                peminjamanAna.getBuku().setJudul(rs.getString("judul"));
                peminjamanAna.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjamanAna.getBuku().setPenulis(rs.getString("penulis"));
                peminjamanAna.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjamanAna.setTanggalkembali(rs.getString("tanggalkembali"));

                ListPinjam.add(peminjamanAna);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
            return ListPinjam;
        }

    public ArrayList<Peminjaman> searchAnggota(String keyword) {
        ArrayList<Peminjaman> ListPinjam = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            + " p.idpeminjaman AS idpeminjaman, "
                                            + " p.tanggalpinjam AS tanggalpinjam, "
                                            + " p.tanggalkembali AS tanggalkembali, "
                                            + " a.idanggota AS idanggota, "
                                            + " a.nama AS nama, "
                                            + " a.alamat AS alamat, "
                                            + " a.telepon AS telepon, "
                                            + " b.idbuku AS idbuku, "
                                            + " b.judul AS judul "
                                            + " FROM peminjaman p "
                                            + " RIGHT JOIN anggota a ON p.idanggota = a.idanggota "
                                            + " RIGHT JOIN buku b ON p.idbuku = b.idbuku "
                                            + " WHERE a.idanggota LIKE '%" + keyword + "%' ");
        try {
            while(rs.next()){
                Peminjaman peminjamanAna = new Peminjaman();
                peminjamanAna.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjamanAna.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjamanAna.getAnggota().setNama(rs.getString("nama"));
                peminjamanAna.getAnggota().setAlamat(rs.getString("alamat"));
                peminjamanAna.getAnggota().setTelepon(rs.getString("telepon"));
                peminjamanAna.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjamanAna.getBuku().setJudul(rs.getString("judul"));
                peminjamanAna.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjamanAna.setTanggalkembali(rs.getString("tanggalkembali"));

                ListPinjam.add(peminjamanAna);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
            return ListPinjam;
    }

    public void save() {
        if(getById(idpeminjaman).getIdpeminjaman()== 0) {
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                            + " '" + this.getAnggota().getIdanggota() + "', "
                            + " '" + this.getBuku().getIdbuku() + "', "
                            + " '" + this.tanggalpinjam + "', "
                            + " '" + this.tanggalkembali + "' "
                            + " )";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE peminjaman SET "
                        + " idanggota = '" + this.getAnggota().getIdanggota() + "', "
                        + " idbuku = '" + this.getBuku().getIdbuku() + "', "
                        + " tanggalpinjam = '" + this.tanggalpinjam + "', "
                        + " tanggalkembali = '" + this.tanggalkembali + "' "
                        + " WHERE idpeminjaman = '" + this.idpeminjaman + "'";
                        DBHelper.executeQuery(SQL);
            }
        }

    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }
}