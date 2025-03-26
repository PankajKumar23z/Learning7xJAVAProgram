package ex_14072024;

public class Lab054_datatypes_Byte_char_addition {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 23;
       // byte c = a+b; Not Possible will throw error
        int  c = a+b; // byte + byte = Int
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';

        //char c1 = a1+b1; Not Possible Will throw error
        int c1 = a1+b1; // every character is an integer
        System.out.println(c1); //(65+66)
        System.out.println('A' ==65); // Its showing true as every character is an integer
        System.out.println('B' ==69);


    }
}
