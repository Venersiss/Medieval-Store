/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package custodio;

import java.util.Scanner;

/**
 *
 * @author Venersis
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        //Variables
        //Items variables
        String c = "spada";
        String d = "pana";
        String e = "elixer";
        String f = "shield";
        String g = "ring";
        //Items price
        int t = 0;
        int v = 0;
        int u = 0;
        int l = 15;
        int m = 10;
        int n = 20;
        int o = 25;
        int p = 30;
        String spada = null;
        String pana = null;
        String elixer = null;
        String shield = null;
        String ring = null;
        float total = 0;
        float total2 = 0;
        float total3 = 0;
        float kambyo;
        float kulang;
        //discount price
        double discount = 0;
        double discount2;
        //scanner variables
        String b;
        int i;
        int j;
        int q = 0;
        float bayad = 0;
        int r = 0;
        String k;
        int asura;
        String okay;

        System.out.println("                    ________________________________________________            ");
        System.out.println("                    uy pogi! paliti ko pogi be!");
        System.out.println("                    sige na pogi");
        System.out.println("                    type [okay]kung mamalit ka " + "\n" + "                    type basig unsa kung dli ka mamalit");
        System.out.println("                    ________________________________________________");
        b = a.next();
        if (b.equals("okay")) {
            do {
                System.out.println("                    ________________________________________________");
                System.out.println("                    ang akong baligya kay: ");
                System.out.println(c + " : " + l);
                System.out.println("                                |      x            |");
                System.out.println("                                |(xxxxxxx)>>>>>>>>  |");
                System.out.println("                                |      x            |");
                System.out.println("\n");
                System.out.println(d + " : " + m);
                System.out.println("                                |     x             |");
                System.out.println("                                |   |  x            |");
                System.out.println("                                |  |    x           |");
                System.out.println("                                | |-----x----->     |");
                System.out.println("                                |  |    x           |");
                System.out.println("                                |   |  x            |");
                System.out.println("                                |     x             |");
                System.out.println("\n");
                System.out.println(e + " : " + n);
                System.out.println("                                |       xx          |");
                System.out.println("                                |       xx          |");
                System.out.println("                                |      x  x         |");
                System.out.println("                                |     x=====x       |");
                System.out.println("                                |    x=======x      |");
                System.out.println("                                |     x=====x       |");
                System.out.println("                                |      x===x        |");
                System.out.println("                                |       x x         |");
                System.out.println("\n");
                System.out.println(f + " : " + o);
                System.out.println("                                |    X        X     |");
                System.out.println("                                |    xxxxxxxxxx     |");
                System.out.println("                                |    xxxxxxxxxx     |");
                System.out.println("                                |    xxxxxxxxxx     |");
                System.out.println("                                |     xxxxxxxx      |");
                System.out.println("                                |      xxxxxx       |");
                System.out.println("                                |       xxxx        |");
                System.out.println("                                |        xx         |");
                System.out.println("\n");
                System.out.println(g + " : " + p);
                System.out.println("                                |       xxx         |   ");
                System.out.println("                                |    xx     xx      |   ");
                System.out.println("                                |   xx       xx     |   ");
                System.out.println("                                |    xx     xx      |   ");
                System.out.println("                                |       xxx         |   ");
                System.out.println("                    ________________________________________________");
                System.out.println("                    naa mi promo kung mamalit ka ug 10 pataas na item naa kay 10% discount kung mamalit ka ug 20 pataas na item naa kay 30% na discount");
                System.out.println("                    ________________________________________________");
                System.out.println("                    naa pud mi discount sa mga member sa asura guild depende sa rank " + "\n" + "                    if rank 3 naay 10% discount" + "\n" + "                    if rank 2 naay 20% discount" + "\n" + "                    if rank 1 naay 30% discount");
                System.out.println("                    ________________________________________________");
                System.out.println("                    asa imoha ani dong? type lang ilang ngalan");
                k = a.next();
                if (k.equals(k)) {                 
                   if (k.equals("spada")) {
                        System.out.println("________________________________________________");
                        System.out.println("ang imong gipili kay " + k);
                        i = 15;
                        System.out.println("pila man kabuok imoha dong?");
                        q = a.nextInt();
                        v = v + q;
                        total2 = (i * q)  + total;                                                
                         System.out.println(t);
                        System.out.println("ang imo bayronon kay " + total2);
                        total=total2;                                                   
                    }else if(k.equals("pana")) {
                        System.out.println("________________________________________________");
                        System.out.println("ang imong gipili kay " + k);
                        i = 10;
                        System.out.println("pila man kabuok imoha dong?");
                        q = a.nextInt();
                        v = v + q;
                        total2 = (i * q)  + total;                                                
                         System.out.println("ang imo bayronon kay " + total2);
                         total=total2;                                          
                    }else if(k.equals("elixer")) {
                        System.out.println("________________________________________________");
                        System.out.println("ang imong gipili kay " + k);
                        i = 20;
                        System.out.println("pila man kabuok imoha dong?");
                        q = a.nextInt();
                        v = v+ q;
                        total2 = (i * q)  + total;                        
                         System.out.println("ang imo bayronon kay " + total2);
                         total=total2;                                           
                    } else if (k.equals("shield")) {
                        System.out.println("________________________________________________");
                        System.out.println("ang imong gipili kay " + k);
                        i = 25;
                        System.out.println("pila man kabuok imoha dong?");
                        q = a.nextInt();
                        v = v + q;
                        total2 = (i * q)  + total;                                                
                         System.out.println("ang imo bayronon kay " + total2);
                         total=total2;                                            
                    } else if (k.equals("ring")) {
                        System.out.println("________________________________________________");
                        System.out.println("ang imong gipili kay " + k);
                        i = 30;
                        System.out.println("pila man kabuok imoha dong?");
                        q = a.nextInt();
                        v=v+q;
                       total2 = (i * q)  + total;                                              
                         System.out.println("ang imo bayronon kay " + total2);
                         total=total2;                                                                  
                    }System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                    r = a.nextInt();                  
                    if (r == 2) {                       
                        if (v >= 10) {
                            System.out.println("kay "+v+" man kabuok imong item gipalit naa kay libre nga 10 healing potions!");                          
                        } else if (v >= 20) {
                            System.out.println("kay "+v+" man kabuok imong item gipalitnaa kay libre 10 healing potions ug 10 mana potions!");                                                                                          
                        }System.out.println("Ang imo bayronon kay " + total2);
                        System.out.println("member ka sa asura guild? unsa ka nga rank?");
                        asura = a.nextInt();
                        if (asura == 3 || asura == 2 || asura == 1 || asura == 0) {
                            if (asura == 3) {
                                System.out.println("naa kay 10% discount");
                                total2 = (float) (total2 * 0.90);
                            } else if (asura == 2) {
                                System.out.println("naa kay 20% discount");
                                total2 = (float) (total2 * 0.80);
                            } else if (asura == 1) {
                                System.out.println("naa kay 30% discount");
                                total2 = (float) (total2 * 0.70);
                            } else {
                                System.out.println("wala kay discount");
                            }
                        }System.out.println("ang imo bayronon kay " + total2);
                        System.out.println("palihog butang sa imo bayad");
                        bayad = a.nextFloat();
                        while (bayad < total2) {
                            if (bayad < total2) {
                                kulang = (float) (total2 - bayad);
                                System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                System.out.println("palihog ko dungag");
                                int dungag = a.nextInt();
                                bayad = bayad + dungag;
                            }
                        }if (bayad >= total2) {
                            kambyo = (float) (bayad - total2);
                            System.out.println("imo kambyo kay " + kambyo);
                            System.out.println("For the next customer press 1");
                            q = a.nextInt();
                        }
                    }
                }
            } while (r == 1 || q == 1);
        } else {
            System.out.println("edi dont!");
        }
    }
}
