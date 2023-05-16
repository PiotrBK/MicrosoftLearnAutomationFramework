package org.testing.automation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.CSS;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class SearchPage {

    WebDriver driver;


    private String title = "Wyszukaj | Microsoft Learn";

    private String url;
    @FindBy(css = "div.margin-top-xxs:nth-child(1)")
    private List<WebElement> radiobuttons;

    @FindBy(css = "ul.margin-top-sm")
    private List<WebElement> searchResults;

    public SearchPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }

    public void goTo(){
        driver.get(url);
    }


    public boolean isAt() {
        return driver.getTitle().equals(title);
    }

    public void clickCertyfikaty(){
        radiobuttons.get(3).click();

    }

    public void clickFirstResult(){
        WebElement firstResult = searchResults.get(0).findElement(By.cssSelector("li.margin-top-sm:nth-child(1) > h2:nth-child(1))");
        firstResult.click();

    }

}
