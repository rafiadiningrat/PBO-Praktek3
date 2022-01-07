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
public class GMethod extends Manusia {
    public static <T> void print(T nilai) {
        System.out.println(nilai);
    }
    public void display(){
        System.out.println();
        System.out.println("Nilai-nilai yang dicetak:");

        
        print("Rapi");
        print(19); 
        print(false); 
        print(4.0f); 
        print('P'); 
    }
}
