package Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.com.lms.base.Base;
import org.example.com.lms.pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import java.time.Duration;

public class loginStep extends Base {


    loginPage loginPage1;

    @Given("I navigate to the login page from home page")
    public void i_navigate_to_the_login_page_from_home_page() {
        LunchBrowser();
        loginPage1 = new loginPage();
        loginPage1.changeToByEmail();
    }

    @When("I enter the Email and password")
    public void i_enter_the_Email_and_password(DataTable dataTable) {
        loginPage1 = new loginPage();
        loginPage1.FillTheEmailAndPassword(dataTable.cell(0,0),dataTable.cell(0,1));
    }

    @And("I click on login button")
    public void i_click_on_login_button() {
        loginPage1 = new loginPage();
        loginPage1.clickLoginButton();
    }

    @Then("I should see the home page")
    public void i_should_see_the_home_page() {
        boolean isHomePageDisplayed = driver.findElement(By.xpath("/html/body")).isDisplayed();
        assert isHomePageDisplayed : "Home page is not displayed";
        driver.quit();
    }

    //================================================================================================================================

    @Given("I navigate to login page")
    public void iNavigateToLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jo-academy-web-git-pre-master-joacademy.vercel.app/login");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div/div/section/div[2]/div[1]/div[2]/button")).click(); // select (من خل

    }
    @When("I enter the email as {string} and password as {string}")
    public void iEnterTheEmailAsAndPasswordAs(String arg0, String arg1) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys(arg0);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys(arg1);
    }


    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        // Click on the login button
        driver.findElement(By.xpath(" //*[@id=\"__next\"]/div[1]/div/div/div/div/div/section/div[2]/div[2]/div[2]/form/div[3]/button")).click();
    }

    @Then("Error message should appear")
    public void Error_message_should_appear() {
        boolean isHomePageDisplayed = driver.findElement(By.xpath("/html/body")).isDisplayed();
        assert isHomePageDisplayed : "Home page is not displayed";
        driver.quit();
    }


}
