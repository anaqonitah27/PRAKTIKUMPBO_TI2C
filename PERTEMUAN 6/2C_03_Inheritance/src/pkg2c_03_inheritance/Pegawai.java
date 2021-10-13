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
public class Pegawai{
    public String nip, nama, alamat;
    public int gaji;
    
    public void Pegawai(String nip, String nama,String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }
    
    public int getGaji(){
        return gaji;
    }
}
