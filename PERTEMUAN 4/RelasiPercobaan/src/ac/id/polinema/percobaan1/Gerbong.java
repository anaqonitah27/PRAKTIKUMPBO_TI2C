/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.polinema.percobaan1;

/**
 *
 * @author Lenovo
 */
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    private void initKursi(){
        for(int i=0; i<arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i+1));
        }
    }
    
    public Gerbong(String kode,int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
//    public void setPenumpang(Penumpang penumpang, int nomor){
//        int index = nomor -1;
//        if(arrayKursi[index].getPenumpang()!= null){
//            System.out.println("Kursi sudah terisi, silahkan pilih kursi yang lain");
//        } else{
//            this.arrayKursi[index].setPenumpang(penumpang);
//        }
//    }
    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
    public String info() { String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) { 
            info += kursi.info();
        }
        return info;
    }
}

