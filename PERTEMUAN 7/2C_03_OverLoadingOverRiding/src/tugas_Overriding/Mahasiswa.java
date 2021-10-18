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
public class Mahasiswa extends Manusia{
    @Override
    public void makan(){
        System.out.println("Mahasiswa juga manusia yang memerlukan makan");
    }
    
    public void tidur(){
        System.out.println("Mahasiswa membutuhkan tidur");
    }
}
