/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

/**
 *
 * @author DELL
 */
public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Address address1=new Address("Bandung","jawa barat","indonesia");  
			Address address2=new Address("Jakarta","DKI jakarta","indonesia");  
			  
			Employee e=new Employee(1,"Muhammad Rafi A",address1);  
			Employee e2=new Employee(2,"Bambang A",address2);  
			      
			e.display();  
			e2.display();  

	}

}
