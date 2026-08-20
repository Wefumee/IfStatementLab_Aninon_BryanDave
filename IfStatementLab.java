// Compiled Problems //


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatementlab;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Ifstatementlab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    //Bryan Dave C. Aniñon BSECE-1
    
    //===================================    
    //Problem 1: Age Category Checker
    //===================================
    
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your age");
    int age= input.nextInt();
    if (age<=12)
    {System.out.println("You are a child.");}
    else if (age>=13 && age<19)
    {System.out.println("You are a teenager.");}
    else if (age>=19 && age<60)
    {System.out.println("You are an adult.");} 
    else if (age<130)
    {System.out.println("You are a senior citizen.");}
    else {System.out.println("You must be an ancient being.");}
    
     
    //====================================
    //Problem 2: Temperature Evuluator
    //====================================
 
    System.out.println("Temperature Evaluator running...");
    System.out.println("Enter today's temperature in Celsius.");
    
    double temperature=input.nextDouble();
    
    if (temperature<0){
    System.out.println("It's Freezing!");}
    else if (temperature>=0 && temperature<=25){
    System.out.println("The weather is normal. Enjoy your day!");}
    else {
    System.out.println("The weather is hot, please stay hydrated.");}
    
    
    //====================================
    //Problem 3: Simple Grade Evaluator
    //====================================
    
    System.out.println("Maanyag nga adlaw!");
    System.out.println("Enter your test score that you want to evaluate:");
    
    int score=input.nextInt();
    
    if (score<=100 && score>=90){
    System.out.println("Wow! Excellent Score!");}
    else if (score<=89 && score>=75)
    {System.out.println("Good Score!");}
    else if (score>0 && score <75)
    {System.out.println("Needs Improvement, please study harder:>");}
    else {System.out.println("Invalid Input. Please try again.");}
    
    
    //====================================
    //Problem 4: Circle Calculator
    //====================================
    
     System.out.println("Maanyag nga adlaw!");
     System.out.println("Enter the radius of the circle: ");
     
     double radius= input.nextDouble();
     
     if (radius<=0)
     {System.out.println("Invalid radius. Please try again.");}
     else 
     {double area= Math.PI * radius*radius;
      double circumference = 2* Math.PI * radius;
     System.out.println("Area:" + area );
     System.out.println("Circumference:" + circumference );
     }
     
     
    
    
    //====================================
    //Problem 5: Even or Odd Number
    //====================================
    
    System.out.println("EVEN OR ODD?");
    System.out.println("Please input your number:");
    
    int number=input.nextInt();
    
    if (number%2==0){System.out.println("The number is EVEN");
    }
    else {System.out.println("The number is ODD");}
   
    }
    
    
 }

     
        
    
    

