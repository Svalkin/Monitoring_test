package BasePage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import static org.testng.Assert.assertTrue;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    @Step("Ожидание доступности селектора элемента")
    public void waitVisibility(By elementBy) {
       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    @Step ("Нажатие на элемент по селектору")
    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    @Step ("Ожидание видимости селектора элемента")
    public void isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }
    //Read Text
    //public String readText (By elementBy) {
    //    waitVisibility(elementBy);
    //    return driver.findElement(elementBy).getText();
    //}
    //Assert
    //public void assertEquals (By elementBy, String expectedText) {
    //    waitVisibility(elementBy);
    //    Assert.assertEquals(readText(elementBy), expectedText);
    //}

}
