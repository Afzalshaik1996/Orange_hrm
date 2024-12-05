package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login_Page {
     private WebDriver driver;

     By usernameField = By.xpath("//input[@name='username']");
     By passwordField = By.xpath("//input[@name='password']");
     By loginButton = By.xpath("//button[@type='submit']");
     By verifylogin = By.xpath("//div[@class=\"oxd-topbar-header-title\"]");
     By VerifyErrorMessage = By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]");

    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    // Methods for interacting with the page
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isDashboardDisplayed() {
        try {
            WebElement dashboard = driver.findElement(verifylogin);
            return dashboard.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String verifyErrorMessage(){
        WebElement ErrorMessage = driver.findElement(VerifyErrorMessage);
        return ErrorMessage.getText();

    }

}

