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
public class Alien extends Monster{

    public Alien(){
        super("Alien",6);
    }

    @Override
    public int attack() {
        return 1;
    }
    
}
