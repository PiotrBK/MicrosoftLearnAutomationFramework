package org.testing.automation.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class HomePage {


    WebDriver driver;


    private final String url = "https://learn.microsoft.com/pl-pl/";

    private final String title= "Microsoft Learn: Zdobywanie umiejętności, które otwierają drzwi w Twojej karierze";

    @FindBy(id = "welcome-page-search-form-autocomplete-input")
    private WebElement searchbox;

    public HomePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void goTo(){
        driver.get(url);


    }


    public boolean isAt() {

        return driver.getTitle().equals(title);


    }

    public void searchbox(String search){

        searchbox.click();
        searchbox.sendKeys(search);
        searchbox.sendKeys(Keys.ENTER);

    }

}
