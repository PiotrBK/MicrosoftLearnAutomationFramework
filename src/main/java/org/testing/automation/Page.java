package org.testing.automation;



public class Page {
    public String url;
    public String title;


    public void goTo(){
        Browser.goTo(url);

    }

    public boolean isAt() {
        return Browser.title().equals(title);


    }
}
