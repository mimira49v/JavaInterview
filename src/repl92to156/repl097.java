package repl92to156;
/*
For you to do:

Based on the user inputs program should give a correct answer.

If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:

"Proceed with Chrome browser"

If browser is firefox, FIREFOX or FireFOX it should print the:

"Proceed with Firefox browser"

If browser is IE, ie or iE it should print the:

"Proceed with IE browser"

If any other browser it should print the:

"Invalid browser"
 */

import java.util.Scanner;

public class repl097 {

    public static void main(String[] args) {
        System.out.println("Enter the browser name to proceed further with execution");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.nextLine();



        String chrome ="Chrome";
        String firefox="Firefox";
        String ie ="IE";

        if(browser.equals("Chrome") || browser.equals("CHROME")||browser.equals("ChRoMe")){
            System.out.println("Proceed with Chrome browser");
        }
                else if (browser.equals("FIREFOX ") || browser.equals("FireFOX")){
                     System.out.println("Proceed with Firefox browser");
                }
                         else if (browser.equals("ie")||browser.equals("IE")){
                             System.out.println("Proceed with IE browser");
                         }
        else {
            System.out.println("Invalid browser");
        }
    }
}
