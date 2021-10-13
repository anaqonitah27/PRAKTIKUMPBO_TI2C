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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dosen dsn1 = new Dosen("D0SEN01", "Abdul Ghofur", "Pekalongan", 300000);
        Dosen dsn2 = new Dosen("D0SEN02", "Dini Aisyah", "Pasuruan", 200000);
        Dosen dsn3 = new Dosen("DOSEN03", "Ana Qonitah", "Malang", 400000);
        Dosen dsn4 = new Dosen("D0SEN04", "Arum Puji L", "Blitar", 350000);
        Dosen dsn5 = new Dosen("DOSEN05", "Maharani", "Pare", 250000);
        DaftarGaji gaji = new DaftarGaji(2);
        
        dsn1.setSKS(10);
        dsn2.setSKS(12);
        dsn3.setSKS(15);
        dsn4.setSKS(5);
        dsn5.setSKS(8);
        
        gaji.addPegawai(dsn1);
        gaji.printSemuaGaji();
        gaji.addPegawai(dsn2);
        gaji.printSemuaGaji();
        gaji.addPegawai(dsn3);
        gaji.printSemuaGaji();
        gaji.addPegawai(dsn4);
        gaji.printSemuaGaji();
        gaji.addPegawai(dsn5);
        gaji.printSemuaGaji();
    }
}
