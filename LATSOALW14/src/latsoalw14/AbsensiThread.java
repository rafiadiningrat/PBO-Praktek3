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
public class AbsensiThread implements Runnable {
	private int noAbs;
	private String nama;
	
	public AbsensiThread(int noAbs, String nama) {
		this.noAbs = noAbs;
		this.nama = nama;
		
	}
	
	@Override
	public void run() {	
		System.out.println("Absensi ke-"+noAbs + ": "+ nama);	
	}
}
