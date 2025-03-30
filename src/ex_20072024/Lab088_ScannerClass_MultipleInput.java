package ex_20072024;

import java.util.Scanner;

public class Lab088_ScannerClass_MultipleInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the num 2");
        int num2 = sc.nextInt();

       // System.out.println(Math.max(num1,num2));We will get the maximum number

        if(num1 > num2) {
            System.out.println(num1);
        }else if(num2 > num1) {
            System.out.println(num2);
        }else {
            System.out.println("Equal");
        }

        // Note : We can give hundred of conditions we can use else if


    }
}
