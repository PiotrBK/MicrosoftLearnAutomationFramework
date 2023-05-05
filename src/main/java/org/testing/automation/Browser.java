package org.testing.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static WebDriver driver;

    public Browser(){

       driver = new ChromeDriver();
    }


    public void goTo(String url){
        this.driver.get(url);
    }

    public String title(){
        return driver.getTitle();
    }

    public void close(){
        driver.close();
    }
    public String getUrl(){
        String currentUrl = driver.getCurrentUrl();

        return currentUrl;
    }

}
