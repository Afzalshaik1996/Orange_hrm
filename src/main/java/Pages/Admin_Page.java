package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Admin_Page {
    WebDriver driver;


    By SearchusernameField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");


    public Admin_Page(WebDriver driver){
        this.driver = driver;
    }
}
