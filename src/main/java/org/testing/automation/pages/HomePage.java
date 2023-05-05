package org.testing.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.automation.Browser;



public class HomePage {

    static String url = "https://learn.microsoft.com/pl-pl/";
    static String title = "Microsoft Learn: Zdobywanie umiejętności, które otwierają drzwi w Twojej karierze";

    WebElement searchbox;

    public void goTo(){
        Browser browser= new Browser();
        browser.goTo(url);


    }


    public boolean isAt() {
        Browser browser = new Browser();
        return browser.title().equals(title);


    }

    public void searchbox(String search){
        Browser browser = new Browser();
        searchbox = browser.driver.findElement(By.id("welcome-page-search-form-autocomplete-input"));
        searchbox.sendKeys(search);
        searchbox.submit();

    }

}
