/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;
import backend.*;
/**
 *
 * @author Lenovo
 */
public class TestPeminjaman {
    public static void main(String[] args) {
        Anggota ang1 = new Anggota().getById(17);
        Anggota ang2 = new Anggota().getById(18);
        
        Buku buku1 = new Buku().getById(13);
        Buku buku2 = new Buku().getById(14);
        Buku buku3 = new Buku().getById(13);

        Peminjaman pin1 = new Peminjaman(ang1, buku1, "20211124", "20211201");
        Peminjaman pin2 = new Peminjaman(ang2, buku2, "20211201", "20211208");
        Peminjaman pin3 = new Peminjaman(ang1, buku3, "20211130", "20211207");
        
        // test insert
        pin1.save();
        pin2.save();
        pin3.save();
        
        // test update
        pin1.setTanggalpinjam("20211212");
        pin1.save();
        
        // test delete
        pin3.delete();
        
        // test select all
        for (Peminjaman pin : new Peminjaman().getAll()) {
            System.out.println("Nama Anggota: " + pin.getAnggota().getNama() 
                                + ", Judul: " + pin.getBuku().getJudul()
                                + ", Tanggal Pinjam: " + pin.getTanggalpinjam() 
                                + ", Tanggal Kembali: " + pin.getTanggalkembali());
        }
        
        // test search
        for (Peminjaman pin : new Peminjaman().searchBuku("2")) {
            System.out.println("Nama Anggota: " + pin.getAnggota().getNama() 
                                + ", Judul: " + pin.getBuku().getJudul()
                                + ", Tanggal Pinjam: " + pin.getTanggalpinjam() 
                                + ", Tanggal Kembali: " + pin.getTanggalkembali());
        }

        for (Peminjaman pin : new Peminjaman().searchAnggota("1")) {
            System.out.println("Nama Anggota: " + pin.getAnggota().getNama() 
                                + ", Judul: " + pin.getBuku().getJudul()
                                + ", Tanggal Pinjam: " + pin.getTanggalpinjam() 
                                + ", Tanggal Kembali: " + pin.getTanggalkembali());
        }
    }
}