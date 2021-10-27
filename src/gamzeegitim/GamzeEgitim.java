/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamzeegitim;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author GS
 */
public class GamzeEgitim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] = "Gökhan";
        for (String string : str) {
            //System.out.println(string);
        }

        int[] intArray = new int[5];

        ArrayList<String> gok = new ArrayList<>();

        gok.add("saman1");
        gok.add("saman2");
        gok.add("saman3");
        gok.add("saman4");
        gok.add("saman5");
        gok.add("saman");
        gok.add("saman");
        gok.add("saman");
        gok.add("saman");
        gok.add("saman");
        gok.add("saman");
        gok.add("saman");
        gok.add("saman");

        String cumle = "";

        for (String string : gok) {
            cumle = cumle + (cumle.equals("") ? "" : ",") + string;
        }
        System.out.println(cumle);
        // 0 -> saman1
        // 1 -> saman2
        
        System.out.println("Selamlar123");

    }

}
