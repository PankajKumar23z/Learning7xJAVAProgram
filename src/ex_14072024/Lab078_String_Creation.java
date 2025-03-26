package ex_14072024;

public class Lab078_String_Creation {

    public static void main(String[] args) {

        String password = "Pankaj@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        // pass_u == password its not equal
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
         // Pankaj@123 = pankaj@123 = PAnkaj@123 = PanKaj@123

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('j'));
        System.out.println(password.length());
    }
}
