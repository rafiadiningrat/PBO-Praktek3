/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Custom_exceptions {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
        //Java program to convert hexadecimal to decimal:
        System.out.print("Enter Hexadecimal Number:");
        try{
        String hexDeciNumber=scanner.next();
            System.out.println("Hexadecimal to decimal conversion: ");
            System.out.println("output: "+ Integer.parseInt(hexDeciNumber,16));     
	}
        catch(NumberFormatException e){
            System.out.println("Inputan Bukan Merupakan Hexadecimal");
        }
    }
}
