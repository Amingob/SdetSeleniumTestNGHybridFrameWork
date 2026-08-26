package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class BaseTest {

    public WebDriver wdriver;
    public String userName = "mngr663058";
    public String passWord = "dArAhUn";

    public LoginPage loginPage;

    @BeforeClass
    public void launchBrowser(){

        System.setProperty("webdriver.chrome.driver","/Drivers/chromedriver.exe");
        wdriver = new ChromeDriver();

        wdriver.manage().window().maximize();
        wdriver.manage().deleteAllCookies();

        loginPage = new LoginPage(wdriver);
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        wdriver.quit();
    }
}
