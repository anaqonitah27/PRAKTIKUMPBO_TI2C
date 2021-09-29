/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.polinema.Tugas1;

/**
 *
 * @author Lenovo
 */
public class MainTugas1 {
    public static void main(String[] args){
        System.out.println("======================= TOKOH FILM 5 CM  =======================");
        Persahabatan sahabat1 = new Persahabatan("Genta","Fedi Nuril","pikiran dewasa","laki-laki");
        Persahabatan sahabat2 = new Persahabatan("Zafran", "Herjunot Ali", "puitis,narsis","laki-laki");
        Persahabatan sahabat3 = new Persahabatan("Arial","Denny Sumargo", "macho,taat aturan","laki-laki");
        Persahabatan sahabat4 = new Persahabatan("Riani","Raline Shah", "cerdas,ambis","perempuan");
        Persahabatan sahabat5 = new Persahabatan("Ian","Igor Saykoji", "gendut,pembawa humor","laki-laki");
        Orangtua ortuZafran = new Orangtua("-","FeniRose");
        Orangtua ortuArial = new Orangtua("Rima","Elkie");
        Orangtua ortuIan = new Orangtua("DidiPetet","Sarah");
        TokohTambahan adikArial = new TokohTambahan("Dinda","Pevita Pearce","adik Arial");
        TokohTambahan dosenIan = new TokohTambahan("Pak Sukonto", "Sukonto Legowo","Dosen Pembimbing Ian");
        
        System.out.println(sahabat1.info());
        System.out.print(sahabat2.info());
        System.out.println(ortuZafran.info());
        System.out.print(sahabat3.info());
        System.out.print(ortuArial.info());
        System.out.println(adikArial.info());
        System.out.println(sahabat4.info());
        System.out.print(sahabat5.info());
        System.out.print(ortuIan.info());
        System.out.println(dosenIan.info());
        
        System.out.println("================== PENDAKIAN GUNUNG SEMERU ===================");
        MendakiGunungSemeru pendaki1 = new MendakiGunungSemeru("17 Agustus",1,"Genta");
        MendakiGunungSemeru pendaki2 = new MendakiGunungSemeru("17 Agustus",2,"Riani");
        MendakiGunungSemeru pendaki3 = new MendakiGunungSemeru("17 Agustus",3,"Arial");
        MendakiGunungSemeru pendaki4 = new MendakiGunungSemeru("17 Agustus",4,"Dinda");
        MendakiGunungSemeru pendaki5 = new MendakiGunungSemeru("17 Agustus",5,"Ian");
        MendakiGunungSemeru pendaki6 = new MendakiGunungSemeru("17 Agustus",6,"Zafran");
        
        System.out.println(pendaki1.info());
        System.out.println(pendaki2.info());
        System.out.println(pendaki3.info());
        System.out.println(pendaki4.info());
        System.out.println(pendaki5.info());
        System.out.println(pendaki6.info());
    }
}
