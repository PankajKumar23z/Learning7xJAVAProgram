package ex_17082024;

public class Lab216 {

    public static void main(String[] args) {

        try {
            int a = 10/0;
        } catch (Exception pankaj) {
            System.out.println("Div by Zero");
        } finally {
            System.out.println("I will be always Executed, anyHow!!");
        }

    }
}
