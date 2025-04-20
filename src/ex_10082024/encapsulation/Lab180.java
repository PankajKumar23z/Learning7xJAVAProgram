package ex_10082024.encapsulation;

public class Lab180 {

    public static void main(String[] args) {

        ICICIBank amit = new ICICIBank("Amit",100);

        // set the balance
        // admin

       //  amit.name = "dasfdd"
        amit.setBal(1000000000,false);
        System.out.println(amit.getName());

        System.out.println(amit.getBal(false));

        // Write a code to connect with mySQL
        //  Admin
        boolean are_you_admin = true;

        ICICIBank Admin = new ICICIBank("admin", 1000);
        Admin.setBal(5000,true);
        System.out.println(Admin.getName());
        System.out.println(Admin.getBal(are_you_admin));



    }
}
