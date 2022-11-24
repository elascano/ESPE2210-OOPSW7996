/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testingsomestuff;
//primero se encapsula antes de usar getters y getters

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author NW USER
 */
public class TestingSomeStuff {
/*public static void modifyArray(otherNumbers[]);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] otherNumbers = {2, 4, 3};
        System.out.println("other Numbers(0):" + otherNumbers[0]);
        System.out.println("other Numbers(0):" + otherNumbers[1]);
        HashSet<String> set = new HashSet();
        set.add("one");
        set.add("one");
        set.add("one");
        set.add("five");
        set.add("two");
        System.out.println("set size-->" + set.size());
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println("-->" + i.next());
        }
    }

}
