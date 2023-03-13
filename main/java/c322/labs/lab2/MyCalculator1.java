package c322.labs.lab2;
import jdk.dynalink.Operation;

import java.util.*;
public class MyCalculator1 {
    public static void main(String[] args) {
        System.out.print("\nPlease enter the first integer: ");
        Scanner FirstNumber = new Scanner(System.in);
        int Number1= FirstNumber.nextInt();
        System.out.print("\nPlease enter the second integer: ");
        Scanner SecondNumber = new Scanner(System.in);
        int Number2= FirstNumber.nextInt();
        System.out.print("\nInput 1 for Addition ");
        System.out.print("\nInput 2 for Subtraction ");
        System.out.print("\nInput 3 for Multiplication ");
        System.out.print("\nInput 4 for Division ");
        System.out.print("\nPlease chose the operation: ");
        int x =0;
        while (x == 0) {
            Scanner OP = new Scanner(System.in);
            int Operation= FirstNumber.nextInt();
            if (Operation == 1) {
                int A = Number1 + Number2;
                System.out.print("\nThe Addition result is " + A);
                x = 1;
            } else if (Operation == 2) {
                int A = Number1 - Number2;
                System.out.print("\nThe Subtraction result is " + A);
                x = 1;
            } else if (Operation == 3) {
                int A = Number1 * Number2;
                System.out.print("\nThe Multiplication result is " + A);
                x = 1;
            } else if (Operation == 4) {
                int A = Number1 / Number2;
                System.out.print("\nThe Division result is " + A);
                x = 1;
            } else {
                System.out.println("Please enter a number between 1 and 4 for the operation: ");
            }
        }
    }
}
