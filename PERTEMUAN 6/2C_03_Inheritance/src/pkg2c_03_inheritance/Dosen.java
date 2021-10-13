/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2c_03_inheritance;

/**
 *
 * @author Lenovo
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;
    
    public Dosen(){
        
    }
    public Dosen(String nip, String nama, String alamat, int TARIF_SKS){
        super.nip = nip;
        super.nama= nama;
        super.alamat = alamat;
        this.TARIF_SKS = TARIF_SKS;
    }
    public void setSKS(int sks){
        this.jumlahSKS = sks;
    }
    
    public int getGaji(){
        return super.gaji = jumlahSKS * TARIF_SKS;
    }
}
