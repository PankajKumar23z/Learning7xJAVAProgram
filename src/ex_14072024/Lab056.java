package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit , Explicit - Loss less
        // Narrowing - Impicit , Explicit(with data type), Loss

        // Widening
        byte b = 10;
        int a = b; // Implicit Casting - JVM We can store byte smaller in to bigger container int
        int a1= (int)b; // VALID - Explicit Casting
        System.out.println(a1);

        // Narrowing
        int val = 300;
       // byte b1 = val; // Invalid - Implicit casting JVM We cannot store int in to smaller container byte
       byte b1 = (byte)val;//Invalid - expicit Casting // Loss of the data
        System.out.println(b1);

        // int = 32 bits byte = 8 bits , it will take last 8 bits and rest of the values will oveflow
        // and the values will be converted in to number -


    }
}
