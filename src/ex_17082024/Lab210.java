package ex_17082024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class Lab210 {

    public static void main(String[] args) {


        // Exception
        // Checked - JVM knows -

/*
        try {
            FileInputStream FileInputStream = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // UnChecked*/

        try {
            int a = 20;
            int c = a / 0;
            System.out.println("c");
        } catch (Exception e) {
            System.out.println("Error / by zero");
        }

        System.out.println("End of program");

    }
}