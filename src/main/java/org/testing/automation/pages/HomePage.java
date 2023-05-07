package org.testing.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testing.automation.Browser;



public class HomePage {


    WebDriver driver;

    private String url = "https://learn.microsoft.com/pl-pl/";
    private String title = "Microsoft Learn: Zdobywanie umiejętności, które otwierają drzwi w Twojej karierze";

    @FindBy(id = "welcome-page-searcg-form-autocomplete-input")
    private WebElement searchbox;

    public HomePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


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
        searchbox.sendKeys(search);
        searchbox.submit();

    }

}
