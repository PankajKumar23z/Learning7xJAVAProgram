package ex_20072024;

public class Lab085_If_Condition {

    public static void main(String[] args) {

        boolean a = true;
        a = !a;
        if(2+2 >= 4) {  // if 2+2 , 4 then we will goin the line 12 and not in the loop
            System.out.println("Inside the Loop");
        }
        System.out.println("Outside, It will be executed always -> "+a);

        // Understand with debug -> checking the code line by line


        // Note : Here a has no relationship with If
        // Note 1: Else part is always optional
        }
    }

