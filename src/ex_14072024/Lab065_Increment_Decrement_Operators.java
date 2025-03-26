package ex_14072024;

public class Lab065_Increment_Decrement_Operators {
    public static void main(String[] args) {

        int a=10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // Part -> A -> ++a , Exp1 = 11 , a=11
        // Part -> B -> a++ , Exp2 = 11 , a=12
        // Part -> C -> a++ , Exp2 = 12 , a=13  // Exp3 - 12 , latest a value 12 will display
        // op -> exp1+ exp2 + exp3 = 34



    }
}
