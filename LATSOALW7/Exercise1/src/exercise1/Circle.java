/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author DELL
 */
public class Circle {
  private double radius;
    private String color;


    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }
    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }
    /** Returns the radius */
    public double getRadius() {
        return radius;
    }
    //returns the color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    /** Returns the area of this Circle instance*/
    public double getArea() {
        return radius*radius*Math.PI;
    }
    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
