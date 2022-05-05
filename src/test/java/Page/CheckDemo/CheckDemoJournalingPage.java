package Page.CheckDemo;

import BasePage.BasePage;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckDemoJournalingPage extends BasePage {
    public CheckDemoJournalingPage(WebDriver driver) {
        super(driver);


    }

    @Feature("Проверка корректности Выполнения Демо-примера")
    public void checkDemoJournalingPage(){
        String element = "//p[text()='Запрос выполнен']";
            isElementDisplayed(By.xpath(element));
    }
    //@Feature("Проверка корректности Выполнения Демо-примера")
    //Verify Username Condition
    //public CheckDemoJournalingPage checkDemoJournalingPage (String expectedText) {
     //   assertEquals(By.xpath(element), expectedText);
     //   return this;
    //}
}

