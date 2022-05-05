package test.TestBase;

import Page.CheckDemo.CheckDemoJournalingPage;
import Page.Main.MainJournaling;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;


public class JournalingTestBase {
    WebDriver driver;
    public MainJournaling mainJournaling;
    public CheckDemoJournalingPage checkJournalingDemoPage;

    @BeforeClass
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainJournaling = PageFactory.initElements(driver, MainJournaling.class);
        checkJournalingDemoPage = PageFactory.initElements(driver, CheckDemoJournalingPage.class);
    }

    @AfterClass
    public void finish() {
        driver.quit();
    }
    
}
