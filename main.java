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
public class Lab13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Monster Creator!");
        System.out.println("Choose a base monster: ");
        System.out.println("1. Alien");
        System.out.println("2. Beast");
        System.out.println("3. Undead");
        int choice = CheckInput.getIntRange(1, 3);
        Monster m = new Alien();
        boolean quit = false;
        
        switch (choice) {
            case 1:
                m = new Alien();
                break;
            case 2:
                m = new Beast();
                break;
            case 3:
                m = new Undead();
                break;
        }
        
        do {
            System.out.println(m.getName() + " has " + m.getHp() + " hp" + " and attacks for " + m.attack() + " damage.");
            System.out.println("Add an ability: ");
            System.out.println("1. Fire");
            System.out.println("2. Flying");
            System.out.println("3. Lasers");
            System.out.println("4. Poison");
            System.out.println("5. Quit");
            choice = CheckInput.getIntRange(1, 5);

            switch (choice) {
                case 1:
                    m = new Fire(m);
                    break;
                case 2:
                    m = new Flying(m);
                    break;
                case 3:
                    m = new Lasers(m);
                    break;
                case 4:
                    m = new Poison(m);
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting");
                    break;
                default:
                    break;
            }
        } while (quit != true);
    }
}
