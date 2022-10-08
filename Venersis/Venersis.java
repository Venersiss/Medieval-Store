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
    int y;
    int z;
    int q;
    int p;
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
            	System.out.println("We have A Special Promo Today Adventurer!"+"\n"+"If You buy 2 Items you get 10 healing potions!"+"\n"+"If you buy 3 Items you get 10 healing potions and 5 mana potions"+"\n"+"If you buy 4 items you get the 5th Item for free!"+"\n"+"If you buy 5 items you only pay half the Price!");
            	System.out.println("\n");
            	System.out.println("We Also Give Discounts To members of the Asura Adventurers Guild Depending on your rank"+"\n"+"If you are Rank 3 you get 10% discount"+"\n"+"If you are Rank 2 you get 20% discount "+"\n"+"If you are rank 1 you get 30% discount ");
            	System.out.println("\n");
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
            System.out.println("How many Item would you like to buy adventurer?"+"\n"+"(Limited to 5 items only)");
            
            x=a.nextInt();
            //1 item
            if (x==1) {
            	System.out.println("Type The Item Number of The Desired Weapon: ");
            	x=a.nextInt();
            	//Sword
            	if(x==1) {
                	
            		System.out.println("Excellent Choice Adventurer!"+"\n"+"The Price of the Bioluminiscence Sword would be:   "+Sword);
            		System.out.println("What rank do you have in the asura guild adventurer?");
            		p=a.nextInt();
            		if(p==3) {
            			double discount = Sword*0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double sword_change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+sword_change);
                		
                		System.out.println("Thank you for Purchasing! til we meet again.");
            			break;
            		}
            		else if(p==2) {
            			double discount = Sword*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double sword_change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+sword_change);
                		
                		System.out.println("Thank you for Purchasing! til we meet again.");
            			break;
            		}
            		else if(p==1) {
            			double discount = Sword*0.70;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double sword_change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+sword_change);
                		
                		System.out.println("Thank you for Purchasing! til we meet again.");
            			break;
            		}
            		
            		else {	
            		do {
            			
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<Sword) {
            			
            			float kulang = Sword - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");
            			
            			
            			}
            		
            		}while(x<Sword);
            		float sword_change = x - Sword;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+sword_change);
            		
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            		}
            		
                	}
            		//Bow
            	else if(x==2) {
                	
            		System.out.println("Excellent Choice Adventurer!"+"\n"+"The Price of The Almighty Dragon Slayer Bow is:   "+ Bow);
            		System.out.println("What rank do you have in the asura guild adventuer?");
            		p=a.nextInt();
            		
                    		if(p==3) {
                    			double discount = Bow*0.90;
                    			System.out.println("You will get 10% discount!");
                    			System.out.println("Your total Payment with discount will be "+discount);
                    			do {
                        			
                            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                            		x=a.nextInt();
                            		if(x<discount) {
                            			
                            			double kulang = discount - x;
                            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                            			System.out.println("Please Try Again");
                            			
                            			
                            			}
                            		
                            		}while(x<discount);
                    			double sword_change = x - discount;
                        		
                        		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+sword_change);
                        		
                        		System.out.println("Thank you for Purchasing! til we meet again.");
                        		break;
                    		}
                    		else if(p==2) {
                    			double discount = Sword*0.80;
                    			System.out.println("You will get 20% discount!");
                    			System.out.println("Your total Payment with discount will be "+discount);
                    			do {
                        			
                            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                            		x=a.nextInt();
                            		if(x<discount) {
                            			
                            			double kulang = discount - x;
                            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                            			System.out.println("Please Try Again");
                            			
                            			
                            			}
                            		
                            		}while(x<discount);
                    			double sword_change = x - discount;
                        		
                        		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+sword_change);
                        		
                        		System.out.println("Thank you for Purchasing! til we meet again.");
                        		break;
                    		}
                    		else if(p==1) {
                    			double discount = Sword*0.70;
                    			System.out.println("You will get 30% discount!");
                    			System.out.println("Your total Payment with discount will be "+discount);
                    			do {
                        			
                            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                            		x=a.nextInt();
                            		if(x<discount) {
                            			
                            			double kulang = discount - x;
                            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                            			System.out.println("Please Try Again");
                            			
                            			
                            			}
                            		
                            		}while(x<discount);
                    			double sword_change = x - discount;
                        		
                        		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+sword_change);
                        		
                        		System.out.println("Thank you for Purchasing! til we meet again.");
                        		break;
                    		}
            		else {
            		do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<Bow) {
            			float kulang = Bow - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<Bow);
            	
            		float bow_change = x - Bow;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+bow_change);
            		
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            		}
            	}
            	//Elixer
            		else if(x==3) {
                	
            		System.out.println("Excellent Choice Adventurer!"+"\n"+"The Price of Greater Elixer Bow is:   "+ Elixer);
            		System.out.println("What rank do you have in the asura guild adventurer?");
            		p=a.nextInt();
            		if(p==3) {
            			double discount = Elixer*0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
            		if(p==2) {
            			double discount = Elixer*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
            		if(p==1) {
            			double discount = Elixer*0.70;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
            		else {
            		do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<Elixer) {
            			float kulang = Elixer - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<Elixer);
            	
            		float Elixer_change = x - Elixer;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+Elixer_change);
            		
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            		}
            	}
            	//Shield
            		else if(x==4) {
                    	
                		System.out.println("Excellent Choice Adventurer!"+"\n"+"The Price of The Unmoving Shield of the Great Hermit is:   "+ Shield);
                		
                		System.out.println("What rank do you have in the asura guild adventurer?");
                		p=a.nextInt();
                		if(p==3) {
                			double discount = Shield*0.90;
                			System.out.println("You will get 10% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                		}
                		if(p==2) {
                			double discount = Shield*0.80;
                			System.out.println("You will get 20% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                		}
                		if(p==1) {
                			double discount = Shield*0.70;
                			System.out.println("You will get 30% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                		}
                		else {
                		do {
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<Shield) {
                			float kulang = Shield - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");	
                		}
                		
                		}while(x<Shield);
                	
                		float Shield_change = x - Shield;
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+Shield_change);
                		
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
                		}
                	}
            	//Ring
            			else if(x==5) {
                    	
                		System.out.println("Excellent Choice Adventurer!"+"\n"+"The Price of The Ring of the Celestial King(Fragment) is:   "+ Ring);
                		p=a.nextInt();
                		if(p==3) {
                			double discount = Shield*0.90;
                			System.out.println("You will get 10% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                		}
                		if(p==2) {
                			double discount = Shield*0.80;
                			System.out.println("You will get 20% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                		}
                		if(p==1) {
                			double discount = Shield*0.70;
                			System.out.println("You will get 30% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                		}
                		else {
                		do {
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<Ring) {
                			float kulang = Ring - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");	
                		}
                		
                		}while(x<Ring);
                	
                		float Ring_change = x - Ring;
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+Ring_change);
                		
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
                		}
                	}
            	
            }
            //2 Items
            else if(x==2) {
            	System.out.println("What Items would you like to buy adventurer?"+"\n"+"(Just type the item numbers and Please type the numbers in an ascending order example (1,2,3,4,5))");
            	System.out.println("IF YOU BREAK THIS RULE YOU WILL BE CURSED AND I WILL BE GONE!");
            	x=a.nextInt();
            	m=a.nextInt();
            	
            	//Sword and Bow
            	if(x==1 && m==2) {
            		float d_e=Sword+Bow;
            	System.out.println("So you chose "+d+" and "+e);
            	
            	System.out.println("The Total: "+d_e);
            	System.out.println("What rank do you have in the asura guild adventurer?");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = d_e*0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==2) {
        			double discount = d_e*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==1) {
        			double discount = d_e*0.70;
        			System.out.println("You will get 30% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<d_e) {
            			float kulang = d_e - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<d_e);
            	
            		float d_e_change = x - d_e;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+d_e_change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            	}
            		
            	}
            	//Sword and Elixer
            	else if(x==1 && m==3) {
            		float sum =Sword+Elixer;
            	System.out.println("So you chose "+d+" and "+f);
            	System.out.println("The Total: "+sum);
            	System.out.println("What rank do you have in the asura guild adventurer?");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.70;
        			System.out.println("You will get 30% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<sum) {
            			float kulang = sum - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float d_f_change = x - sum;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+d_f_change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            	}
            		
            	}
            	//Sword and Shield
            	else if(x==1 && m==4) {
            		float sum=Sword+Shield;
            	System.out.println("So you chose "+d+" and "+g);
            	System.out.println("The Total: "+sum);
            	System.out.println("What rank do you have in the asura guild adventurer?");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.70;
        			System.out.println("You will get 30% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<sum) {
            			float kulang = sum - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float d_g_change = x - sum;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+d_g_change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            	}
            		
            	}
            	//Sword and Ring
            	else if(x==1 && m==5) {
            		float sum=Sword+Ring;
            	System.out.println("So you chose "+d+" and "+h);
            	System.out.println("The Total: "+sum);
            	System.out.println("What rank do you have in the asura guild adventurer?");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        			
        		}
            	if(p==2) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.70;
        			System.out.println("You will get 30% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<sum) {
            			float kulang = sum - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float d_h_change = x - sum;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+d_h_change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            	}
            		
            	}
            	//Bow and Elixer
            	else if(x==2 && m==3) {
            		float sum=Bow+Elixer;
            	System.out.println("So you chose "+e+" and "+f);
            	System.out.println("The Total: "+sum);
            	System.out.println("What rank do you have in the asura guild adventurer?");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.70;
        			System.out.println("You will get 30% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<sum) {
            			float kulang = sum - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float e_f_change = x - sum;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+e_f_change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		
            		break;
            	}
            		
            	}
            	//Bow and Shield
            	else if(x==2 && m==4) {
            		float sum=Bow+Shield;
            	System.out.println("So you chose "+e+" and "+g);
            	System.out.println("The Total: "+sum);
            	System.out.println("What rank do you have in the asura guild adventurer?");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
        			
        		}
            	if(p==1) {
        			double discount = sum*0.70;
        			System.out.println("You will get 30% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<sum) {
            			float kulang = sum - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float e_g_change = x - sum;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+e_g_change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            	}
            		
            	}
            	//Bow and Ring
            	else if(x==2 && m==5) {
            		float sum=Bow+Ring;
            	System.out.println("So you chose "+e+" and "+h);
            	System.out.println("The Total: "+sum);
            	System.out.println("What rank do you have in the asura guild adventurer?");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        			
        		}
            	if(p==2) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.70;
        			System.out.println("You will get 30% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<sum) {
            			float kulang = sum - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		
            		}while(x<sum);
            	
            		float e_h_change = x - sum;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+e_h_change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            	}
            		
            	}
            	//Elixer and Shield
            	else if(x==3 && m==4) {
            		float sum=Elixer+Shield;
            	System.out.println("So you chose "+f+" and "+g);
            	System.out.println("The Total: "+sum);
            	System.out.println("What rank do you have in the asura guild adventurer?");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.70;
        			System.out.println("You will get 30% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<sum) {
            			float kulang = sum - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		
            		}
            		
            		}while(x<sum);
            	
            		float f_g_change = x - sum;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+f_g_change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            	}
            		
            	}
            	//Elixer and Ring
            	else if(x==3 && m==5) {
            		float sum=Elixer+Ring;
            	System.out.println("So you chose "+f+" and "+h);
            	System.out.println("The Total: "+sum);
            	System.out.println("What rank do you have in the asura guild adventurer?");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.70;
        			System.out.println("You will get 30% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<sum) {
            			float kulang = sum - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float f_h_change = x - sum;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+f_h_change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            	}
            		
            	}
            	//Shield and Ring
            	else if(x==4 && m==5) {
            		float sum=Shield+Ring;
            	System.out.println("So you chose "+g+" and "+h);
            	System.out.println("The Total: "+sum);
            	System.out.println("What rank do you have in the asura guild adventurer?");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.70;
        			System.out.println("You will get 30% discount!");
        			System.out.println("Your total Payment with discount will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double kulang = discount - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
            		x=a.nextInt();
            		if(x<sum) {
            			float kulang = sum - x;
            			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float g_h_change = x - sum;
            		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+g_h_change);
            		System.out.println("I'll add in 10 healing potions adventurer");
            		System.out.println("Thank you for Purchasing! til we meet again.");
            		break;
            	}
            		
            	}
            	
            	
            	
            }
            //3 items
            else if (x==3) {
            	System.out.println("What Items would you like to buy adventurer?"+"\n"+"(Just type the item numbers and Please type the numbers in an ascending order example (1,2,3,4,5))");
            	System.out.println("IF YOU BREAK THIS RULE YOU WILL BE CURSED AND I WILL BE GONE!");
            	x=a.nextInt();
            	m=a.nextInt();
            	y=a.nextInt();
            	//Sword and Bow and Elixer
            	if(x==1 && m==2 && y==3) {            	
            		float sum = Sword+Bow+Elixer;
            		System.out.println("So you chose "+d+" and "+e+" and "+f);
            		System.out.println("The Total: "+sum);
            		System.out.println("What rank do you have in the asura guild adventurer?");
                	p=a.nextInt();
                	if(p==3) {
            			double discount = sum *0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==2) {
            			double discount = sum*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==1) {
            			double discount = sum*0.70;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	else {
                	do {
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<sum) {
                			float kulang = sum - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");	
                		}
                		
                		}while(x<sum);
                	
                		float change = x - sum;
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
                	}
            	}
            	//Sword and Bow and Shield
            	else if(x==1 && m==2 && y==4) {            	
            		float sum = Sword+Bow+Shield;
            		System.out.println("So you chose "+d+" and "+e+" and "+g);
            		System.out.println("The Total: "+sum);
            		System.out.println("What rank do you have in the asura guild adventurer?");
                	p=a.nextInt();
                	if(p==3) {
            			double discount = sum *0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==2) {
            			double discount = sum*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==1) {
            			double discount = sum*0.70;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	else {
                	do {
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<sum) {
                			float kulang = sum - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");	
                		}
                		
                		}while(x<sum);
                	
                		float change = x - sum;
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
                	}
            	}
            	//Sword and Bow and Ring
            	if(x==1 && m==2 && y==5) {            	
            		float sum = Sword+Bow+Ring;
            		System.out.println("So you chose "+d+" and "+e+" and "+h);
            		System.out.println("The Total: "+sum);
            		System.out.println("What rank do you have in the asura guild adventurer?");
                	p=a.nextInt();
                	if(p==3) {
            			double discount = sum *0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==2) {
            			double discount = sum*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==1) {
            			double discount = sum*0.70;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	else {
                	do {
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<sum) {
                			float kulang = sum - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");	
                		}
                		
                		}while(x<sum);
                	
                		float change = x - sum;
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
                	}
            	}
            	//Bow and Elixer and Shield
            	else if(x==2 && m==3 && y==4) {            	
            		float sum = Bow+Elixer+Shield;
            		System.out.println("So you chose "+e+" and "+f+" and "+g);
            		System.out.println("The Total: "+sum);
            		System.out.println("What rank do you have in the asura guild adventurer?");
                	p=a.nextInt();
                	if(p==3) {
            			double discount = sum *0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==2) {
            			double discount = sum*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==1) {
            			double discount = sum*0.70;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	else {
                	do {
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<sum) {
                			float kulang = sum - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");	
                		}
                		
                		}while(x<sum);
                	
                		float change = x - sum;
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
                	}
            	}
            	//Bow and Elixer and Ring
            	else if(x==2 && m==3 && y==5) {            	
            		float sum = Bow+Elixer+Ring;
            		System.out.println("So you chose "+e+" and "+f+" and "+h);
            		System.out.println("The Total: "+sum);
            		System.out.println("What rank do you have in the asura guild adventurer?");
                	p=a.nextInt();
                	if(p==3) {
            			double discount = sum *0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==2) {
            			double discount = sum*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==1) {
            			double discount = sum*0.70;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	else {
                	do {
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<sum) {
                			float kulang = sum - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");	
                			
                		}
                		
                		}while(x<sum);
                	
                		float change = x - sum;
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
                	}
            	}
            	else if(x==2 && m==3 && y==4) {            	
            		float sum = Bow+Elixer+Shield;
            		System.out.println("So you chose "+e+" and "+f+" and "+g);
            		System.out.println("The Total: "+sum);
            		System.out.println("What rank do you have in the asura guild adventurer?");
                	p=a.nextInt();
                	if(p==3) {
            			double discount = sum *0.90;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==2) {
            			double discount = sum*0.80;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==1) {
            			double discount = sum*0.70;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	else {
                	do {
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<sum) {
                			float kulang = sum - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");	
                		}
                		
                		}while(x<sum);
                	
                		float change = x - sum;
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
                	}
            	}
            	//Elixer and Shield and Ring
            	else if(x==3 && m==4 && y==5) {            	
            		float sum = Elixer+Shield+Ring;
            		System.out.println("So you chose "+f+" and "+g+" and "+g);
            		System.out.println("The Total: "+sum);
            		System.out.println("What rank do you have in the asura guild adventurer?");
                	p=a.nextInt();
                	if(p==3) {
            			double discount = sum *0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==2) {
            			double discount = sum*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	if(p==1) {
            			double discount = sum*0.70;
            			System.out.println("You will get 30% discount!");
            			System.out.println("Your total Payment with discount will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double kulang = discount - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double change = x - discount;
                		
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
            		}
                	else {
                	do {
                		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                		x=a.nextInt();
                		if(x<sum) {
                			float kulang = sum - x;
                			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                			System.out.println("Please Try Again");	
                		}
                		
                		}while(x<sum);
                	
                		float change = x - sum;
                		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                		System.out.println("I'll add in 10 healing potions and 5 mana potions adventurer");
                		System.out.println("Thank you for Purchasing! til we meet again.");
                		break;
                	}
            	}
            }
            	//4 items
            	else if (x==4) {
            		System.out.println("What Items would you like to buy adventurer?"+"\n"+"(Just type the item numbers and Please type the numbers in an ascending order example (1,2,3,4,5))");
                	System.out.println("IF YOU BREAK THIS RULE YOU WILL BE CURSED AND I WILL BE GONE!");
                	x=a.nextInt();
                	m=a.nextInt();
                	y=a.nextInt();
            		z=a.nextInt();
            		// Sword and Bow and Elixer and Shield
            		if(x==1 && m==2 && y==3 && z==4) {
            			float sum = Sword+Bow+Elixer+Shield;
                		System.out.println("So you chose "+d+" and "+e+" and "+f+"and"+g);
                		System.out.println("The Total: "+sum);
                		System.out.println("What rank do you have in the asura guild adventurer?");
                    	p=a.nextInt();
                    	if(p==3) {
                			double discount = sum *0.90;
                			System.out.println("You will get 10% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+h+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                		}
                    	if(p==2) {
                			double discount = sum*0.80;
                			System.out.println("You will get 20% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+h+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                		}
                    	if(p==1) {
                			double discount = sum*0.70;
                			System.out.println("You will get 30% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+h+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                		}
                    	else {
                    	do {
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<sum) {
                    			float kulang = sum - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");	
                    		}
                    		
                    		}while(x<sum);
                    	
                    		float change = x - sum;
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+h+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		
                    		break;
                    	}
            		}
            		//Bow and Elixer and Shield and Ring
            		else if(x==2 && m==3 && y==3 && z==5) {
            			float sum = Sword+Elixer+Shield+Ring;
                		System.out.println("So you chose "+e+" and "+f+" and "+g+"and"+h);
                		System.out.println("The Total: "+sum);
                		System.out.println("What rank do you have in the asura guild adventurer?");
                    	p=a.nextInt();
                    	if(p==3) {
                			double discount = sum *0.90;
                			System.out.println("You will get 10% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+d+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                			
                		}
                    	if(p==2) {
                			double discount = sum*0.80;
                			System.out.println("You will get 20% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+d+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                			
                		}
                    	if(p==1) {
                			double discount = sum*0.70;
                			System.out.println("You will get 30% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+d+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                			
                		}
                    	else {
                    	do {
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<sum) {
                    			float kulang = sum - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");	
                    		}
                    		
                    		}while(x<sum);
                    	
                    		float change = x - sum;
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+d+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
            		}
            	}
            	}
            	//5 items
            	else {
            		System.out.println("WOW! Are you serious you want to buy all my items adventurer?"+"\n"+"(Just type the item numbers and Please type the numbers in an ascending order example (1,2,3,4,5))");
                	System.out.println("IF YOU BREAK THIS RULE YOU WILL BE CURSED AND I WILL BE GONE!");
                	x=a.nextInt();
                	m=a.nextInt();
                	y=a.nextInt();
            		z=a.nextInt();
            		q=a.nextInt();
            		//Sword and Bow and Elixer and Shield and Ring
            		if(x==1 && m==2 && y==3 && z==4 && q==5) {
            			float sum = Sword+Bow+Elixer+Shield+Ring;
            			float sum2 = sum/2;
                		System.out.println("So you chose "+d+" and "+e+" and "+f+" and "+g+" and "+h);
                		System.out.println("The Total: "+sum);
                		System.out.println("But As a form of gratitude you will only pay "+sum2);
                		System.out.println("What rank do you have in the asura guild adventurer?");
                    	p=a.nextInt();
                    	if(p==3) {
                			double discount = sum2 *0.90;
                			System.out.println("You will get 10% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+h+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                			
                		}
                    	if(p==2) {
                			double discount = sum2*0.80;
                			System.out.println("You will get 20% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+h+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
                			
                		}
                    	if(p==1) {
                			double discount = sum2*0.70;
                			System.out.println("You will get 30% discount!");
                			System.out.println("Your total Payment with discount will be "+discount);
                			do {
                    			
                        		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                        		x=a.nextInt();
                        		if(x<discount) {
                        			
                        			double kulang = discount - x;
                        			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                        			System.out.println("Please Try Again");
                        			
                        			
                        			}
                        		
                        		}while(x<discount);
                			double change = x - discount;
                    		
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Amazing adventurer! As a form of gratitude I will give you "+h+" For Free");
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                			
                    		break;
                		}
                    	else {
                		
                    	do {
                    		System.out.println("Please Input The Payment Adventurer Preferably Gold ");
                    		x=a.nextInt();
                    		if(x<sum2) {
                    			float kulang = sum2 - x;
                    			System.out.println("Ooops it seems like you are short on "+kulang+ "gold adventurer.");
                    			System.out.println("Please Try Again");	
                    		}
                    		
                    		}while(x<sum2);
                    	
                    		float change = x - sum2;
                    		System.out.println("ohhh money money money mone-"+"\n"+"Oh sorry adventurer I got carried away, anyway here is you change:   "+change);
                    		System.out.println("Thank you for Purchasing! til we meet again.");
                    		break;
            			
            		}
            		
            	}
            	}
            	
            
                	
            
            
            
            
        }
    	
            }
    	} while (J.equals(b));
	
    }
	}
	
}
