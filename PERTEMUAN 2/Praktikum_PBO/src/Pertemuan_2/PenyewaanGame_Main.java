/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_2;

/**
 *
 * @author Lenovo
 */
public class PenyewaanGame_Main {
    public static void main(String[] args){
        Member m = new Member();
        Game g = new Game();
        PeminjamanGame p = new PeminjamanGame();
        Transaksi t = new Transaksi();
        
        m.idMember = "2078021920";
        m.nama = "Ana Qonitah M";
        
        g.namaGame = "Subway Surfer";
        g.hargaAsli = 25000;
        
        p.idPeminjaman = "SS_25";
        p.lamaSewa = 4;
        
        System.out.println("     === DATA PEMINJAMAN GAME ===");
        System.out.println("------------------------------------");
        m.cetakDataMember();
        System.out.println("------------------------------------");
        g.tampilDataGame();
        System.out.println("------------------------------------");
        p.tampilPeminjamanGame();
        System.out.println("------------------------------------");
        System.out.println("Harga Bayar : "+t.pembayaranGame(p.lamaSewa, g.hargaAsli));
    }
}
