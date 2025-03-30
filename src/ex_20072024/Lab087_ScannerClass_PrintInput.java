package ex_20072024;

import java.util.Scanner;

public class Lab087_ScannerClass_PrintInput {

    public static void main(String[] args) {

        // Take user input and check if number id even or odd.

        // Logic Building - Ready
        // 1. Figure out the inputs &  // 2. Data type
        //  Data type  - . int

        // nextInt() -> input  ( nextInt() is an function ) its helping to take input and assign to user_input

        // 3. Do we need conversion or direclty
        // 4. Rough logic - num%2==0 even,odd
        // 5. optimize
        // int - size - 32 bit -> range( 2,147,483,647)

        Scanner sc = new Scanner(System.in);  // scanner class
        System.out.println("Enter the num 1 ");
        int user_input = sc.nextInt();// if you give the name instead of int it  will not work as its int
        System.out.println(user_input);



        if(user_input%2==1) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
