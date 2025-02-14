package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {

        String s1 = new String ("Pankaj");
        String s2 = new String ("Pankaj");
        String s3 = new String ("Pankaj");

        // new always create a new memory

        System.out.println(s1 ==s2); // check for ref
        System.out.println(s2 ==s3); // check for ref
        // Heap - ref stored in different locations
        System.out.println(s2.equals(s3)); // check for the content


    }
}
