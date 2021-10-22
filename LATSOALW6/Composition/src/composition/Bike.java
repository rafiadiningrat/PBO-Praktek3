/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author DELL
 */
public class Bike {
    
private String color;

  private int wheels;

  public void bikeFeatures()

  {

    System.out.println("Bike Color= "+color + " wheels= " + wheels);

  }

  public void setColor(String color)

  {

    this.color = color;

  }

  public void setwheels(int wheels)

  {

    this.wheels = wheels;

  }

}

class Honda extends Bike

{

  //inherits all properties of bike class

  public void setStart()

  {

    HondaEngine e = new HondaEngine();

    e.start();

  }

}
