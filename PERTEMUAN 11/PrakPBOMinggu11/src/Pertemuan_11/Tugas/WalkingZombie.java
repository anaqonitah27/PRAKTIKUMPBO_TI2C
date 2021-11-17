/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_11.Tugas;

/**
 *
 * @author Lenovo
 */
public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        super.health = health;
        super.level = level;
    }
    
    @Override
    public void heal(){
        if(level == 1){
            health += (health * 10/100);
        } else if (level ==2){
            health += (health * 30/100);
        } else if (level ==3){
            health += (health * 40/100);
        }
    }
    
    @Override
    public void destroyed(){
        health -=(health * 20/100);
    }
    
    @Override
    public String getZombieInfo(){
        String info = "Walking " +super.getZombieInfo() + "\n";
        info += "Health = "+health+"\n" +"Level = "+level+"\n";
        return info;
    }
}