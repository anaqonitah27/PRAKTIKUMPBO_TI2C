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
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        System.out.println(sudut = 180 - sudutA);
        return sudut;
    }
    
    public int totalSudut(int sudutA, int sudutB){
        System.out.println(sudut = 180 - (sudutA+sudutB));
        return sudut;
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC){
        System.out.println(sisiA+sisiB+sisiC);
        return sisiA+sisiB+sisiC;
    }
    public double keliling (int sisiA, int sisiB){
        System.out.println(Math.sqrt(Math.pow(sisiA,2) +Math.pow(sisiB,2)));
        double keliling = Math.sqrt(Math.pow(sisiA,2) +Math.pow(sisiB,2));
        return keliling;
    }
}
