/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg13;

/**
 *
 * @author Yisacor
 */
public abstract class Monster {
    private int hp;
    private String name;
    public Monster(String n, int h){
        hp = h;
        name = n;
    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    
    public abstract int attack();
}
