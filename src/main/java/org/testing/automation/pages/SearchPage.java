package org.testing.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    WebDriver driver;


    private String title = "Wyszukaj | Microsoft Learn";

    private String url;
    public SearchPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void goTo(){
        driver.get(url);
    }


    public boolean isAt() {
        return driver.getTitle().equals(title);
    }





}
