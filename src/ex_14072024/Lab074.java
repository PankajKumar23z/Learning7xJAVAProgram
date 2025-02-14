package ex_14072024;

public class Lab074 {
    public static void main(String[] args) {

        String name = "Pankaj Kumar Singhal"; //SCP
        String name1 = "Pankaj Kumar Singhal"; //SCP

        System.out.println(name == name1);  // name and name1 are both same ( check for ref)
        System.out.println(name.equals(name1));  // Check for Content

        // only 1 string will be created in SCP with 2 ref pointed to it

        String name2 = new String ("Pankaj Kumar Singhal"); // Heap Area
        String name3 = new String ("Pankaj Kumar Singhal"); // Heap Area

        // ref name 2 and 3 will store in Heap area in different locations

        System.out.println(name1 ==name2);// name 1 and name 2 ref are different
        // one is stored in heap area and other one in SCP

        System.out.println(name.equals(name2)); // check for the content they are same

        // Refer the diagram by promo
    }

}
