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
public class BajuKemeja extends Baju{
    private String merek;
    private String bahan;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void setBahan(String newValue){
        bahan = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Merek Baju Kemeja : " + merek);
        System.out.println("Bahan Baju Kemeja : " + bahan);
    }
}
