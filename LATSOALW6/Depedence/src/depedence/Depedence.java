/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depedence;

/**
 *
 * @author DELL
 */
import java.util.*;

public class Depedence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Restoran restoran = new Restoran();
        Pemesan pemesan = new Pemesan();
        int pilih;
        String notelp;
        String nama;
        
        System.out.println("==============MENU==================");
        System.out.println("1. Ayam Bakar          Rp. 10.000");
        System.out.println("2. Rendang asli        Rp. 25.000");
        System.out.println("3. Ikan nila           Rp. 13.000");
        System.out.println("4. Sayur asem          Rp. 6.000");
        System.out.println("Pilih menu : ");
        pilih = in.nextInt();
        
        switch (pilih) {
        case 1 :
        {
            System.out.println("Anda memesan Ayam Bakar.");
            restoran.setMakanan("Ayam bakar");
            restoran.setHargaMakanan(10000.0);
            break;
        }
        case 2 :
        {
            System.out.println("Anda memesan Rendang asli.");
            restoran.setMakanan("Rendang asli");
            restoran.setHargaMakanan(25000.0);
            break;
        }
        case 3 :
        {
            System.out.println("Anda memesan Ikan nila.");
            restoran.setMakanan("Ikan nila");
            restoran.setHargaMakanan(13000.0);
            break;
        }
        case 4 :
        {
            System.out.println("Anda memesan Sayur asem.");
            restoran.setMakanan("Sayur asem");
            restoran.setHargaMakanan(6000.0);
            break;
        }
    }   
  System.out.println("----------- Isi Data Pemesan -------------");
System.out.print("Nama Pemesan : ");
nama = in.next();
pemesan.setNamaPemesan(nama);
System.out.print("Nomor Telepon : ");
notelp = in.next();
pemesan.setTelpPemesan(notelp);
restoran.setTotalHarga();
pemesan.infoPemesan();
restoran.BuatPesanan();
}
}
