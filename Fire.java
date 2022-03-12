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
public class Fire extends MonsterDecorator {
    public Fire(Monster m){
        super(m, "Firey " + m.getName(), m.getHp() + 2);
    }
    @Override
    public int attack(){
        return (super.attack() + 5);
    }
}
