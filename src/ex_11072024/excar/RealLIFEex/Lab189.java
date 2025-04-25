package ex_11072024.excar.RealLIFEex;

public class Lab189 {

    public static void main(String[] args) {

        CHROME c =  new CHROME();
       // c.openBrowser("Chrome");
        String s = c.openBrowser("Chrome");
        System.out.println(s);
        c.closeBrowser("Chrome");
        c.takeScreenshot();

        FIREFOX f = new FIREFOX();
        f.openBrowser("ff");
        f.closeBrowser("ff");
        f.takeScreenshot();
    }
}
