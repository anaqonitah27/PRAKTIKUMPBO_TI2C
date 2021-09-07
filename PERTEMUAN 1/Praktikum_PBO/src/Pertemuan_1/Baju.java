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
public class Baju {
    private String warna;
    private int ukuran;
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    public void tambahUkuran(int increment){
        ukuran = ukuran + increment;
    }
    
    public void cetakStatus(){
        System.out.println("Warna Baju : " + warna);
        System.out.println("Ukuran Baju : " + ukuran);
    }
    
}
