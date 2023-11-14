/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unittestlaura;
import java.util.Scanner;
import com.mycompany.unittestlaura.Operations;

/**
 *
 * @author lasof
 */
public class UnitTestLaura {

    public static void main(String[] args) {
        System.out.println("Select one of the options below");
        System.out.println("1. Add the next number");
        System.out.println("10. Based two numbers return divisible");
        
        //Ejercicios correspondientes 9-17
        System.out.println("9. Calculate cylinder volume ");
        System.out.println("17. Random Number");
        
        
        Scanner in =new Scanner (System.in);
        
        String userResult = in.next();
        
        switch (userResult){
            case "1":
                System.out.println("Type an integer number");
                String userNumber = in.next();
                int userNumberInt = Integer.parseInt(userNumber);
                int nextResult = Operations.NextNumber(userNumberInt);
                System.out.println(nextResult);
                break;
            case "10":
                System.out.println("Type an integer number");
                String firstDivisionNumber = in.next();
                System.out.println("Type a second integer number");
                String secondDivisionNumber = in.next();
                boolean result = Operations.IsDivisible(Integer.parseInt(firstDivisionNumber),Integer.parseInt(secondDivisionNumber));
                if (result) {
                    System.out.println(secondDivisionNumber+" is divisible into "+firstDivisionNumber);
                }else{
                    System.out.println(secondDivisionNumber+" is not divisible into "+firstDivisionNumber);
                }
                break;
                
            //Ejercicios correspondientes 9-17
            case "9":
                System.out.println("Enter the radius of the cylinder:");
                double radius = in.nextDouble();
                System.out.println("Enter the height of the cylinder:");
                double height = in.nextDouble();
                double volume = Operations.CalculateCylinder(radius, height);
                if (volume>=0) {
                    System.out.println(volume);
                }
                break;
            case "17":
                Operations.RandomNumber();
                break;
            case "18":
                System.out.println("Commit in a new branch 3 console");
            default:
                throw new AssertionError();
        }
        
    }
}
