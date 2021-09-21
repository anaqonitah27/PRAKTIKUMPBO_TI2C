/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3;

/**
 *
 * @author Lenovo
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahkanKecepatan(){
        if(kecepatan == 100){
            System.out.println("Kecepatan sudah maksimal, kurangi kecepatan Anda!");
        }
        else{
            if(kontakOn == true){
                kecepatan +=50;
            } else {
                System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!\n");
            }
        }
    }
    public void kurangiMesin(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off!\n");
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }
        
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("======================="); 
    }
}
