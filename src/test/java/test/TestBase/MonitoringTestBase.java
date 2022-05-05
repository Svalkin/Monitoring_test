package test.TestBase;

import Page.CheckDemo.CheckDemoMonitoringPage;
import Page.Main.MainMonitoring;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class MonitoringTestBase {
    WebDriver driver;
    public MainMonitoring mainMonitoring;
    public CheckDemoMonitoringPage checkMonitoringDemoPage;

    @BeforeClass
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainMonitoring = PageFactory.initElements(driver, MainMonitoring.class);
        checkMonitoringDemoPage = PageFactory.initElements(driver, CheckDemoMonitoringPage.class);
    }

    @AfterClass
    public void finish() {
        driver.quit();
    }

}

