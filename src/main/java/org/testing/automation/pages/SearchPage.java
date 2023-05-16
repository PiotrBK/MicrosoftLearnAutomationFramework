package org.testing.automation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchPage {

    WebDriver driver;

    WebDriverWait wait;
    private final String title = "Wyszukaj | Microsoft Learn";

    private String url;
    @FindBy(css = "label.radio:nth-child(4) > span:nth-child(2) > span:nth-child(1)")
    private WebElement Certyfikaty;
    @FindBy(linkText = "Exam AI-900: Microsoft Azure AI Fundamentals - Certifications")
    private WebElement firstResult;

    public SearchPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
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
        wait.until(ExpectedConditions.elementToBeClickable(Certyfikaty));
        Certyfikaty.click();
    }

    public void clickFirstResult() {
        //wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Exam AI-900: Microsoft Azure AI Fundamentals - Certifications")));
        wait.until(ExpectedConditions.elementToBeClickable(firstResult));
        firstResult.click();
    }

}
