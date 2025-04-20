package ex_04082024;

import java.util.Scanner;

public class Lab170 {

    public static void main(String[] args) {

        BankAccount bal = new BankAccount();
      //  System.out.println(bal.bankName);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Name of the Bal!");
        int ba1 = sc.nextInt();
        System.out.println("Enter your Name of the Bank code!");

        String bCode = sc.next();

        BankAccount baicici = new BankAccount(bName, ba1, bCode);



      /*  BankAccount baicici  = new BankAccount("ICICI", 100, "ICICI100");
        System.out.println(baicici.bankName);
        System.out.println(baicici.balance);
        System.out.println(baicici.bankCode);*/

         baicici.printDetails();
        //bal.printDetails();

    }
}
