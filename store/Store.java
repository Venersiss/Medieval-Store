
package store;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Venersiss
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        Scanner a = new Scanner(System.in);
        Map m = new HashMap();
        JOptionPane.showMessageDialog(null,  "Uy choi!");
        m.put("spada", 15);
        m.put("pana", 10);
        m.put("elixer", 20);
        m.put("shield", 25);
        m.put("ring", 30);
        String b;
        String f = null;
        String pila;
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
            total3=0;
                v=0;
                total=0;
                total2=0;
            do {
                           
                b = JOptionPane.showInputDialog("spada    :15 " + "\n" + "pana     :10 " + "\n" + "elixer   :20 " + "\n" + "shield   :25 " + "\n" + "ring     :30 " + "\n"+"unsa man imoha dong");
                if (m.containsKey(b)) {int z = (int) m.get(b);
                    
                    pila = JOptionPane.showInputDialog("how many?");
                    c=Integer.parseInt(pila);
                    total = z * c;
                    v = c + d;
                    total3 = total + total2;
                    JOptionPane.showMessageDialog(null, "total is " + total3);
                    total2 = total3;
                    d = c;
                    while (true) {
                        
                        f = JOptionPane.showInputDialog("mamalit paka or dili na?" + "\n" + "[mamalit] or [dili]");
                        if (f.equals("mamalit") || f.equals("dili")) {  break;}
                    }
                } 
            } while (f.equals("mamalit"));
            if (f.equals("dili")) {
                if (v >= 10 && v < 20) {
                    JOptionPane.showMessageDialog(null, "kay " + v + " man kabuok imong item gipalit naa kay libre nga 10 healing potions!");
                } else if (v >= 20) { System.out.println("kay " + v + " man kabuok imong item gipalitnaa kay libre 10 healing potions ug 10 mana potions!");}
                
                JOptionPane.showMessageDialog(null, "Ang imo bayronon kay " + total2);
                
                pila = JOptionPane.showInputDialog("member ka sa asura guild? unsa na rank?");
                asura=Integer.parseInt(pila);
                switch (asura) {
                    case 3:
                        JOptionPane.showMessageDialog(null, "naa kay 10% discount");
                        total3 = (int) (total3 * 0.90);
                        break;
                    case 2:
                       JOptionPane.showMessageDialog(null, "naa kay 20% discount");
                        total3 = (int) (total3 * 0.80);
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "naa kay 30% discount");
                        total3 = (int) (total3 * 0.70);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "wala kay discount");
                        break;}

                JOptionPane.showMessageDialog(null,"ang imo bayronon kay " + total3);
               pila=JOptionPane.showInputDialog("palihog butang sa imo bayad");
                bayad = Integer.parseInt(pila);
                do {if (bayad < total3) {
                        kulang = (total3 - bayad);
                        JOptionPane.showMessageDialog(null ,"kulang man imo gi bayad ang kulang kay: " + kulang);
                        pila=JOptionPane.showInputDialog("palihog ko dungag");
                        int dungag = Integer.parseInt(pila);
                        bayad = bayad + dungag;}  
                } while (bayad < total3);
                if (bayad >= total3) {int kambyo = (bayad - total3);
                    JOptionPane.showMessageDialog(null ,"imo kambyo kay " + kambyo);
                   pila = JOptionPane.showInputDialog("For the next customer press 1");
                    c = Integer.parseInt(pila);}
                
            }
        } while (c == 1);
    }
    
}
