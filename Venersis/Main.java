/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package custodio;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

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
        float total2;
        float total3;
        float kambyo;
        float kulang;

        //discount price
        double discount = 0;
        double discount2;
        //scanner variables
        int b;
        int i;
        int j;
        int q;
        float bayad = 0;
        int r;
        String k;
        int asura;

        System.out.println("hi dong self service ni nga tindahan paningkamot ug imoha");
        System.out.println("type 1 if kasabot ka type 2 kung wala");
        b = a.nextInt();

        if (b == 1) {
            do {
                System.out.println("ang akong baligya kay: ");
                System.out.println(c + " : " + l);
                System.out.println(d + " : " + m);
                System.out.println(e + " : " + n);
                System.out.println(f + " : " + o);
                System.out.println(g + " : " + p);
                System.out.println("________________________________________________");
                System.out.println("naa mi promo kung mamalit ka ug 10 pataas na item naa kay 10% discount kung mamalit ka ug 20 pataas na item naa kay 30% na discount");
                System.out.println("________________________________________________");
                System.out.println("naa pud mi discount sa mga member sa asura guild depende sa rank "+"\n"+"if rank 3 naay 10% discount"+"\n"+"if rank 3 naay 10% discount"+"\n"+" if rank 1 naay 30% discount");
                System.out.println("________________________________________________");
                System.out.println("asa imoha ani dong? type lang ilang ngalan");
                k = a.next();
                while (k.equals("spada")) {
                    System.out.println("________________________________________________");
                    System.out.println("ang imong gipili kay " + c);
                    do {
                        System.out.println("ibutang ang price dong");
                        i = a.nextInt();

                        if (i < 15  || i > 15) {
                            System.out.println("atikon gyud kayka balika ug utro didto");

                        }
                    } while (i < 15 || i > 15);
                    if (i == 15) {
                        System.out.println("________________________________________________");
                        System.out.println("tama ang price gibutang");
                        System.out.println("pila man kabuok imoha dong?");
                        q = a.nextInt();
                        total2 = (i * q) + total;

                        if (q >= 10) {
                            System.out.println("________________________________________________");
                            System.out.println("Kay namalit manka ug 10 kabuok naa kay libre nga 10 healing potions");

                            System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();

                             if(asura==3){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                            System.out.println("________________________________________________");
                            System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                            r = a.nextInt();
                            if (r == 1) {
                                break;
                            }

                            do {
                                System.out.println("________________________________________________");
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < discount) {
                                    kulang = (float) (discount - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < discount);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - discount);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }




                        }

                         if (q >= 20) {
                             System.out.println("________________________________________________");
                            System.out.println("Kay namalit manka ug 20 kabuok naa kay libre nga 10 healing potions ug 10 mana potions");

                            System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();
                             if(asura==3){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }

                            System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                            r = a.nextInt();
                            if (r == 1) {
                                break;
                            }

                            do {
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < discount) {
                                    kulang = (float) (discount - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < discount);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - discount);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }




                        }
                        if(q<10){

                              do {
                                  System.out.println("ang imo bayronon kay "+total2);
                                   System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();
                                if(asura==3){
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }

                                System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                                r=a.nextInt();
                                if(r==1){
                                 break;
                                }
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < total2) {
                                    kulang = (float) (total2 - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < total2);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - total2);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }
                        }

                    }


                }
                while (k.equals("pana")) {
                    System.out.println("________________________________________________");
                    System.out.println("ang imong gipili kay " + k);
                    do {
                        System.out.println("ibutang ang price dong");
                        i = a.nextInt();

                        if (i < 10  || i > 10) {
                            System.out.println("atikon gyud kayka balika ug utro didto");

                        }
                    } while (i < 10 || i > 10);
                    if (i == 15) {
                        System.out.println("________________________________________________");
                        System.out.println("tama ang price gibutang");
                        System.out.println("pila man kabuok imoha dong?");
                        q = a.nextInt();
                        total2 = (i * q) + total;

                        if (q >= 10) {
                            System.out.println("________________________________________________");
                            System.out.println("Kay namalit manka ug 10 kabuok naa kay libre nga 10 healing potions");

                            System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();

                             if(asura==3){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                            System.out.println("________________________________________________");
                            System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                            r = a.nextInt();
                            if (r == 1) {
                                break;
                            }

                            do {
                                System.out.println("________________________________________________");
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < discount) {
                                    kulang = (float) (discount - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < discount);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - discount);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }




                        }

                         if (q >= 20) {
                             System.out.println("________________________________________________");
                            System.out.println("Kay namalit manka ug 20 kabuok naa kay libre nga 10 healing potions ug 10 mana potions");

                            System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();
                             if(asura==3){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }

                            System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                            r = a.nextInt();
                            if (r == 1) {
                                break;
                            }

                            do {
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < discount) {
                                    kulang = (float) (discount - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < discount);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - discount);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }




                        }
                        if(q<10){

                              do {
                                  System.out.println("ang imo bayronon kay "+total2);
                                   System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();
                                if(asura==3){
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }

                                System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                                r=a.nextInt();
                                if(r==1){
                                 break;
                                }
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < total2) {
                                    kulang = (float) (total2 - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < total2);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - total2);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }
                        }

                    }


                }
                while (k.equals("elixer")) {
                    System.out.println("________________________________________________");
                    System.out.println("ang imong gipili kay " + k);
                    do {
                        System.out.println("ibutang ang price dong");
                        i = a.nextInt();

                        if (i < 20  || i > 20) {
                            System.out.println("atikon gyud kayka balika ug utro didto");

                        }
                    } while (i < 20 || i > 20);
                    if (i == 20) {
                        System.out.println("________________________________________________");
                        System.out.println("tama ang price gibutang");
                        System.out.println("pila man kabuok imoha dong?");
                        q = a.nextInt();
                        total2 = (i * q) + total;

                        if (q >= 10) {
                            System.out.println("________________________________________________");
                            System.out.println("Kay namalit manka ug 10 kabuok naa kay libre nga 10 healing potions");

                            System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();

                             if(asura==3){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                            System.out.println("________________________________________________");
                            System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                            r = a.nextInt();
                            if (r == 1) {
                                break;
                            }

                            do {
                                System.out.println("________________________________________________");
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < discount) {
                                    kulang = (float) (discount - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < discount);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - discount);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }




                        }

                         if (q >= 20) {
                             System.out.println("________________________________________________");
                            System.out.println("Kay namalit manka ug 20 kabuok naa kay libre nga 10 healing potions ug 10 mana potions");

                            System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();
                             if(asura==3){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }

                            System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                            r = a.nextInt();
                            if (r == 1) {
                                break;
                            }

                            do {
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < discount) {
                                    kulang = (float) (discount - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < discount);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - discount);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }




                        }
                        if(q<10){

                              do {
                                  System.out.println("ang imo bayronon kay "+total2);
                                   System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();
                                if(asura==3){
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }

                                System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                                r=a.nextInt();
                                if(r==1){
                                 break;
                                }
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < total2) {
                                    kulang = (float) (total2 - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < total2);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - total2);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }
                        }

                    }


                }
                while (k.equals("shield")) {
                    System.out.println("________________________________________________");
                    System.out.println("ang imong gipili kay " + k);
                    do {
                        System.out.println("ibutang ang price dong");
                        i = a.nextInt();

                        if (i < 25  || i > 25) {
                            System.out.println("atikon gyud kayka balika ug utro didto");

                        }
                    } while (i < 25 || i > 25);
                    if (i == 25) {
                        System.out.println("________________________________________________");
                        System.out.println("tama ang price gibutang");
                        System.out.println("pila man kabuok imoha dong?");
                        q = a.nextInt();
                        total2 = (i * q) + total;

                        if (q >= 10) {
                            System.out.println("________________________________________________");
                            System.out.println("Kay namalit manka ug 10 kabuok naa kay libre nga 10 healing potions");

                            System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();

                             if(asura==3){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                            System.out.println("________________________________________________");
                            System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                            r = a.nextInt();
                            if (r == 1) {
                                break;
                            }

                            do {
                                System.out.println("________________________________________________");
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < discount) {
                                    kulang = (float) (discount - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < discount);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - discount);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }




                        }

                         if (q >= 20) {
                             System.out.println("________________________________________________");
                            System.out.println("Kay namalit manka ug 20 kabuok naa kay libre nga 10 healing potions ug 10 mana potions");

                            System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();
                             if(asura==3){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }

                            System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                            r = a.nextInt();
                            if (r == 1) {
                                break;
                            }

                            do {
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < discount) {
                                    kulang = (float) (discount - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < discount);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - discount);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }




                        }
                        if(q<10){

                              do {
                                  System.out.println("ang imo bayronon kay "+total2);
                                   System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();
                                if(asura==3){
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }

                                System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                                r=a.nextInt();
                                if(r==1){
                                 break;
                                }
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < total2) {
                                    kulang = (float) (total2 - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < total2);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - total2);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }
                        }

                    }


                }
                while (k.equals("ring")) {
                    System.out.println("________________________________________________");
                    System.out.println("ang imong gipili kay " + k);
                    do {
                        System.out.println("ibutang ang price dong");
                        i = a.nextInt();

                        if (i < 30  || i > 30) {
                            System.out.println("atikon gyud kayka balika ug utro didto");

                        }
                    } while (i < 30 || i > 30);
                    if (i == 30) {
                        System.out.println("________________________________________________");
                        System.out.println("tama ang price gibutang");
                        System.out.println("pila man kabuok imoha dong?");
                        q = a.nextInt();
                        total2 = (i * q) + total;

                        if (q >= 10) {
                            System.out.println("________________________________________________");
                            System.out.println("Kay namalit manka ug 10 kabuok naa kay libre nga 10 healing potions");

                            System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();

                             if(asura==3){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                            System.out.println("________________________________________________");
                            System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                            r = a.nextInt();
                            if (r == 1) {
                                break;
                            }

                            do {
                                System.out.println("________________________________________________");
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < discount) {
                                    kulang = (float) (discount - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < discount);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - discount);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }




                        }

                         if (q >= 20) {
                             System.out.println("________________________________________________");
                            System.out.println("Kay namalit manka ug 20 kabuok naa kay libre nga 10 healing potions ug 10 mana potions");

                            System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();
                             if(asura==3){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                 System.out.println("________________________________________________");
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }

                            System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                            r = a.nextInt();
                            if (r == 1) {
                                break;
                            }

                            do {
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < discount) {
                                    kulang = (float) (discount - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < discount);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - discount);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }




                        }
                        if(q<10){

                              do {
                                  System.out.println("ang imo bayronon kay "+total2);
                                   System.out.println("member ka sa asura guild? unsa ka nga rank?");
                            asura=a.nextInt();
                                if(asura==3){
                                    System.out.println("naa kay 10% discount");
                                    discount=total2*0.90;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==2){
                                    System.out.println("naa kay 20% discount");
                                    discount=total2*0.80;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }
                             if(asura==1){
                                    System.out.println("naa kay 30% discount");
                                    discount=total2*0.70;
                                    System.out.println("so ang imohang bayrononon kay" +discount);
                                     total=(float) discount;
                                }

                                System.out.println("mamalit paka ug lain press 1 ug oo press 2 kung dli?");
                                r=a.nextInt();
                                if(r==1){
                                 break;
                                }
                                System.out.println("palihog butang sa imo bayad");
                                bayad = a.nextFloat();
                                if (bayad < total2) {
                                    kulang = (float) (total2 - bayad);
                                    System.out.println("kulang man imo gi bayad ang kulang kay: " + kulang);
                                }
                                  } while (bayad < total2);
                                if (bayad >= discount) {

                                kambyo = (float) (bayad - total2);
                                System.out.println("imo kambyo kay " + kambyo);
                                break;
                            }
                        }

                    }


                }
                System.out.println("press 1 para mo balik sa item list press 2 kung dli naka mamalit");
                j = a.nextInt();
            } while (j == 1);

        }
    }

}
