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
public class Beast extends Monster {
    public Beast(){
        super("Beast", 7);
      }
    @Override
    public int attack(){
        return 2;
    }
    
}
