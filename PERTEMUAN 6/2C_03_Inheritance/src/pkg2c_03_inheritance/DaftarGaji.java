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
public class DaftarGaji{
    Pegawai[] listPegawai;
    
    public DaftarGaji() {
        
    }
    public DaftarGaji(int listP) {
        this.listPegawai = new Pegawai[listP];
    }
    public void addPegawai(Pegawai pegawai){
        for (int i = 0; i < this.listPegawai.length - 1; i++) {
            this.listPegawai[i] = pegawai;
        }
    }
    public void printSemuaGaji(){
        for (int i = 0; i < listPegawai.length - 1; i++) {
            System.out.println("\nNama Pegawai      : "+listPegawai[i].getNama());
            System.out.println("Gaji Yang Didapat : "+listPegawai[i].getGaji());
        }
    }
}
