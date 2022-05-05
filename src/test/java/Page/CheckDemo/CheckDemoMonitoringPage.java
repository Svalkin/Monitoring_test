package Page.CheckDemo;

import BasePage.BasePage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckDemoMonitoringPage extends BasePage {
    public CheckDemoMonitoringPage(WebDriver driver) {
        super(driver);
    }
    @Feature("Проверка корректности Выполнения Демо-примера")
    public void checkDemoMonitoringPage(){
        String selector = "//p[text()='Запрос выполнен']";
        isElementDisplayed(By.xpath(selector));
    }
}
