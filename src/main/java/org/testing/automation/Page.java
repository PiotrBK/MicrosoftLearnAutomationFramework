package org.testing.automation;

import org.testing.automation.Browser;

public class Page {

    static String url;
    static String title;


    public void goTo(String url){
        Browser.goTo(url);

    }

    public boolean isAt() {
        return Browser.title().equals(title);


    }
}
