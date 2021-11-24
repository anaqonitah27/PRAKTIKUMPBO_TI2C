/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.*;

public class TestAnggota {
    public static void main(String[] args) {
        Anggota ang1 = new Anggota("Nadia Nadira", "Blitar", "081987343223");
        Anggota ang2 = new Anggota("Ana Qonitah", "Malang","089233228932");
        Anggota ang3 = new Anggota("Mataul Hayati", "Tulung Agung", "085829743933");
        
        // test insert
        ang1.save();
        ang2.save();
        ang3.save();

        //test update 
        ang2.setNama("Nila Nikmatul");
        ang2.save();

        // test delete
        ang3.delete();

        // test select all
        for(Anggota ang : new Anggota().getAll()){
            System.out.println("Nama: " + ang.getNama() + ", alamat: " + ang.getAlamat()
                                + " , telepon: " + ang.getTelepon());
        }

        // test search
        for(Anggota ang : new Anggota().search("Batu")){
            System.out.println("Nama: " + ang.getNama() + ", alamat: " + ang.getAlamat() 
                                + " , telepon: " + ang.getTelepon());
        }
    }
}