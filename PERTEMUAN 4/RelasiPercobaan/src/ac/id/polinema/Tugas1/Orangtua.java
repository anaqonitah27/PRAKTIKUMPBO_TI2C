/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.polinema.Tugas1;

/**
 *
 * @author Lenovo
 */
public class Orangtua {
    private String namaAyah;
    private String namaIbu;
    
    public Orangtua(String namaAyah, String namaIbu){
        this.namaAyah = namaAyah;
        this.namaIbu = namaIbu;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }
    public String info() { 
        String info = "";
        info += "Nama Ayah       : " + this.namaAyah + "\n";
        info += "Nama Ibu        : " + this.namaIbu + "\n";
        return info;
    }
}
