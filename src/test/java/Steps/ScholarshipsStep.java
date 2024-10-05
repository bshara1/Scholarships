package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class ScholarshipsStep {


    WebDriver driver;

    @Given("login and then go to Scholarships page from home page")
    public void loginAndThenGoToScholarshipsPageFromHomePage() {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jo-academy-web-git-pre-master-joacademy.vercel.app/login");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div/div/section/div[2]/div[1]/div[2]/button")).click(); // select (من خلال البريد الإلكتروني)
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Salim96tr@gmail.com");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Test@123");
        driver.findElement(By.xpath(" //*[@id=\"__next\"]/div[1]/div/div/div/div/div/section/div[2]/div[2]/div[2]/form/div[3]/button")).click();
       // driver.findElement(By.xpath("//*[@id=\"radix-:r5:\"]/span")).click();
      // driver.findElement(By.xpath("//*[@id=\"radix-:r6:\"]/div[3]")).click();

    }


    @When("I get the Scholarships name")
    public void iGetTheScholarshipsName() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector(".tw-text-center")).click();
        driver.findElement(By.xpath("//div[contains(text(),'برنامج التوجيهي والثانوي')]")).click();

        WebElement element = driver.findElement(By.cssSelector(".ant-modal-close-x"));
        if (element.isDisplayed()){
            element.click();
        }
        else {
            System.out.println("Element is not displayed");
        }


    }


    @Then("I print the Scholarships name")
    public void iPrintTheScholarshipsName() {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[2]/div/main/section/div[2]/a[4]")).click();
        WebElement name = driver.findElement(By.xpath("//span[contains(text(),'منحة المتفوقين')]"));
        System.out.println(name.getText());
        WebElement name2 = driver.findElement(By.xpath("//span[contains(text(),'منحة حفظة القران الكريم')]"));
        System.out.println(name2.getText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600);");


    }
//===================================================================================================================================================
    @Given("login and then navigate to Scholarships page from Home page and select Outstanding Scholarship")
    public void loginAndThenNavigateToScholarshipsPageFromHomePageAndSelectOutstandingScholarship() {

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jo-academy-web-git-pre-master-joacademy.vercel.app/login");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div/div/section/div[2]/div[1]/div[2]/button")).click(); // select (من خلال البريد الإلكتروني)
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Salim96tr@gmail.com");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Test@123");
        driver.findElement(By.xpath(" //*[@id=\"__next\"]/div[1]/div/div/div/div/div/section/div[2]/div[2]/div[2]/form/div[3]/button")).click();
        // driver.findElement(By.xpath("//*[@id=\"radix-:r5:\"]/span")).click();
        // driver.findElement(By.xpath("//*[@id=\"radix-:r6:\"]/div[3]")).click();


    }

    @When("fill the valid info for Scholarships")
    public void fillTheValidInfoForScholarships() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector(".tw-text-center")).click();
        driver.findElement(By.xpath("//div[contains(text(),'برنامج التوجيهي والثانوي')]")).click();
        WebElement element = driver.findElement(By.cssSelector(".ant-modal-close-x"));
        if (element.isDisplayed()){
            element.click();
        }
        else {
            System.out.println("Element is not displayed");
        }
    }

    @Then("click on send button")
    public void clickOnSendButton() {


        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[2]/div/main/section/div[2]/a[4]")).click();
        WebElement name = driver.findElement(By.xpath("//span[contains(text(),'منحة المتفوقين')]"));
        System.out.println(name.getText());
        WebElement name2 = driver.findElement(By.xpath("//span[contains(text(),'منحة حفظة القران الكريم')]"));
        System.out.println(name2.getText());


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200);");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://jo-academy-web-git-pre-master-joacademy.vercel.app/scholarships/%D9%85%D9%86%D8%AD%D8%A9-%D8%A7%D9%84%D9%85%D8%AA%D9%81%D9%88%D9%82%D9%8A%D9%86?program=");
        driver.findElement(By.cssSelector(".ant-col")).click();
        driver.findElement(By.xpath("//input[@id='basic_full_name_ar']")).sendKeys("أحمد محمد علي يوسف");
        driver.findElement(By.xpath("//input[@id='basic_full_name_en']")).sendKeys("Ahmed Muhammad Ali Youssef");
        driver.findElement(By.xpath("//input[@id='basic_father_full_name_ar']")).sendKeys("أحمد محمد علي يوسف");
        driver.findElement(By.xpath("//input[@id='basic_father_full_name_en']")).sendKeys("Ahmed Muhammad Ali Youssef");
        driver.findElement(By.xpath("//input[@id='basic_national_number']")).sendKeys("2000594574");
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("795312109");
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("795312108");
        js.executeScript("window.scrollBy(0, 1200);");
        driver.findElement(By.xpath("//input[@id='basic_city']")).sendKeys("عمان");
        driver.findElement(By.xpath("//*[@title='عمان']")).click();
        js.executeScript("window.scrollBy(0, 200);");
        driver.findElement(By.xpath("//input[@id='basic_area_id']")).sendKeys("خلدا");
        driver.findElement(By.xpath("//*[@title='خلدا']")).click();
        js.executeScript("window.scrollBy(0, 1200);");
       // driver.findElement(By.cssSelector(".tw-border-dotted")).click();
        driver.findElement(By.cssSelector(".ant-row:nth-child(5) .tw-text-md > input")).sendKeys("C:\\Users\\jorda\\OneDrive\\Desktop\\important note.png");
        driver.findElement(By.cssSelector(".ant-col:nth-child(1) > .ant-form-item .tw-text-md > input ")).sendKeys("C:\\Users\\jorda\\OneDrive\\Desktop\\important note.png");
        driver.findElement(By.cssSelector(".ant-row:nth-child(6) > .ant-col:nth-child(2) input  ")).sendKeys("C:\\Users\\jorda\\OneDrive\\Desktop\\important note.png");

        WebElement E2= driver.findElement(By.xpath("//input[@id='basic_terms_and_conditions']"));
        Actions a1= new Actions(driver);
        a1.click(E2).perform();






    }
//==============================================================================================================================
   @Given("login and then navigate to Scholarships page from Home page then select Outstanding Scholarship")
   public void loginAndThenNavigateToScholarshipsPageFromHomePageThenSelectOutstandingScholarship() {

       WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://jo-academy-web-git-pre-master-joacademy.vercel.app/login");
       driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div/div/section/div[2]/div[1]/div[2]/button")).click(); // select (من خلال البريد الإلكتروني)
       driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Salim96tr@gmail.com");
       driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Test@123");
       driver.findElement(By.xpath(" //*[@id=\"__next\"]/div[1]/div/div/div/div/div/section/div[2]/div[2]/div[2]/form/div[3]/button")).click();


   }

    @When("dont fill info for Scholarships")
    public void dontFillInfoForScholarships() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector(".tw-text-center")).click();
        driver.findElement(By.xpath("//div[contains(text(),'برنامج التوجيهي والثانوي')]")).click();
        WebElement element = driver.findElement(By.cssSelector(".ant-modal-close-x"));
        if (element.isDisplayed()){
            element.click();
        }
        else {
            System.out.println("Element is not displayed");
        }


    }

    @Then("click on send button2")
    public void clickOnSendButton2() {

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[2]/div/main/section/div[2]/a[4]")).click();
        WebElement name = driver.findElement(By.xpath("//span[contains(text(),'منحة المتفوقين')]"));
        System.out.println(name.getText());
        WebElement name2 = driver.findElement(By.xpath("//span[contains(text(),'منحة حفظة القران الكريم')]"));
        System.out.println(name2.getText());


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200);");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://jo-academy-web-git-pre-master-joacademy.vercel.app/scholarships/%D9%85%D9%86%D8%AD%D8%A9-%D8%A7%D9%84%D9%85%D8%AA%D9%81%D9%88%D9%82%D9%8A%D9%86?program=");
        driver.findElement(By.cssSelector(".ant-col")).click();
        driver.findElement(By.xpath("//input[@id='basic_full_name_ar']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='basic_full_name_en']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='basic_father_full_name_ar']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='basic_father_full_name_en']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='basic_national_number']")).sendKeys("");
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("795312109");
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("795312108");
        js.executeScript("window.scrollBy(0, 1200);");
        driver.findElement(By.xpath("//input[@id='basic_city']")).sendKeys("عمان");
        driver.findElement(By.xpath("//*[@title='عمان']")).click();
        js.executeScript("window.scrollBy(0, 200);");
        driver.findElement(By.xpath("//input[@id='basic_area_id']")).sendKeys("خلدا");
        driver.findElement(By.xpath("//*[@title='خلدا']")).click();
        js.executeScript("window.scrollBy(0, 1200);");
        // driver.findElement(By.cssSelector(".tw-border-dotted")).click();
        driver.findElement(By.cssSelector(".ant-row:nth-child(5) .tw-text-md > input")).sendKeys("C:\\Users\\jorda\\OneDrive\\Desktop\\important note.png");
        driver.findElement(By.cssSelector(".ant-col:nth-child(1) > .ant-form-item .tw-text-md > input ")).sendKeys("C:\\Users\\jorda\\OneDrive\\Desktop\\important note.png");
        driver.findElement(By.cssSelector(".ant-row:nth-child(6) > .ant-col:nth-child(2) input  ")).sendKeys("C:\\Users\\jorda\\OneDrive\\Desktop\\important note.png");

        WebElement E2= driver.findElement(By.xpath("//input[@id='basic_terms_and_conditions']"));
        Actions a1= new Actions(driver);
        a1.click(E2).perform();


    }



}
