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
public class TokohTambahan {
    private String namaPemeran;
    private String namaAsli;
    private String peran;
    
    public TokohTambahan(){
        
    }
    public TokohTambahan(String namaPemeran, String namaAsli, String peran){
        this.namaPemeran = namaPemeran;
        this.namaAsli = namaAsli;
        this.peran = peran;
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

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }
    
    public String info() { 
        String info = "";
        info += "Nama Pemeran    : " + this.namaPemeran + "\n";
        info += "Nama Asli       : " + this.namaAsli + "\n";
        info += "Berperan sebagai: " + this.peran + "\n";
        return info;
    }
}
