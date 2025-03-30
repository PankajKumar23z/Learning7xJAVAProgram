package ex_20072024;

public class Lab097 {

    public static void main(String[] args) {

           // JDK > 13

        int itemcode = 007;
        switch (itemcode) {
            case 001,002,003:
                System.out.println("it is Electronic Gadget!");
                break;
            case 004,005,007 :
                System.out.println("it is Mechanical Gadget!");
                break;
            default :
                System.out.println("None");

                //Range not supported in Switch
        }
    }
}
