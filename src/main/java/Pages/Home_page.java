package Pages;


//import Utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;


public class Home_page {

    WebDriver driver;

    public Home_page(WebDriver driver){
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();

    }



}
