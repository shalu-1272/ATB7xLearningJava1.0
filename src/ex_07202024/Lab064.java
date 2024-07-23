package ex_07202024;

import java.util.Locale;
import java.util.Scanner;

public class Lab064 {
    public static void main(String[] args) {
        //web automation
        //select which browser you want - chrome, firefox, edge

        //input - browser name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name you want to use");
        String browser = sc.next();
        browser = browser.toLowerCase();  //no need to create another string to store the lower case browser name

        switch(browser)
        {
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting the Firefox");
                break;
            case "edge":
                System.out.println("Starting the edge");
                break;
            default:
                    System.out.println("Wrong input");
        }
        System.out.println("Please enter a correct input");

    }
}
