package org.testing.automation.pages;

import org.testing.automation.Browser;
import org.testing.automation.Pages;


public class HomePage {

    static String url = "https://learn.microsoft.com/pl-pl/";
    static String title = "Microsoft Learn: Zdobywanie umiejętności, które otwierają drzwi w Twojej karierze";



    public void goTo(){
        Browser.goTo(url);

    }


    public boolean isAt() {
        return Browser.title().equals(title);


    }



}
