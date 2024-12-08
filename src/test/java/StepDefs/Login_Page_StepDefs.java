package StepDefs;

import Pages.Login_Page;
import Utils.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.Assert.assertTrue;

public class Login_Page_StepDefs {
    WebDriver driver;
    Login_Page loginPage;


    @Given("User opens the desired browser")
    public void openBrowser() {
        //driver = WebDriverFactory.getDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @And("User navigates to the OrangeHRM_URL")
    public void navigateToLoginPage() throws InterruptedException {
        driver.manage().window().maximize();
        loginPage = new Login_Page(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
    }

    @Given("User enters username as {string}")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("User enters password as {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("User clicks the login button")
    public void LoginButtonClick() {
        loginPage.clickLoginButton();
    }

    @Then("User should be logged in successfully")
    public void verifyLoginSuccess() throws InterruptedException {
        Thread.sleep(5000);
        assertTrue(loginPage.isDashboardDisplayed());
    }

    @Then("User should see an error message {string}")
    public void verifyErrorMessage(String errorMessage) {
        assertTrue(loginPage.verifyErrorMessage().contains(errorMessage));
    }

    @After
    public void closeBrowser() {
        WebDriverFactory.quitDriver();
    }

}


