package ex_27072024;

public class Lab151 {

    public static void main(String[] args) {

        // String - Bunch of Chars.
        //

        String s1 = new String("pankaj"); // Heap Area
        String s2 = "Pankaj"; // String Constant pool

        // String - Immutable in nature.

        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
    }
}
