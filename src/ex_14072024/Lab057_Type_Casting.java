package ex_14072024;

public class Lab057_Type_Casting {
    public static void main(String[] args) {

        long phone_no = 9876543210l; // we need to mention l for long
      //  short s = phone_no;  //Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);
        // JVM -Garbage Collector - overflow data goes to this
    }
}
