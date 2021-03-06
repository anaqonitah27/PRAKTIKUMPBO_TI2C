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
public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Makanan     : Daging");
    }
    
    @Override
    public void displayBinatang(){
        System.out.println("Jenis Hewan : Karnivora");
    }
    
    public void displayData(){
        System.out.println("Nama        : "+this.nama);
        System.out.println("Jumlah Kaki : "+this.jmlKaki);
        System.out.println("Suara       : "+this.suara);
        System.out.println("Warna Bulu  : "+this.warnaBulu);
    }
}