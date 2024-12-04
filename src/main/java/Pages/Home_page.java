package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Home_page {
    WebDriver driver;

    By pageTitle = By.tagName("OrangeHRM");

    public Home_page(WebDriver driver){
        this.driver=driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

}
