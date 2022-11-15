/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custodio;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Store_Story {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //arrays
        String[] Options = {"Beat the ass out of God", "Reprimand God for making the mistake and ask to undo His fault", "Say to God that it is no worries and just reincarnate you to another world"};
        String[] choice = {"Yes", "No", "I'd rather die"};
        String[] items = {"Bioluminiscent Sword", "Almighty Dragon Slayer Bow", "Greater Elixer", "Shield of the Great Hermit", "Ring of the Celestial King"};
        String[] how = {"", ""};
        float[] price = {15, 10, 20, 25, 30};
        float[] many = {0, 0, 0};
        float[] payment = {0, 0, 0};
        int[] input = {0, 0, 0, 0, 0, 0};
        int[] basic = {0};
        //Intro
        JOptionPane.showMessageDialog(null, "One day while walking down the street you got hit by lightning and barely survived,\n then suddenly a truck rammed into your barely surviving body. \n \n RIP...");
        do {
            basic[0] = 0;
            input[0] = JOptionPane.showOptionDialog(null, "After dying your soul transported to the realm between the living and the dead, there you met God and He apologized for mistakingly taking your life", "Choose an action", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Options, Options[0]);

//God option
            switch (input[0]) {

                case 0:
                    JOptionPane.showMessageDialog(null, "You awakened God's anger and you got sent into the void");
                    input[1] = JOptionPane.showOptionDialog(null, "Do you want undo your choice?", "Choose an action", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, choice, choice[0]);
                    if (input[1] == 0) {
                        basic[0] = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "You got sent to the void and will suffer for all eternity");
                    }
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Unfortunately God cannot undo his actions as it is forbidden to revive the living");
                    input[1] = JOptionPane.showOptionDialog(null, "Do you want undo your choice?", "Choose an action", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, choice, choice[0]);
                    if (input[1] == 0) {
                        basic[0] = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "You got sent to the void and will suffer for all eternity");
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "God is moved by your kindness and decided to reincarnate you the the world Yggdrasil \n it is a planet like earth located at the Andromeda Galaxy and has bizarre things not native to the planet earth");
                    basic[0] = 0;
                    break;
            }
        } while (basic[0] == 1);

//Yggdrasil
        JOptionPane.showMessageDialog(null, "Yggdrasil is a world full of wonders, it has things that defies the science and the laws of physics \n \n People who have Superhuman Abilities are divided into two groups \n \n  The Magicians: \n People who use mana to conjure all elements and can produce \n huge amount of power. \n \n The Martial Artists: \n These are the group of people althought not blessed with \n magic but blessed with super human strengths and abilities");
        JOptionPane.showMessageDialog(null, "God blessed you to be talented in both fields so whatever you choose you are guaranteed to excel");
        do {
            input[5]=0;
            input[2] = JOptionPane.showOptionDialog(null, "God offered to give you Overpowered items but the price would be you lifespan", "Choose an action", 0, JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);

            switch (input[2]) {
                case 0:
                    how[0] = JOptionPane.showInputDialog("You chose " + items[0] + "\n \n How many would you like to buy?");
                    many[0] = Float.parseFloat(how[0]);
                    many[1] = (price[0] * many[0]) - payment[1];
                    many[1] = many[1] - payment[0];
                    input[5] = JOptionPane.showConfirmDialog(null, "Would you like to buy again?");
                    break;
                case 1:
                    how[0] = JOptionPane.showInputDialog("You chose " + items[1] + "\n \n How many would you like to buy?");
                    many[0] = Float.parseFloat(how[0]);
                    payment[1] = (price[1] * many[0]) - payment[1];
                    many[1] = many[1] - payment[0];
                    input[5] = JOptionPane.showConfirmDialog(null, "Would you like to buy again?");
                    break;
                case 2:
                    how[0] = JOptionPane.showInputDialog("You chose " + items[2] + "\n \n How many would you like to buy?");
                    many[0] = Float.parseFloat(how[0]);
                    payment[1] = (price[2] * many[0]) - payment[1];
                    many[1] = many[1] - payment[0];
                    input[5] = JOptionPane.showConfirmDialog(null, "Would you like to buy again?");
                    break;
                case 3:
                    how[0] = JOptionPane.showInputDialog("You chose " + items[3] + "\n \n How many would you like to buy?");
                    many[0] = Float.parseFloat(how[0]);
                    payment[1] = (price[3] * many[0]) - payment[1];
                    many[1] = many[1] - payment[0];
                    input[5] = JOptionPane.showConfirmDialog(null, "Would you like to buy again?");
                    break;
                case 4:
                    how[0] = JOptionPane.showInputDialog("You chose " + items[4] + "\n \n How many would you like to buy?");
                    many[0] = Float.parseFloat(how[0]);
                    payment[1] = (price[4] * many[0]) - payment[1];
                    many[1] = many[1] - payment[0];
                    input[5] = JOptionPane.showConfirmDialog(null, "Would you like to buy again?");
                    break;
            }
        } while (input[5] == 1);
        input[3] = JOptionPane.showConfirmDialog(null, "Your total would be " + many[1] + " days of your lifespan");
        switch (input[3]) {
            case 0:
                how[1] = JOptionPane.showInputDialog("Please Input you payment: ");
                payment[0] = Float.parseFloat(how[1]);
                payment[1] = (payment[0] - many[1]) - payment[1];
                if (payment[1] >= 0) {
                    payment[2] = payment[1] - many[1];
                    JOptionPane.showMessageDialog(null, "Thank you for buying \n \n \n Your change is: " + payment[2]);
                } else {
                    do {
                        input[4] = 1;
                        JOptionPane.showMessageDialog(null, "Payment insufficient \n \n \n Need: " + payment[1]);
                        input[4] = JOptionPane.showConfirmDialog(null, "retry?");
                    } while (input[4] == 0);
                }
        }
    }
}
