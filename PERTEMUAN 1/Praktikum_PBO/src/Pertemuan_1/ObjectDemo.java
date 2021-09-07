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
public class ObjectDemo {
    public static void main(String[] args){
        BajuKemeja bj_1 = new BajuKemeja();
        BajuGamis bj_2 = new BajuGamis();
        KipasAngin kipas_3 = new KipasAngin();
        SpeakerLaptop speaker_4 = new SpeakerLaptop();
        
        bj_1.setWarna("Merah");
        bj_1.tambahUkuran(70);
        bj_1.setMerek("Second");
        bj_1.setBahan("Acrylic");
        bj_1.cetakStatus();
        System.out.println();
        
        bj_2.setWarna("Hitam");
        bj_2.tambahUkuran(74);
        bj_2.setMerek("Channel");
        bj_2.setMotif("Bunga");
        bj_2.cetakStatus();
        System.out.println();
        
        kipas_3.setTinggi(15);
        kipas_3.tambahKecepatan(5);
        kipas_3.setTinggi(20);
        kipas_3.cetakStatus();
        System.out.println();
        
        speaker_4.setMerek("Sony");
        speaker_4.tambahVolume(24);
        speaker_4.cetakStatus();
    }
}
