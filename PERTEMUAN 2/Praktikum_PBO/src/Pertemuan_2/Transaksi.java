/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_2;

/**
 *
 * @author Lenovo
 */
public class Transaksi {
    int hargaBayar;
    
    public int pembayaranGame(int lamaSewa, int detailHarga){
        hargaBayar = lamaSewa*detailHarga;
        return hargaBayar;
    }
}
