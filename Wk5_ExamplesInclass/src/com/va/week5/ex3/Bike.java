package com.va.week5.ex3;

/*
 * Bike class is inheriting from the Vehicle class. 
 */

public class Bike extends Vehicle {
	
    void run()
    {
          System.out.println("Bike is running safely");
    }  

    
    public static void main(String args[])
    {
        Bike obj = new Bike();//creating object  
        obj.run();//calling method  

      
        
        
    	
    }

}
