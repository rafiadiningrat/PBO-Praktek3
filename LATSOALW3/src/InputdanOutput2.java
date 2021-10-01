/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class InputdanOutput2 {
    public static void main(String[] args){
    	Scanner keyboard = new Scanner(System.in);
        String[] A;
        short[] B;
	A = new String[3];
	B = new short[3];
	Scanner inputan = new Scanner(System.in);
	A[0] = inputan.next();
	B[0] = inputan.nextShort();
	A[1] = inputan.next();
	B[1] = inputan.nextShort();
	A[2] = inputan.next();
	B[2] = inputan.nextShort();
	inputan.close();
        System.out.println("================================");
        int i;
		for(i=0;i<=2; i++) {
			
			System.out.printf("%-15s%03d\n", A[i], B[i]);
		}
        System.out.println("================================");            
    }    
}
