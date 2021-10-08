/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perguruantinggi;

/**
 *
 * @author DELL
 */
public class politeknik {
    public static void main (String[] args){
 PerguruanTinggi vokasi = new PerguruanTinggi();
 vokasi.setKode (40559);
 vokasi.setnoTelepon(2013789);
 vokasi.setNama("Politeknik Negeri Bandung");
 vokasi.setAlamat("Jln.Gegerkalong Hilir Desa Ciwaruga");
 vokasi.setEmail("polban@polban.ac.id");
 vokasi.setAkreditasi("A");

 System.out.println("Profil Perguruan Tinggi");
 System.out.println("Kode Pos    :" + vokasi.getKode());
 System.out.println("No Telepon :" + vokasi.getnoTelepon());
 System.out.println("Nama       :" + vokasi.getNama());
 System.out.println("Alamat     :" + vokasi.getAlamat());
 System.out.println("Email      :" + vokasi.getEmail());
 System.out.println("Akreditasi :" + vokasi.getAkreditasi());
 }
}

