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
import java.util.Scanner;

public class Pembagian{

    //method untuk menghitung hasil PembagianDenganException
    public static int hitungPembagian(int angka1, int angka2){
        if(angka2 == 0){
             new ArithmeticException("Angka pembagi tidak bole noll");
        }
        return(angka1/angka2);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Angka Pembilang : ");
        int angka1 = input.nextInt();
        System.out.println("Masukan Angka Penyebut  : ");
        int angka2 = input.nextInt();
        
        try {
            int hasil = hitungPembagian(angka1, angka2);
            System.out.println("Hasil dari " + angka1 + " dibagi "
            + angka2 + " adalah: " + hasil);
        }
        catch(ArithmeticException exception){
            System.out.println("Tidak dapat dibagi nol");
        }
         
    }
}
