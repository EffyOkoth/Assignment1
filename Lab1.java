/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author EFFIE
 */
public class Lab1 {

    private static double doub1e1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Question 1
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number:");
        int fnum = scan.nextInt();
        System.out.print("Input second number:");
        int snum = scan.nextInt();
        System.out.println(fnum*snum);
        
        
    
    
     //Question 2
       System.out.print("Input first number:");
       int num1 = scan.nextInt();
       System.out.print("Input second number:");
       int num2 = scan.nextInt();
       System.out.println("Expected Output:");
       System.out.println(num1+num2);
       System.out.println(num1-num2);
       System.out.println(num1*num2);
       System.out.println(num1/num2);
       System.out.println(num1&num2);
       
       
       //Question 3
       System.out.print("Input first integer:");
       int int1 = scan.nextInt();
       System.out.print("Input second integer:");
       int int2 = scan.nextInt();
       if( int1 == int2){
          System.out.println("Integers are equal");  
       } else{
           System.out.println("Integers are not equal");
       }
       
       
       //Question 4
       System.out.print("Input a degree in Fahrenheit:");
       double fahrenheit = scan.nextDouble();
       double celsius = (( 5*(fahrenheit - 32.0))/9.0);
       System.out.print("Expected Output:");
       System.out.println(fahrenheit + "degree Fahrenheit is equal to" + celsius + "in Celsius");
      
       
       
       //Question 5
       System.out.print("Input 1st integer:");
       int inte1 = scan.nextInt();
       System.out.print("Input 2nd integer:");
       int inte2 = scan.nextInt();
       
       
       System.out.println("Expected Output:");  
       System.out.println("Sum of two integers: "+ (inte1 + inte2) );  
       System.out.println("Difference of two integers: "+ (inte1 - inte2));  
       System.out.println("Product of two integers: "+ (inte1 * inte2));  
       System.out.println("Average of two integers: "+ (double) ((inte1+inte2)/2));  
       System.out.println("Distance of two integers: "+ Math.abs((inte1 - inte2)));  
       System.out.println("Max integer: "+ Math.max(inte1, inte2)); 
       System.out.println("Min integer: "+ Math.min(inte1, inte2)); 
       
     
       
       
       
       
       
        
    
   
 
    } 
   
}

    



