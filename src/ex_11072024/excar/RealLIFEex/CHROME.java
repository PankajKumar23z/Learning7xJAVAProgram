package ex_11072024.excar.RealLIFEex;

public class CHROME extends BaseClass {
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Chrome.....");  // This is code releted to chrome only\n");
        return "Browser";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("CLosing the Chrome....");
        return "Browser";

    }


    }

