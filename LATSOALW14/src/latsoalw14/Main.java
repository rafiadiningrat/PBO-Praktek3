/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsoalw14;

/**
 *
 * @author DELL
 */
public class Main {

	public static void main(String[] args) {
		
		AbsensiThread t1 = new AbsensiThread(1, "Rafi", 50000);
		AbsensiThread t2 = new AbsensiThread(2, "Raffi", 150000);
		AbsensiThread t3 = new AbsensiThread(3, "Ravi", 250000);
		
		Thread test = new Thread(t1);
		Thread test2 = new Thread(t2);
		Thread test3 = new Thread(t3);
		
		test.start();
		test2.start();
		test3.start();

	}

}
    

