/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theavenged;

/**
 *
 * @author DELL
 */
public class LaserEye implements Power{
    //Overrides doPower
    @Override
    public void doPower(){
        System.out.println("SUPERIOR SIGHT, BEHOLD LASER EYE!");
    }
}
