/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unittestlaura;

import java.util.Random;

/**
 *
 * @author lasof
 */
public class Operations {
    
    public static int NextNumber(int userNumber){
        return userNumber + 1;
    }
     public static boolean IsDivisible(int firstNumber,int secondNumber){
        int moduleResult = secondNumber % firstNumber;
        return moduleResult == 0;
    }
    
     //Ejercicios correspondientes 9-17
    public static double CalculateCylinder(double radius,double height){
        if (radius<=0 || height <=0) {
            System.out.println("The radius and height must be positive values.");
            return -1;
        }
        double volume = Math.PI*Math.pow(radius,2)*height;
         System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);return volume;
  
        
    }
    public static String RandomNumber(){
        Random random = new Random();
        int numberRandom =random.nextInt(1000)+1;
        if (numberRandom % 5 == 0 && numberRandom <=25 ) {
            System.out.println("The random number is "+numberRandom);
            return "Correcto";     
        }else{
            System.out.println("The random number is "+numberRandom);
            return "Incorrecto"; 
        }
    }
}

