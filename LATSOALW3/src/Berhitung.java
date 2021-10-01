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
public class Berhitung {
    public static void result(int A, int B, String operator) {
		switch((int) operator.charAt(0)) {
			case '+':
				System.out.println(A+B);
				break;
			case '-' :
				System.out.println(A-B);
				break;
			case '*':
				System.out.println(A*B);
				break;
			case '/':
				System.out.println(A/B);
				break;
			case '%':
				System.out.println(A%B);
				break;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A,B;
		String operator;
		
		in.hasNext();
		A = in.nextInt();
		operator = in.next();
		B = in.nextInt();

		result(A,B,operator);
		in.close();
	}
}
