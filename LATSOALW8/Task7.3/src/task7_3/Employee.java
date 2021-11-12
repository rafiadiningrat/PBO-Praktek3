/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7_3;

/**
 *
 * @author DELL
 */
public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee (String eName,String eAddress, String ePhone,
                     String socSecNumber,double rate)
    {
        super (eName,eAddress,ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    public String toString()
    {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }

    public double pay()
    {
        return payRate;
    }
}
