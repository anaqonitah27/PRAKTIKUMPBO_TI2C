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
public class MendakiGunungSemeru {
    private String waktuMendaki;
    private int urutanPendaki;
    private String namaPendaki;
    
    public MendakiGunungSemeru(){
        
    }
    public MendakiGunungSemeru(String waktuMendaki,int urutanPendaki, String namaPendaki){
        this.waktuMendaki = waktuMendaki;
        this.urutanPendaki = urutanPendaki;
        this.namaPendaki = namaPendaki;
    }

    public String getWaktuMendaki() {
        return waktuMendaki;
    }

    public void setWaktuMendaki(String waktuMendaki) {
        this.waktuMendaki = waktuMendaki;
    }

    public int getUrutanPendaki() {
        return urutanPendaki;
    }

    public void setUrutanPendaki(int urutanPendaki) {
        this.urutanPendaki = urutanPendaki;
    }

    public String getNamaPendaki() {
        return namaPendaki;
    }

    public void setNamaPendaki(String namaPendaki) {
        this.namaPendaki = namaPendaki;
    }

    
    public String info() { 
        String info = "";
        info += "Waktu Mendaki   : " + this.waktuMendaki + "\n";
        info += "Urutan Pendaki  : " + this.urutanPendaki + "\n";
        info += "Nama Pendaki    : " + this.namaPendaki + "\n";
        return info;
    }
}
