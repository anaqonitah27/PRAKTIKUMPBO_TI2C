/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class TestKoperasi {
    public static void main(String[] args){
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        Scanner ana = new Scanner(System.in);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("Masukkan jumlah dari peminjaman: ");
        int pinjam = ana.nextInt();
        donny.pinjam(pinjam);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("Masukkan jumlah dari angsuran: ");
        int angsur = ana.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
