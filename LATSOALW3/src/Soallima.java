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
public class Soallima {
    public static void bukaTutupJalan(long plat) {
		if((plat-999999)%5==0) {
			System.out.println("berhenti");
		}else {
			System.out.println("jalan");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inPlat = null;
		long allPlat;
		
		in.hasNext();
		for(int i=0;i<4;i++) {
			if(inPlat==null)
				inPlat = in.next();
			else
				inPlat = inPlat + in.next();
		}
		allPlat = Long.parseLong(inPlat);
		bukaTutupJalan(allPlat);
		in.close();
	}
}
