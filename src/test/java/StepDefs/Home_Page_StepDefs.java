package StepDefs;

import Pages.Home_page;
import Utils.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.testng.Assert.assertEquals;

public class Home_Page_StepDefs {

    private WebDriver driver;
    private Home_page homePage  = new Home_page(driver);

    @Given("User open a desire browser")
    public void user_open_a_desire_browser() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    @When("Enter the {string} of a website")
    public void enter_the_of_a_website(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(5000);
    }

    @Then("User should be able to navigate the website successfully and verify the {string}")
    public void userShouldBeAbleToNavigateTheWebsiteSuccessfullyAndVerifyThe(String ExpectedTitle) {
        String actualTitle = homePage.getPageTitle();
        assert actualTitle.equals(ExpectedTitle);
        //assertEquals(actualTitle, ExpectedTitle);
    }

    @After
    public void closeBrowser() {
        WebDriverFactory.quitDriver();
        }
    }
