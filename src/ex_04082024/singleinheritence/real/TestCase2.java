package ex_04082024.singleinheritence.real;

import java.sql.SQLOutput;

public class TestCase2 extends BaseTest {

    void testCase2(){

        startBrowser(); // BaseTest
        getDataFromSQL(); // GrandBaseTest
        System.out.println(gold); // GrandbaseTest

        // Here we will write the TC
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testCase2(); // we need to have main method to yeild an output
    }

}



