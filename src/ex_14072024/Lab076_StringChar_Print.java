package ex_14072024;

public class Lab076_StringChar_Print {

    public static void main(String[] args) {

          String s1 = "Pankaj";
          // String s1 = "P a n k a j";
          //             |0|1|2|3|4|5
          char c = s1.charAt(5);
           System.out.println(c);
           s1=  s1.concat("Kumar");// we need to give s1 = then only it will assign to Pankaj
            // s1.concat("Kumar") // it will not assign to Pankaj as s1 is directing to Pankaj
           System.out.println(s1);

    }
}
