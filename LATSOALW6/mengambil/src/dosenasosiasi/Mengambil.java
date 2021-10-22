/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosenasosiasi;

/**
 *
 * @author DELL
 */
public class Mengambil {

    public static void main(String[] args) {


            makul makul = new makul("TIT304","Pemrograman Berorientasi Objek");

            mahasiswa mahasiswa1 = new mahasiswa("201511053");

            mahasiswa1.setKodeMakul(makul.getKdMakul());
            mahasiswa1.setNama("Muhammad Rafi Adiningrat ");
            mahasiswa1.daftarMakul();
    }

}
