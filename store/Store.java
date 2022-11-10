/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custodio;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Map m = new HashMap();
        JOptionPane.showMessageDialog(null, "Uy choi!");
        JOptionPane.showMessageDialog(null, "▬▬ι═══════ﺤ");
        JOptionPane.showMessageDialog(null, "⁽⁽(੭ꐦ •̀Д•́ )੭*⁾⁾");
        JOptionPane.showMessageDialog(null, "╭∩╮( •̀_•́ )╭∩╮");
        JOptionPane.showMessageDialog(null, "( -_•)╦̵̵̿╤─");
        JOptionPane.showMessageDialog(null, "(ง'̀-'́)ง");
        m.put("spada", 15);
        m.put("pana", 10);
        m.put("elixer", 20);
        m.put("shield", 25);
        m.put("ring", 30);
        String [] i = {"spada","pana","elixer","shield","ring"};
        String[] y = {" ", " ", " "};
        float[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] w = {0};
        do {
            x[5] = 0;
            x[1] = 0;
            x[3] = 0;
            x[4] = 0;
            do {

                y[0] = JOptionPane.showInputDialog("spada    :15 " + "\n" + "pana     :10 " + "\n" + "elixer   :20 " + "\n" + "shield   :25 " + "\n" + "ring     :30 " + "\n" + "unsa man imoha dong");
                if (m.containsKey(y[0])) {
                    float z = (int) m.get(y[0]);

                    y[2] = JOptionPane.showInputDialog("how many?");
                    x[2] = Float.parseFloat(y[2]);
                    x[3] = z * x[2];
                    x[1] = x[2] + x[0];
                    x[5] = x[3] + x[4];
                    JOptionPane.showMessageDialog(null, "total is " + x[5]);
                    x[4] = x[5];
                    x[0] = x[2];
                    while (true) {

                        y[1] = JOptionPane.showInputDialog("mamalit paka or dili na?" + "\n" + "[mamalit] or [dili]");
                        if (y[1].equals("mamalit") || y[1].equals("dili")) {
                            break;
                        }
                    }
                }
            } while (y[1].equals("mamalit"));
            if (y[1].equals("dili")) {
                if (x[1] >= 10 && x[1] < 20) {
                    JOptionPane.showMessageDialog(null, "kay " + x[1] + " man kabuok imong item gipalit naa kay libre nga 10 healing potions!");
                } else if (x[1] >= 20) {
                    System.out.println("kay " + x[1] + " man kabuok imong item gipalitnaa kay libre 10 healing potions ug 10 mana potions!");
                }

                JOptionPane.showMessageDialog(null, "Ang imo bayronon kay " + x[4]);
                do {
                    y[2] = JOptionPane.showInputDialog("member ka sa asura guild? unsa na rank?");
                    w[0] = Integer.parseInt(y[2]);
                    switch (w[0]) {

                        case 3:
                            JOptionPane.showMessageDialog(null, "naa kay 10% discount");
                            x[5] = (float) (x[5] * 0.90);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "naa kay 20% discount");
                            x[5] =  (float) (x[5] * 0.80);
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "naa kay 30% discount");
                            x[5] =  (float) (x[5] * 0.70);
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null, "wala kay discount");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "The Asura guild does not have that rank");
                            x[9] = 1;
                            break;
                    }
                } while (x[9]==1);

                JOptionPane.showMessageDialog(null, "ang imo bayronon kay " + x[5]);
                y[2] = JOptionPane.showInputDialog("palihog butang sa imo bayad");
                x[6] = Float.parseFloat(y[2]);
                do {
                    if (x[6] < x[5]) {
                        x[7] = (x[5] - x[6]);
                        JOptionPane.showMessageDialog(null, "kulang man imo gi bayad ang kulang kay: " + x[7]);
                        y[2] = JOptionPane.showInputDialog("palihog ko dungag");
                        float dungag = Float.parseFloat(y[2]);
                        x[6] = x[6] + dungag;
                    }
                } while (x[6] < x[5]);
                if (x[6] >= x[5]) {
                    float kambyo = (x[6] - x[5]);
                    JOptionPane.showMessageDialog(null, "imo kambyo kay " + kambyo);
                    y[2] = JOptionPane.showInputDialog("For the next customer press 1");
                    x[2] = Float.parseFloat(y[2]);
                }

            }
        } while (x[2] == 1);
    }

}
