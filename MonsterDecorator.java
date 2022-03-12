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
public abstract class MonsterDecorator extends Monster {
    private Monster monster;
    public MonsterDecorator(Monster m, String addName, int addHp) {
        super(addName, addHp);
        monster = m;    
    }
    /**
     *
     * @return
     */
    @Override
    public int attack(){
        return monster.attack();
    }
    
}
