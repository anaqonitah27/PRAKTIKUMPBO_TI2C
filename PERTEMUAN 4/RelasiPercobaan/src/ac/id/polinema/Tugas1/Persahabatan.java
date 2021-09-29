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
public class Persahabatan {
    private String namaPemeran;
    private String namaAsli;
    private String sifat;
    private String jenisKelamin;
    
    public Persahabatan(){
    }
    public Persahabatan(String namaPemeran, String namaAsli, String sifat, String jenisKelamin){
        this.namaPemeran = namaPemeran;
        this.namaAsli = namaAsli;
        this.sifat = sifat;
        this.jenisKelamin = jenisKelamin;
    }    

    public String getNamaPemeran() {
        return namaPemeran;
    }

    public void setNamaPemeran(String namaPemeran) {
        this.namaPemeran = namaPemeran;
    }

    public String getNamaAsli() {
        return namaAsli;
    }

    public void setNamaAsli(String namaAsli) {
        this.namaAsli = namaAsli;
    }

    public String getSifat() {
        return sifat;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public String info() { 
        String info = "";
        info += "Nama Pemeran    : " + this.namaPemeran + "\n";
        info += "Nama Asli       : " + this.namaAsli + "\n";
        info += "Sifat           : " + this.sifat + "\n";
        info += "Jenis Kelamin   : " + this.jenisKelamin + "\n";
        return info;
    }
}
