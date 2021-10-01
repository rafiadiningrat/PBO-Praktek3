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
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String A,B;
		BigInteger B_A,B_B,kali,jumlah;
		
		A = in.next();
		B = in.next();
		B_A = new BigInteger(A);
		B_B = new BigInteger(B);
		jumlah = B_A.add(B_B);
		kali = B_A.multiply(B_B);
		System.out.println(jumlah);
		System.out.println(kali);
		
		in.close();
	}
}
