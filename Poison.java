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
public class Poison extends MonsterDecorator {

    public Poison(Monster m) {
        super(m, "Poison " + m.getName(), m.getHp() + 1);
    }
 
    @Override
    public int attack(){
        return super.attack() + 4;
    }
    
}
