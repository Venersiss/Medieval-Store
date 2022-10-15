/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package custodio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Venersis
 */
public class practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        Map m = new HashMap();
        m.put("spada", 15);
        m.put("pana", 10);
        m.put("elixer", 20);
        m.put("shield", 25);
        m.put("ring", 30);
        String b;
        String f = null;
        String mamalit = "mamalit";
        int bayad;
        int kulang;
        int asura;
        int d = 0;
        int v = 0;
        int c = 0;
        int total;
        int total2 = 0;
        int total3 = 0;
        do {
            do {
                System.out.println("spada    :15 " + "\n" + "pana     :10 " + "\n" + "elixer   :20 " + "\n" + "shield   :25 " + "\n" + "ring     :30 " + "\n"+"unsa man imoha dong");           
                b = a.next();
                if (m.containsKey(b)) {int z = (int) m.get(b);
                    System.out.println("how many");
                    c = a.nextInt();
                    total = z * c;
                    v = c + d;
                    total3 = total + total2;
                    System.out.println("total is " + total3);
                    total2 = total3;
                    d = c;
                    while (true) {System.out.println("mamalit paka or dili na?" + "\n" + "[mamalit] or [dili]");
                        f = a.next();
                        if (f.equals("mamalit") || f.equals("dili")) {  break;}
                    }
                } 
            } while (f.equals("mamalit"));
            if (f.equals("dili")) {
                if (v >= 10 && v < 20) {
                    System.out.println("kay " + v + " man kabuok imong item gipalit naa kay libre nga 10 healing potions!");
                } else if (v >= 20) { System.out.println("kay " + v + " man kabuok imong item gipalitnaa kay libre 10 healing potions ug 10 mana potions!");}
                System.out.println("Ang imo bayronon kay " + total2);
                System.out.println("member ka sa asura guild? unsa ka nga rank?");
                asura = a.nextInt();
                switch (asura) {
                    case 3:
                        System.out.println("naa kay 10% discount");
                        total3 = (int) (total3 * 0.90);
                        break;
                    case 2:
                        System.out.println("naa kay 20% discount");
                        total3 = (int) (total3 * 0.80);
                        break;
                    case 1:
                        System.out.println("naa kay 30% discount");
                        total3 = (int) (total3 * 0.70);
                        break;
                    default:
                        System.out.println("wala kay discount");
                        break;}

                System.out.println("ang imo bayronon kay " + total3);
                System.out.println("palihog butang sa imo bayad");
                bayad = a.nextInt();
                do {if (bayad < total3) {
                        kulang = (total3 - bayad);
                        System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                        System.out.println("palihog ko dungag");
                        int dungag = a.nextInt();
                        bayad = bayad + dungag;}  
                } while (bayad < total3);
                if (bayad >= total3) {int kambyo = (bayad - total3);
                    System.out.println("imo kambyo kay " + kambyo);
                    System.out.println("For the next customer press 1");
                    c = a.nextInt();}
            }
        } while (c == 1);
    }
}
