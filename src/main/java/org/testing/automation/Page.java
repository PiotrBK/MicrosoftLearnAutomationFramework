package org.testing.automation;



public class Page {

    static String url;
    static String title;


    public void goTo(){
        Browser.goTo(url);

    }

    public boolean isAt() {
        return Browser.title().equals(title);


    }
}
