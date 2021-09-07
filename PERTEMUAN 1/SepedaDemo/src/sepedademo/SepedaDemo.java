/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author Lenovo
 */
public class SepedaDemo {
    public static void main(String[] args) {
        //Buat dua buah objek sepeda
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        
        //Panggil method didalam objek sepeda
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd1.setMerek("Wiim Cycle");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.tambahKecepatan(10);
        spd1.gantiGear(3);
        spd1.cetakStatus();
    }
    
}
