package ex_13072024;

public class Lab023_println_printf_concatinationofdatatypes {

    public static void main(String[] args) {
        //Formatting

        int age = 98;
        System.out.println("You age is -> " + age);


        //String  S = "Pankaj_Singhal";
        //System.out.println("you S is -> " + S);

        //System.out.printf("You age is -> %s" , S);

        // + age is concatination age = String + age = String + 98
        // %d ->    any integer - byte , short , int or long
        // %s  ->    String
        // %c  ->    char
        // %f  ->    float

        System.out.printf("You age is -> %d",age);
        // the above one is not concatination its replacing of the value






    }
}
