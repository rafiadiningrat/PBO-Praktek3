/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

/**
 *
 * @author DELL
 */
public class Array {
    public static void main (String args[])
   {
        String[]mahasiswa = {"Rafi","Ado","Bent","Juan",};
        try{
                for (int i=0;i<5;i++){
                System.out.println("array "+ i + ":" +  mahasiswa[i]);
            }
        } 
        catch(Exception ex)
        {
		System.out.println("Sudah melebihi isi array");
		//System.out.println("Panjang array: " + array.length);
	}         
    }
}
