package org.testing.automation.pages;

import org.testing.automation.Browser;
import org.testing.automation.Page;


public class HomePage extends Page {

    static String url = "https://learn.microsoft.com/pl-pl/";
    static String title = "Microsoft Learn: Zdobywanie umiejętności, które otwierają drzwi w Twojej karierze";


    @Override
    public void goTo(){
        Browser.goTo(url);

    }

    @Override
    public boolean isAt() {
        return Browser.title().equals(title);


    }



}
