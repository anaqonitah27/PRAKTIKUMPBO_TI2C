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
public class BajuGamis extends Baju{
    private String merek;
    private String motif;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void setMotif(String newValue){
        motif = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Merek Baju Gamis : " + merek);
        System.out.println("Motif Baju Gamis : " + motif);
    }
}