/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

/**
 *
 * @author DELL
 */
public class Barang {

    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private long weight;
    private long quantity;
    private long priceItem;
    private String productName;


    @Override
    public String toString() {
        return "Barang{"+productName+" | "+quantity+" | "+weight+" | "+
                city.getDestination()+" | "+servicePackage.getService()+" | "+
                servicePackage.getValue()+" | "+((priceItem*quantity)+servicePackage.getValue());
    }
    
    
}
