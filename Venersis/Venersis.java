/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venersis;

import java.util.Scanner;



/**
 *
 * @author STUDENT
 */
public class Venersis {
	public static void main(String[] args) {
	 // TODO code application logic here
    // Ivan Pogi Ugh hacker XD xXH4cKerXx

    Scanner a = new Scanner(System.in);
    //Item price Variable
    int Sword = 5000;
    int Bow = 6000;
    int Elixer = 7000;
    int Shield = 6500;
    int Ring = 10000;
    //Variables
    String b = "yes";
    String c = "no";
    String d = "Bioluminiscence Sword";
    String e = "The Almighty Dragon Slayer Bow";
    String f = "Greater Elixer";
    String g = "The Unmoving Shield of the Great Hermit";
    String h = "Ring of the Celestial King(Fragment)";
    String I ="I";
    //not initialized variables
    int x;
    int m;
    //first interaction with the user
    System.out.println("Hello Adventurer!" + "\n" + "It must be fate we met" + "\n" + "I am a Black Merchant, I have Goods that are so rare and powerful it can destory a kingdom in the blink of an eye" + "\n" + "If you want to take a look at my shop just type 'yes' if not then type 'no'");
    System.out.println("(Note That This Is A One Time Transaction!)" + "\n" + "(Choose Carefully)");
    String J = a.next();
    
    
    //Item Scanning
    if (J.equals(b)) {
    	do {
            System.out.println("If you want to take a look at the list of the items just press 'I'");
           J=a.next();
            
            
            if (J.equals(I)  ) {
            	System.out.println("\n" + "1:" + d + "\n" + "\n" + "2:" + e + "\n" + "\n" + "3:" + f + "\n" + "\n" + "4:" + g + "\n" + "\n" + "5:" + h + "\n");

                System.out.println("If you want to see the details of each item just type their item number" + "\n" + "If you are done looking at the details then press 6");
                m = a.nextInt();
                switch (m) {
                    case 1:
                        System.out.println("Bioluminiscence Sword" + "\n" +"5000 gold"+"\n" +"(It is made from the metal acquired after killing the ancient Bioluminiscent Dragon)");
                        System.out.println("\n" + "Attack 100  " + "\n" + "Defense  60 " + "\n" + "Agility  70 ");
                        break;

                    case 2:
                        System.out.println("The Almighty Dragon Slayer Bow" + "6000 gold"+"\n" +"\n" + "It is once used by the King of Elves while defending their kingdom from the invading dragons");
                        System.out.println("\n" + "Attack 200  " + "\n" + "Defense  30 " + "\n" + "Agility  50 ");
                        break;
                    case 3:
                        System.out.println("Greater Elixer" + "\n" +"7000 gold"+"\n" + "(No one Knows where it came from but there is a saying that it came from the tears of an angel after being betrayed by her beloved)");
                        System.out.println("\n" + "It can Heal all types of wounds and cleanse all debuff");
                        break;
                    case 4:
                        System.out.println("The Unmoving Shield of the Great Hermit" +"6500 gold"+"\n" + "\n" + "(Used by the Great Hermit in his early days, it was the shield he used to hone his skills which in turn leaded him to ascension)");
                        System.out.println("\n" + "Attack 30  " + "\n" + "Defense  200 " + "\n" + "Agility  20 ");
                        break;
                    case 5:
                        System.out.println("Ring of the Celestial King(Fragment)" +"10000 gold"+"\n" + "\n" + "Legend says that it was once the ring used by the celestial king while creating the universe, it hold a huge amount of power");
                        System.out.println("\n" + "Attack 90(locked)  " + "\n" + "Defense  120(locked) " + "\n" + "Agility  90(locked) " + "\n");
                        System.out.println("(Collect the missing pieces to unlocked the hidden attributes of the ring and experience the almight power of the creator)");
                }
               
            
            
            System.out.println("\n");
            System.out.println("Do you want to look at another Item?");
            System.out.println("yes or no?");
            J = a.next();
        
        if (J.equals(c)) {
            System.out.println("Have you chosen your desired item Adventurer?" + "\n");
            System.out.println("How many Item would you like to buy adventurer?");
            x=a.nextInt();
        
            if (x==1) {
            	System.out.println("Type The Item Number of The Desired Weapon: ");
            	x=a.nextInt();
            	if(x==1) {
                	
            		System.out.println("Excellent Choice Adventurer!"+"\n"+"The Price of the Bioluminiscence Sword would be:   "+Sword);
            		
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		do {
            		x=a.nextInt();
            		if(x<Sword) {
            			float kulang = Sword - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");
            			x=a.nextInt();
            			
            			}
            		}while(x<Sword);
            		float sword_change = x - Sword;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+sword_change);
            		System.out.println("Thank you for Purchasing! til we meet again.");
                	}
            		
            	else if(x==2) {
                	
            		System.out.println("Excellent Choice Adventurer!"+"\n"+"The Price of The Almighty Dragon Slayer Bow is:   "+ Bow);
            		
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		do {
            		if(x<Bow) {
            			float kulang = Bow - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");
            			x=a.nextInt();
            			
            			
            		}
            		
            		}while(x<Bow);
            	
            		float bow_change = x - Bow;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+bow_change);
            		System.out.println("Thank you for Purchasing! til we meet again.");
            	}
            }
                	
            }
            
            
            }
        }while (J.equals(b));
            }
    }  
    
    }
	
	

