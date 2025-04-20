package ex_10082024.polymorphism.methodOverloading;

public class Lab181 {

    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();
          int result = mathOperations.add(2,3); // WE CANOT ADD IN DECIMALS SO NEED TO CREATE DOUBLE
          double result2 = mathOperations.add(2.4,3.6);
          String  result3 = mathOperations.add("Pramod","Dutta");
          String  result4 = mathOperations.add("Pramod","123");
          System.out.println(result);
          System.out.println(result2);
          System.out.println(result3);
          System.out.println(result4);
    }
}
