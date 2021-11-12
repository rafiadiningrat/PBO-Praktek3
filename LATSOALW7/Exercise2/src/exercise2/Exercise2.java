/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author DELL
 */
public class Exercise2 {

    public static void main(String[]args) {
Circle s1 = new Circle(5.5, "red", false);
System.out.println(s1);
System.out.println(s1.getArea());
System.out.println(s1.getColor());

Rectangle s3 = new Rectangle(1.0, 2.0, "white", false);
System.out.println(s3);
System.out.println(s3.getArea());
System.out.println(s3.getColor());

Square s4 = new Square(6.6, "blue", true);
System.out.println(s4);
System.out.println(s4.getArea());
System.out.println(s4.getColor());




}
}
