package ex_27072024;

import java.util.Scanner;

public class Lab146 {

    public static void main(String[] args) {

        // Where we take the user input of the 5 subjects - Avg of the subject.
        // Figure inputs - float, scanner class

        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];


        // Using for loop to prompt the user to enter marks for each subject
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of the sub " + (i + 1));  // Prompt for each subject
            marks[i] = sc.nextFloat();  // Store the input marks in the array
        }

      /*  marks[0] = sc.nextFloat();
        System.out.println("Enter the marks of the sub 1");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the marks of the sub 2");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the marks of the sub 3");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the marks of the sub 4");
        marks[4] = sc.nextFloat();
        System.out.println("Enter the marks of the sub 5");*/



        Float avg   = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4])/5;
        System.out.println("Avg is -> "+avg);

        int j = 0;
        while (j < marks.length) {
            System.out.println(marks[j]);
            j++;
        }

         sc.close();

    }
}
