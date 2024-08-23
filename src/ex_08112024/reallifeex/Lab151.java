package ex_08112024.reallifeex;

public class Lab151 {
    public static void main(String[] args) {
        Chrome c = new Chrome();
        c.closeBrowser();
        c.OpenBrowser();
        c.takescreenshot();

        Firefox f = new Firefox();
        f.OpenBrowser();
        f.closeBrowser();
        f.takescreenshot();
    }
}
