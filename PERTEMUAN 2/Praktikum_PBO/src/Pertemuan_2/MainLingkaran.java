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
public class MainLingkaran {
    public static void main(String[] args){
        Lingkaran L = new Lingkaran();
        
        L.phi = 3.14;
        L.r = 5;
        
        System.out.println("====== Lingkaran ======");
        System.out.println("Jari-jari Lingkaran : " + L.r);
        System.out.println("\n=== Program Perhitungan Lingkaran ===");
        System.out.println("Hasil Luas Lingkaran        : " + L.hitungLuas());
        System.out.println("Hasil Keliling Lingkaran    : " + L.hitungKeliling());
    }
}
