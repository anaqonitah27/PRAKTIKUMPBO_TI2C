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
public class SpeakerLaptop {
    private String merek;
    private int volume;

    public void setMerek(String newValue){
        merek = newValue;
    }
    public void tambahVolume(int increment){
        volume = volume + increment;
    }
    public void cetakStatus(){
        System.out.println("Merek Speaker : " + merek);
        System.out.println("Volume Audio : " + volume);
    }
}