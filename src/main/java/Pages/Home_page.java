package Pages;


import org.openqa.selenium.WebDriver;


public class Home_page {

    private WebDriver driver;

    public Home_page(WebDriver driver){
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();

    }

}
