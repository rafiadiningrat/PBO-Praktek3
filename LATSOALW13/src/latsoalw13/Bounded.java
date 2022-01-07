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
public class Bounded <T extends Manusia> {
    private T objRef;
    
    public Bounded(T obj){
        this.objRef = obj;
    }
    
    public void Run(){
        this.objRef.display();
    }
}

class Manusia{
    public void display(){
        System.out.println("Pemanggilan semua Class Generic menggunakan Generic Bound : ");
    }
}
