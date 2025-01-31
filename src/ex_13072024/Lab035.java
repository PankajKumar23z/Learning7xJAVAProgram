package ex_13072024;

public class Lab035 {

    public static void main(String[] args) {
        // Escape Characters
        char c = '\n';
        System.out.println(c); // After execution two new lines are added we don't see them

        // If we are using any name from the list of keywords error will come
      //  byte byte = 10;
          byte Byte = 10; // Capital B is  a reserve word and not a keywords
                          // all keywords start with small letter and they cannot be variable name
                          // and they are reserved

        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Back lash , delete 1 char
        char c3 = '\r'; // Back lash , delete 1 word
        System.out.println("Pankaj" + c3 + "Singhal");// It deletes the previous word
        System.out.println("Pankaj" + c2 + "Singhal");// It deletes the previous character
        System.out.println("Pankaj" + c1 + "Singhal");// It adds a space of tab
        System.out.println("Pankaj" + c + "Singhal");// It adds new line between first and last name



    }
}
