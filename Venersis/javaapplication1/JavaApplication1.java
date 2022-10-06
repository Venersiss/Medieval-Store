/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Custodio_CPE112
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ivan Pogi Ugh hacker XD xXH4cKerXx

        Scanner a = new Scanner(System.in);
        String b = "yes";
        String c = "no";
        String d = "Bioluminiscence Sword";
        String e = "The Almighty Dragon Slayer Bow";
        String f = "Greater Elixer";
        String g = "The Unmoving Shield of the Great Hermit";
        String h = "Ring of the Celestial King(Fragment)";
        System.out.println("Hello Adventurer!" + "\n" + "It must be fate we met" + "\n" + "I am a Black Merchant, I have Goods that are so rare and powerful it can destory a kingdom in the blink of an eye" + "\n" + "If you want to take a look at my shop just type 'yes' if not then type 'no'");
        System.out.println("(Note That This Is A One Time Transaction!)" + "\n" + "(Choose Carefully)");
        String J = a.next();
        int x;
        String n = "I";
        int m;
        if (J.equals(b)) {
            do {
                System.out.println("If you want to take a look at the list of the items just press 'I'");
                J = a.next();

                System.out.println("\n" + "1:" + d + "\n" + "\n" + "2:" + e + "\n" + "\n" + "3:" + f + "\n" + "\n" + "4:" + g + "\n" + "\n" + "5:" + h + "\n");

                System.out.println("If you want to see the details of each item just type their item number" + "\n" + "If you are done looking at the details then press 6");
                m = a.nextInt();
                do {
                    switch (m) {
                        case 1:
                            System.out.println("Bioluminiscence Sword" + "\n" + "(It is made from the metal acquired after killing the ancient Bioluminiscent Dragon)");
                            System.out.println("\n" + "Attack 100  " + "\n" + "Defense  60 " + "\n" + "Agility  70 ");
                            break;

                        case 2:
                            System.out.println("The Almighty Dragon Slayer Bow" + "\n" + "It is once used by the King of Elves while defending their kingdom from the invading dragons");
                            System.out.println("\n" + "Attack 200  " + "\n" + "Defense  30 " + "\n" + "Agility  50 ");
                            break;
                        case 3:
                            System.out.println("Greater Elixer" + "\n" + "(No one Knows where it came from but there is a saying that it came from the tears of an angel after being betrayed by her beloved)");
                            System.out.println("\n" + "It can Heal all types of wounds and cleanse all debuff");
                            break;
                        case 4:
                            System.out.println("The Unmoving Shield of the Great Hermit" + "\n" + "(Used by the Great Hermit in his early days, it was the shield he used to hone his skills which in turn leaded him to ascension)");
                            System.out.println("\n" + "Attack 30  " + "\n" + "Defense  200 " + "\n" + "Agility  20 ");
                            break;
                        case 5:
                            System.out.println("Ring of the Celestial King(Fragment)" + "\n" + "Legend says that it was once the ring used by the celestial king while creating the universe, it hold a huge amount of power");
                            System.out.println("\n" + "Attack 90(locked)  " + "\n" + "Defense  120(locked) " + "\n" + "Agility  90(locked) " + "\n");
                            System.out.println("(Collect the missing pieces to unlocked the hidden attributes of the ring and experience the almight power of the creator)");
                    }
                    System.out.println("\n");
                    System.out.println("Do you want to look at another Item?");
                    System.out.println("yes or no?");
                    J = a.next();
                } while (m == 1 && m == 2 && m == 3 && m == 4 && m == 5 && J.equalsIgnoreCase(b));

                System.out.println("Have you chosen your desired item Adventurer?" + "\n");
                System.out.println("What Item Would you like to buy adventurer?");
                System.out.println("Just type the Item Number");
                x = a.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("You chose Bioluminiscence Sword");
                        
break;
                    case 2:
                        System.out.println("You chose the Almight Dragon Slayer Bow");
break;
                    case 3:
                        System.out.println("You Chose Greater Elixer");
                        break;

                    case 4:
                        System.out.println("You Chose The Unmoving Shield of the Great Hermit");
break;
                    case 5:
                        System.out.println("You Chose the Ring of the Celestial King(Fragment)");
                        break;
                }
            } while (J.equals(b));
        }

    }
}
