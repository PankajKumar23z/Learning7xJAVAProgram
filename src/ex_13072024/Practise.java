package ex_13072024;

import java.sql.SQLOutput;

public class Practise {

    public static void main(String[] args) {

        double a= 43;
        double b= 5;
        double result = a%b;   //Modulus - operator - reminder
        System.out.println(result);

//        5 | 43 | 8 - Quotient
//           | 40 |
//         -----------
//              3 - Remainder

      //  System.out.println(44%10);

        int age = 65;
        int lambo = -1;  // Unary operstor
        System.out.println(age);
        System.out.println(lambo);

        String firstname = "pankaj";
        String lastname = "kumar";
        System.out.println(firstname + lastname);

        byte a1 = 10;
        byte b1 = 20;
        System.out.println(a+b);

        int age1 = 65;
        int num = -1;
        System.out.println(age1+num);

        int age_pankaj = 40;
        int age_Shirin = 20;
        boolean result1 = age_pankaj > age_Shirin;

        System.out.println(result1);

        int a3 = 10;
        int a4 = 9;
        boolean c = (10 >=9);
        System.out.println(c);

        System.out.println(10 ==10);
        System.out.println(10 >=10);
        System.out.println(10 <=10);
        System.out.println(10 >10);
        System.out.println(10 <10);

        boolean a5 = true;
        System.out.println(!a5);
        System.out.println(!!(10<20));
        System.out.println(!!!(30>90));

        int a7 = 10;

        a+=10;
        a-=20;
        a*=30;

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        int a6 = 19;
        boolean b2 = (10 ==11);
        System.out.println(a6);
        System.out.println(b2);

        byte a10 = 23;
        byte b10 = 23;
        int c10 = a10+b10;
        System.out.println(c10);

        char a20 = 'A';
        char b20 = 'b';
        int C20 = a20+b20;
        System.out.println('A' ==65);
        System.out.println('B' ==67);

        short s1 = 10;
        char c15 = 'A';
        int ss =s1+c15;
        System.out.println(ss);

// Widening
         byte b40 = 10;
         int a40 = b40;
         int a50 = (int)b40;
        System.out.println(a50);

        // Narrowing

        int val = 300;
        byte b35 = (byte)val;

        long phone_no = 9876543210l;
        short s = (short) phone_no;
        System.out.println(s);














    }
}
