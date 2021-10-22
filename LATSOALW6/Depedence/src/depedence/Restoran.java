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
public class Restoran {
    
private String makanan;
    private double hargaMakanan, totalHarga;
    
    public String getMakanan() {
        return makanan;
    }
    
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    
    public double getHargaMakanan() {
        return hargaMakanan;
    }
    
    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }
    
    public double getTotalHarga() {
        return totalHarga;
    }
    
    public void setTotalHarga() {
        this.totalHarga = hargaMakanan;
    }
    
    public void BuatPesanan() {
        System.out.println("Makanan         : " + this.makanan);
        System.out.println("Total Harga     : " + this.totalHarga);
    }
}
