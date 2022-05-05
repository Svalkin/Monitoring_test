package Page.Main;

import BasePage.BasePage;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainJournaling extends BasePage {

    String JOURNALING_URL = "http://featureonldoc1201architecture.online-documentation.frontdvp.apps.ocp.dvpdev.tech/online-documentation/maintain-tools/platform-v-monitor/applied-journal/quick-start";
    public MainJournaling(WebDriver driver) {
        super(driver);
    }
    @Feature("Открываем URL Journaling")
    public void goTo(){
        driver.get(JOURNALING_URL);
    }
    @Feature("Нажимаем кнопку Демо-пример")
    public void DemoJournaling() {
        click(By.xpath("/html/body/div/div[1]/div[1]/div/section/div/div/aside/a/div/button"));
    }
    @Feature("Переключение на вкладку с Демо-примером")
    public void selectWindow(){
        for(String tab: driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
    }
    @Feature("Нажимаем кнопку Отправить в Демо-примере")
    public void clickDemoJournaling(){
        click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[4]/div/div[3]/div/button"));
    }



}
