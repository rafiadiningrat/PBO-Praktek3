/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfieldonlyinteger;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class TextFieldOnlyInteger {
   public static void main(String[] args) {
        System.out.println("Masukkan input: ");
	Scanner input = new Scanner(System.in);
		try {
			int integer = input.nextInt();
			System.out.println("Nilai input : " + integer);
		}
                catch(Exception ex) {
			System.out.println("Input bukan merupakan bilangan bulat!");
		}
            input.close();
	} 
}
