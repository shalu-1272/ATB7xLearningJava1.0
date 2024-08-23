package ex_08112024.reallifeex;

abstract class BaseClass extends GrandBaseClass {
    //web automation
    //single
    //hide functionalities of open and close browser
abstract String OpenBrowser();
abstract String closeBrowser();

    @Override
    void takescreenshot() {
        System.out.println("Take SS for all browsers");
    }
}
