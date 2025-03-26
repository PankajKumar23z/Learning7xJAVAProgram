package ex_14072024;

public class Lab069_Stringcreation_SCP {
    public static void main(String[] args) {

        String s1 = "Pankaj";
          // 1 ,SCP
        s1 = "Amit";
        // 2 , SCP
        s1 = "Singhal";
        // 3 , SCP
        s1 = "Pankaj"; // We can reuse it and its already flowing
        // 3, SCP there are only 3 strings created and not 4 as we are reusing it

        // Strings are immutable in nature . We cannot remove the values

    }
}
