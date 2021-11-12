/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Cat extends Animal{
        @Override
	public void sound() {
		System.out.println("Meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Cat();
		obj.sound();
	}

}
