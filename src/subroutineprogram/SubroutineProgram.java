/*
 * Evan Robertson
 * November 8th 2018
 * A program that calls user defines methods to perform various calculations
 */

package subroutineprogram;
import java.util.Scanner;

/**
 *
 * @author evrob0095
 */
public class SubroutineProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Variables
        int userInput;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        //Options print
        System.out.println("Enter a number to choose an option:");
        System.out.println("1. Squareroot");
        System.out.println("2. Average");
        System.out.println("3. Sine Law");
        System.out.println("4. Cosine Law");
        System.out.println("5. Powers");
        System.out.println("6. Exit");
        //Get input
        userInput = Integer.parseInt(input.nextLine());
        
        //Switch statement
        switch (userInput) {
            case 1:
                System.out.println("Enter one number");
                //Get input
                num1 = Integer.parseInt(input.nextLine());
                //Call method sqrt
                sqrt(num1);
                break;
            case 2:
                System.out.println("Enter two numbers");
                //Get input
                num1 = Integer.parseInt(input.nextLine());
                num2 = Integer.parseInt(input.nextLine());
                //Call method average
                average(num1 , num2);
                break;
            case 3:
                System.out.println("Enter 1 side length then the correspeonding angle and then one angle");
                //Get input
                num1 = Integer.parseInt(input.nextLine());
                num2 = Integer.parseInt(input.nextLine());
                num3 = Integer.parseInt(input.nextLine());
                //Call method sineLaw
                sineLaw(num1, num2, num3);
                break;
            case 4:
                System.out.println("Enter 2 sides and the inside angle");
                //Get input
                num1 = Integer.parseInt(input.nextLine());
                num2 = Integer.parseInt(input.nextLine());
                num3 = Integer.parseInt(input.nextLine());
                //Call method cosineLaw
                cosineLaw(num1, num2, num3);
                break;
            case 5:
                System.out.println("Enter a base and then an exponent");
                num1 = Integer.parseInt(input.nextLine());
                num2 = Integer.parseInt(input.nextLine());
                //Call method pow
                power(num1, num2);
                break;
            default:
                //Exit
                System.exit(0);
                break;
        
        }
    }
    public static void sqrt (int n1) {
        double total;
        //Calculation
        total = Math.sqrt(n1);
        //Output answer
        System.out.println("The square root of " + n1 + " is " + total);
    }
    
    public static void average (int n1, int n2) {
        double total;
        //Calculation
        total = (n1 + n2)/2;
        //Output answer
        System.out.println("The average is " + total);
    }
    
    public static void sineLaw (int n1, int n2, int n3) {
        double total;
        //Calculation
        total =  n1 * (Math.sin(n3)/Math.sin(n2));
        total = Math.round(total);
        //Output answer
        System.out.println("The unkown side corresponding to the angle is " + total);
    }
    public static void cosineLaw (int n1, int n2, int n3) {
        double total;
        //Calculation
        total = (n1 * n1) + (n2 * n2) - ((2 * n1 * n2) * Math.cos(n3));
        total = Math.sqrt(total);
        total = Math.round(total);
        //Output answer
        System.out.println("The unknown side is " + total);
    }
    public static void power (int n1, int n2) {
        double total;
        //Calculation
        total = Math.pow(n1, n2);
        //Output answer
        System.out.println("The answer is " + total);
    }
}
