/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1;

/**
 *
 * @author Lenovo
 */
public class KipasAngin {
    private int tinggi;
    private int kecepatan;
    
    public void setTinggi(int newValue){
        tinggi = newValue;
    }
    public void tambahKecepatan(int increment){
        kecepatan = kecepatan + increment;
    }
    public void cetakStatus(){
        System.out.println("Tinggi Kipas : " + tinggi);
        System.out.println("Kecepatan Angin : " + kecepatan);   
    }
}
