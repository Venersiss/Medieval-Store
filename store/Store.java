/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.store_joption;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Venersis
 */
public class Store {

    public static void main(String[] args) {
        // TODO code application logic here

        Map m = new HashMap();       
        m.put("tshirt", 250);
        m.put("trouser", 300);
        m.put("jacket", 500);
        m.put("shoes", 1500);
        m.put("hoodie", 450);
        String [] i = {"Oxygen T shirt","Oxygen Trouser","Penshoppe Jacket","Penshoppe Hoodie","Nike Shoes"};
        String[] y = {" ", " ", " "};
        float[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0};
        int[] w = {0};
        do {
            x[5] = 0;
            x[1] = 0;
            x[3] = 0;
            x[4] = 0;
            do {
               
                y[0] = JOptionPane.showInputDialog("xygen T shirt                    :250 " + "\n" + "Oxygen Trouser              :300 " + "\n" + "Penshoppe Jacket         :500 " + "\n" + "Penshoppe Hoodie         :450 " + "\n" + "Nike Shoes                       :1500 " + "\n" + "What Is Your Order? \n \n \n [tshirt] [trouser] [jacket] [hoodie] [shoes]");
                if (m.containsKey(y[0])) {
                    float z = (int) m.get(y[0]);

                    y[2] = JOptionPane.showInputDialog("how many?");
                    x[2] = Float.parseFloat(y[2]);
                    x[3] = z * x[2];
                    x[1] = x[2] + x[1];
                    x[5] = x[3] + x[4];
                    JOptionPane.showMessageDialog(null, "total is " + x[5]);
                    x[4] = x[5];
                    
                    

                        
                        
                    
                }
                y[1] = JOptionPane.showInputDialog("Do You Want To buy Again?" + "\n" + "[yes] or [no]");
            } while (y[1].equals("yes"));
           
                if (x[1] >= 10 && x[1] <= 20) {
                    JOptionPane.showMessageDialog(null, "Since You Bought " + x[1] + " Item You Get 2 Free Items Of Your Choice");
                } 
                if (x[1]<10){
                                    JOptionPane.showMessageDialog(null, "Since You Bought " + x[1] + " Item Only You Get No Freebies");
                }
                if (x[1]>21){
                                    JOptionPane.showMessageDialog(null, "Since You Bought " + x[1] + " Item You Get 3 Items Of Your Choice");
                }

                JOptionPane.showMessageDialog(null, "Your Total Balance " + x[4]);
                do {
                    y[2] = JOptionPane.showInputDialog("We Have Discounts For People Whose Age is [15-20], [30-40], and [50-60] \n \n Please Type Your Age Below");
                    x[10]=Float.parseFloat(y[2]);
                    

                        if (x[10]>=15 && x[10]<=20){
                            JOptionPane.showMessageDialog(null, "You Get 10% Discount");
                            x[5] = (float) (x[5] * 0.90);
                        }
                        else if (x[10]>=30 && x[10]<=40){
                            JOptionPane.showMessageDialog(null, "You Get 20% discount");
                            x[5] =  (float) (x[5] * 0.80);
                        }
                        else if (x[10]>=50 && x[10]<=60){
                            JOptionPane.showMessageDialog(null, "You Get 30% discount");
                            x[5] =  (float) (x[5] * 0.70);
                        }
                        
                        else{
                            JOptionPane.showMessageDialog(null, "We Dont Have A Discount For Your Age");
                            
                        }
                    
                } while (x[9]==1);

                
                y[2] = JOptionPane.showInputDialog("Total Payable Amount: "+x[5]+"\n \nPlease Input Payment");
                x[6] = Float.parseFloat(y[2]);
                do {
                    if (x[6] < x[5]) {
                        x[7] = (x[5] - x[6]);
                        JOptionPane.showMessageDialog(null, "Insufficient Payment Please Add: " + x[7]);
                        y[2] = JOptionPane.showInputDialog("Total Payable Amount: "+x[7]+"\n \nPlease Input Payment");
                        float dungag = Float.parseFloat(y[2]);
                        x[6] = x[6] + dungag;
                    }
                } while (x[6] < x[5]);
                if (x[6] >= x[5]) {
                    float kambyo = (x[6] - x[5]);
                    JOptionPane.showMessageDialog(null, "Your Change " + kambyo);
                    y[2] = JOptionPane.showInputDialog("For the next customer press 1");
                    x[2] = Float.parseFloat(y[2]);
                }
            
            
        } while (x[2] == 1);
    }
}
