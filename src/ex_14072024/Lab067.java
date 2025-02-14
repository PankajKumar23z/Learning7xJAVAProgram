package ex_14072024;

public class Lab067 {
    public static void main(String[] args) {

        String name = "Pankaj";
        // String ? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String ("Pankaj");
        // How many ways we can create string - 2
        // = , new operator
        // = "SCP" ( 1st operator line no 6) ( String constant pool )
        // new - Objects(heap)
        // String provides the premade functions

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(10)); // It will give exception as we dont have 10 characters
    }
}
