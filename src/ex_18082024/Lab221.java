package ex_18082024;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab221 {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            int a = 10/0; // Unchecked - ar
        } catch (ArithmeticException | NullPointerException  | ArrayIndexOutOfBoundsException e) {
            System.out.println("e1");

        }catch (Exception e2){
            System.out.println("e2");
        }finally {
            System.out.println("FF");
        }

            FileReader f = new FileReader("C:\\Users\\OrCon\\Downloads\\Pankaj");



    }
}
