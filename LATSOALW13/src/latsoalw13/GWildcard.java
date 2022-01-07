/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsoalw13;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;


public class GWildcard extends Manusia {
    public static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
    public void display(){
        Collection<String> Group1 = new ArrayList<>();
        Group1.add("Indonesia");
        Group1.add("Vietnam");
        Group1.add("Thailand");
        System.out.println("Group Berdasarkan Nama : ArrayList Collection");
        printCollection(Group1);
        Collection<Integer> Group2 = new LinkedList<>();
        Group2.add(201511053);
        Group2.add(201511043);
        Group2.add(201511063);
        System.out.println("Group Berdasarkan NIM : LinkedList Collection");
        printCollection(Group2);
        Collection<Character> Group3 = new HashSet<>();
        Group3.add('R');
        Group3.add('A');
        Group3.add('P');
        System.out.println("Group Berdasarkan Character : HashSet Collection");
        printCollection(Group3);
    }
}
