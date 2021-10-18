/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_Overloading;

/**
 *
 * @author Lenovo
 */
public class MainSegitiga {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Segitiga sgtg = new Segitiga();
        
        System.out.print("Total sudut Segitiga A       : ");
        sgtg.totalSudut(35);
        System.out.print("Total sudut Segitiga AB      : ");
        sgtg.totalSudut(85,50);
        System.out.print("Total keliling Segitiga ABC  : ");
        sgtg.keliling(20, 10);
        System.out.print("Total keliling Segitiga C    : ");
        sgtg.keliling(4,9,5);
    }
}
