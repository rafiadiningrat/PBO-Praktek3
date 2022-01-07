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
public class GInterface extends Manusia {

    public void display(){
        Integer inums[] = { 9, 10, 3, 1, 7 };
        Character chs[] = { 'r', 'a', 'p', '1' };
        CInterface<Integer> angka = new CInterface<>(inums);
        CInterface<Character> character = new CInterface<>(chs);
        
        System.out.println("Before Sorting");
        System.out.println("Angka");
        for(Integer i : inums){
            System.out.println(i);
        }
        System.out.println("Huruf");
        for(Character c : chs){
            System.out.println(c);
        }
        
        angka.sort(inums);
        character.sort(chs);
        
        System.out.println("After Sorting Descending");
        System.out.println("Angka");
        for(Integer i : inums){
            System.out.println(i);
        }
        System.out.println("Huruf");
        for(Character c : chs){
            System.out.println(c);
        }
    }
}
