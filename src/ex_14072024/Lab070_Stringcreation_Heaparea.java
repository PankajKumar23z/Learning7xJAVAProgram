package ex_14072024;

public class Lab070_Stringcreation_Heaparea {
    public static void main(String[] args) {

        String s1 = new String ("Pankaj");
        String s2 = new String ("Pankaj");
         // 2 created Separately ,Heap area
        String s3 = s1;
        // 2 Strings only in Heap area , its just that S3 -> s1 we have not used new so only 2 strings


    }
}
