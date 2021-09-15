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
public class MainBarang {
    public static void main (String args[]){
        Barang brg1 = new Barang();
        brg1.kode = "ATK-10";
        brg1.namaBarang = "Pensil";
        brg1.hargaDasar = 10000;
        brg1.diskon = 50;
        brg1.hitungHargaJual();
        brg1.tampilData();
        
        Barang brg2 = new Barang();
        brg2.kode = "ATK-20";
        brg2.namaBarang = "Buku";
        brg2.hargaDasar = 100000;
        brg2.diskon = 50;
        brg2.hitungHargaJual();
        brg2.tampilData();
    }
}
