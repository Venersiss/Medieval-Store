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
    // Ivan Pogi Ugh hacker XD xXH4cKerXx

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Scanner a = new Scanner(System.in);    	
    	String b = "yes";
		String c = "no";
		String d= "Bioluminiscence Sword ";
		String e = "The Almighty Dragon Slayer Bow ";
		String f = "Greater Elixer ";
		String g = "The Unmoving Shield of the Great Hermit ";
		String h = "Fragment of Ring of the Celestial King ";
		System.out.println("Welcome Adventurer!"+"\n"+"What brings you here?"+"\n"+"If you want to take a look at my shope type yes if not then type no");
		String J=a.next();
		String n = "I";
		int m ;
       
        

        
        	System.out.println("If you want to take a look at the list of the items just press I");
        	J=a.next();
        	
        		System.out.println("\n"+"1:"+d+"\n"+"\n"+"2:"+e+"\n"+"\n"+"3:"+f+"\n"+"\n"+"4:"+g+"\n"+"\n"+"5:"+h+"\n");
        		do  {
        		System.out.println("If you want to see the details of each item just type their item number"+"\n"+"If you are done looking at the details then press 6");
        	m=a.nextInt();
        	do {
            switch (m) {
                case 1:
                    System.out.println("Bioluminiscence Sword"+"\n"+"(It is made from the metal acquired after killing the ancient Bioluminiscent Dragon");
                    System.out.println("\n"+"Attack 100  "+"\n"+"Defense  60 "+"\n"+"Agility  70 ");
                    break;
                    
                case 2:
                    System.out.println("The Almighty Dragon Slayer Bow"+"\n"+"It is once used by the King of Elves while defending their kingdom from the invading dragon");
                    System.out.println("\n"+"Attack 200  "+"\n"+"Defense  30 "+"\n"+"Agility  50 ");
                    break;
                case 3:
                	System.out.println("Greater Elixer"+"\n"+"(No one Knows where it came from but there is a saying that it came from the tears of an angel after betrayed by her beloved)");
                	System.out.println("\n"+"It can Heal all types of wounds and cleanse all debuff");
                    break;
            }
            
      	}while ( m==1 && m==2 && m==3 && m==4 && m==5);
        	System.out.println("\n");
        	System.out.println("Do you want to look at another Item?");	
            System.out.println("yes or no?");
            J=a.next();
        }while(J.equals(b));
       System.out.println("Have you chosen your desired item Adventurer?");

    }

}