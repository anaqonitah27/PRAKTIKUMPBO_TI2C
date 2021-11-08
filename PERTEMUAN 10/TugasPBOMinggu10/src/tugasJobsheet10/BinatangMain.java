/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasJobsheet10;

/**
 *
 * @author Lenovo
 */
public class BinatangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singa sga = new Singa("Singa",4,"Haauum Ghaauum","Hitam dan Orange");
        Keledai kld = new Keledai("Keledai",4,"Hek hek hek hek", "Abu-Abu dan Coklat");
        Gorilla grl = new Gorilla("Gorila", 2, "Herr Herr Herr","Coklat dan Hitam");
        
        sga.displayBinatang();
        sga.displayMakan();
        sga.displayData();
        System.out.println("-----------------------------"); 
        kld.displayBinatang();
        kld.displayMakan();
        kld.displayData();
        System.out.println("-----------------------------");       
        grl.displayBinatang();
        grl.displayMakan();
        grl.displayData();
    }
}