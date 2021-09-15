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
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        diskon = diskon/100;
        return (int) (hargaDasar - (diskon*hargaDasar));
    }
    
    public void tampilData(){
        System.out.println("   \n=== DATA PERHITUNGAN BARANG ===");
        System.out.println("Kode Barang     : "+kode);
        System.out.println("Nama Barang     : "+namaBarang);
        System.out.println("Harga Dasar     : "+hargaDasar);
        System.out.println("Diskon Barang   : "+diskon);
        System.out.println("Harga Jual      : "+hitungHargaJual());
    }
}
