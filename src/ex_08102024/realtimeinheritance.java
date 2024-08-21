package ex_08102024;

public class realtimeinheritance {
    public static void main(String[] args) {
        Baseclass t1 = new TestCase1();
        t1.setBrowser("Opera",true);
        t1.closeBrowser();
    }

}
class TestCase1 extends Baseclass{
    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        super.setBrowser(browser, isAdmin);
    }
}
class Baseclass {
    private String browser;

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            this.browser = browser;
        } else {
            System.out.println("Not allowed");
        }
    }

    public String getBrowser() {
        return browser;
    }

    public void openBrowser()
    {
        System.out.println("Chrome");
    }
    void openBrowser(String browserName)
    {
        System.out.println("Open the entered browser" +browserName);
    }
    void closeBrowser()
    {
        System.out.println("Close Browser");
    }
}
