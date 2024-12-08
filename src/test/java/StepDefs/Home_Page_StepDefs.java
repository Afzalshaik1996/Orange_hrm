package StepDefs;

import Pages.Home_page;
import Utils.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.testng.Assert.assertEquals;

public class Home_Page_StepDefs {

    WebDriver driver;
    Home_page homePage;

    @Before
    @Given("User open a desire browser")
    public void user_open_a_desire_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new Home_page(driver);
    }

    @When("Enter the {string} of a website")
    public void enter_the_of_a_website(String url) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(2000);
    }

    @Then("User should be able to navigate the website successfully and verify the {string}")
    public void userShouldBeAbleToNavigateTheWebsiteSuccessfullyAndVerifyThe(String ExpectedTitle) throws InterruptedException {
        String actualTitle = homePage.getPageTitle();
        Thread.sleep(2000);
        assert actualTitle.equals(ExpectedTitle);
        //assertEquals(actualTitle, ExpectedTitle);
    }

    @After
    public void quitDriver() {
        WebDriverFactory.quitDriver();
    }

}