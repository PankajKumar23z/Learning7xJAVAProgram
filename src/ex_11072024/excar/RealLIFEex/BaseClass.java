package ex_11072024.excar.RealLIFEex;

abstract class BaseClass extends GrandBaseClass {

    // Web Automation
    // Single
    // Hide the Functionality of the open and close Browser.

    abstract String openBrowser(String browser);

    abstract String closeBrowser(String browser);


    @Override
    void takeScreenshot() {
        System.out.println("Ok Taking Screenshot");

    }


}
