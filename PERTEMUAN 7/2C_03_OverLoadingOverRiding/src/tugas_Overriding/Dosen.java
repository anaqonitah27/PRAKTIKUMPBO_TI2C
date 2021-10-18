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
public class Dosen extends Manusia{
    Dosen() {
        
    }
    @Override
    public void makan(){
        System.out.println("Dosen juga memerlukan makan seperti manusia");
    }
    public void lembur(){
        System.out.println("Dosen bekerja lembur");
    }
}
