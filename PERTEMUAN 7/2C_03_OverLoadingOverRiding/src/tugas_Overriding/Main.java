/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_Overriding;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Manusia mnsa = new Manusia();
        Manusia dsn = new Dosen();
        Manusia mhs = new Mahasiswa();
        
        Dosen dsn1 = new Dosen();
        Mahasiswa mhs1 = new Mahasiswa();
        
        mnsa.bernafas();
        mnsa.makan();
        dsn.makan();
        dsn1.lembur();
        mhs.makan();
        mhs1.tidur();
    }
}
