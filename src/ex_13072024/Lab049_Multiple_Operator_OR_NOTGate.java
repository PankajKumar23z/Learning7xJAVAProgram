package ex_13072024;

public class Lab049_Multiple_Operator_OR_NOTGate {

    public static void main(String[] args) {

        // BIO

        int a =12;
        boolean b = !(a > 10 || a < 5);
        System.out.println(b);

        // boolean b = !(12>10 || 12<5);
        //           = !(True || False ) - 0 ,1 will be alwasys 1
        //           = 1(True) - False


    }
}
