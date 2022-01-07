/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsoalw13;

/**
 *
 * @author DELL
 */
public class GClass extends Manusia {
    public void display(){
        
        Generic<String> nama = new Generic<>();
        nama.setManusia("Muhammad Rafi A");
        System.out.println("Nama Saya: "+nama.getManusia());
        
        
        Generic<Integer> umur = new Generic<>();
        umur.setManusia(19);
        System.out.println("Umur Saya: "+umur.getManusia()+" Tahun");
        
   
        Generic<Boolean> kondisi = new Generic<>();
        kondisi.setManusia(true);
        System.out.println("Apakah Hati saya kosong: "+kondisi.getManusia());
        
        
        Generic<Float> IPK = new Generic<>();
        IPK.setManusia(4.0f);
        System.out.println("Nilai IPK Saya: "+IPK.getManusia());
        
        
        Generic<Character> Karakter = new Generic<>();
        Karakter.setManusia('L');
        System.out.println("Jenis Kelamin: "+Karakter.getManusia());
    }
}
