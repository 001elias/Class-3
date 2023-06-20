package MyProgram2;

import java.util.Random;
import java.util.Scanner;

public class MyProgram {
	
	 public static void main(String[] args) {
		 
	        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
	        System.out.println(result);
	        System.out.println("");
	        
	        double result2 = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
	        System.out.println(result2);
	        System.out.println("");
	        
	        double radius = 7.5;	        	        
	        double perimeter = 2 * Math.PI * radius;	        
	        double area = Math.PI * radius * radius;	        	        
	        System.out.println("Perimeter: " + perimeter);
	        System.out.println("Area is: " + area);
	        System.out.println("");
	        
	        Scanner scanner = new Scanner(System.in);
	        double sum = 0;
	        System.out.print("Enter the first number: ");
	        sum += scanner.nextDouble();
	        System.out.print("Enter the second number: ");
	        sum += scanner.nextDouble();
	        System.out.print("Enter the third number: ");
	        sum += scanner.nextDouble();
	        double average = sum / 3;
	        System.out.println("The average is: " + average);
	 
	        System.out.println("");
	        
	        double width = 5.6;
	        double height = 8.5;	        
	        double area1 = width * height;	        
	        double perimeter1 = 2 * (width + height);	        
	        System.out.println("Area is " + width + " * " + height + " = " + area1);
	        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter1);
	        System.out.println("");
	        
	        

	        System.out.print("Input an integer Number: ");
	        int decimalNumber = scanner.nextInt();	        
	        String binaryNumber = Integer.toBinaryString(decimalNumber);
	        System.out.println("Binary number is: " + binaryNumber);
	        System.out.println("");
	        
	        
	        Random random = new Random();

	        System.out.println("Generated random numbers:");

	        for (int i = 0; i < 10; i++) {
	            int randomNumber = random.nextInt(22) + 1;
	            System.out.println(randomNumber);
	        }
	        System.out.println("");
	        
	        
	        int result1 = -5 + 8 * 6;
	        int result22 = (55 + 9) % 9;
	        int result3 = 20 + -3 * 5 / 8;
	        int result4 = 5 + 15 / 3 * 2 - 8 % 3;

	        
	        System.out.println("Results of the operations:");
	        System.out.println(result1);
	        System.out.println(result22);
	        System.out.println(result3);
	        System.out.println(result4);
	        System.out.println("");
	        
	        
	        System.out.print("Input a number: ");
	        int number = scanner.nextInt();
	        System.out.println("Multiplication table for " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            int result5 = number * i;
	            System.out.println(number + " x " + i + " = " + result5);
	        }
	        System.out.println("");
	        

	        System.out.print("Enter the first number: ");
	        int number1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int number2 = scanner.nextInt();
	        System.out.println("Before swapping:");
	        System.out.println("Number 1: " + number1);
	        System.out.println("Number 2: " + number2);
	        number1 = number1 ^ number2;
	        number2 = number1 ^ number2;
	        number1 = number1 ^ number2;
	        System.out.println("After swapping:");
	        System.out.println("Number 1: " + number1);
	        System.out.println("Number 2: " + number2);
	        
	        scanner.close();
	    }
	 }



