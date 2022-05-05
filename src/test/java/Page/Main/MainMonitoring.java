package Page.Main;

import BasePage.BasePage;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainMonitoring extends BasePage {
    String MONITORING_URL = "http://featureonldoc1201architecture.online-documentation.frontdvp.apps.ocp.dvpdev.tech/online-documentation/maintain-tools/platform-v-monitor/monitoring/metrics-publication";
    public MainMonitoring(WebDriver driverMonitoring) {
        super(driverMonitoring);
    }
    @Feature ("Открываем URL Monitoring")
    public void goTo() {
        driver.get(MONITORING_URL);
    }
    @Feature("Нажимаем кнопку Демо-пример")
    public void DemoMonitoring() {
        click(By.xpath("/html/body/div[1]/div[1]/div[1]/div/section/div/div/aside/a/div/button"));
    }
    @Feature ("Переключение на вкладку с Демо-примером")
    public void selectWindow(){
        for(String tab: driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
    }
    @Feature("Нажимаем кнопку Отправить в Демо-примере")
    public void clickDemoMonitoring(){
        click(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[4]/div/button"));
    }

}
