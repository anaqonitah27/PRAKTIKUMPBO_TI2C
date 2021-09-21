/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3;

/**
 *
 * @author Lenovo
 */
public class MotorDemo {
    public static void main(String[] args){
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahkanKecepatan();
        
        motor.nyalakanMesin();
        motor.printStatus();
        
        motor.tambahkanKecepatan();
        motor.printStatus();
        
        motor.tambahkanKecepatan();
        motor.printStatus();
        
        motor.tambahkanKecepatan();
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
                
    }
}
