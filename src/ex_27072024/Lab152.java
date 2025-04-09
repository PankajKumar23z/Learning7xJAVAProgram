package ex_27072024;

public class Lab152 {

    public static void main(String[] args) {

        // Strings - imutable in nature it will create a new string
        // StringBuilder , StringBuffer

           String s1 = "PANKAJ";
           s1 = "Singhal";

           StringBuffer stringBuffer = new StringBuffer("Pankaj");
        // change the value of string - Buffer
           stringBuffer.append("Singhal"); // PankajSinghal

            StringBuilder stringBuilder = new StringBuilder("Amit");
            stringBuilder.append("Sharma");

            // It will save a lot of memory

           // diff of above  based on Thead Safty?

           // StringBuilder is not threat safe it becomes fast

    }
}
