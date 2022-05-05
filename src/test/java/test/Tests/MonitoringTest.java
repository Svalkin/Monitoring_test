package test.Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.TestBase.MonitoringTestBase;

public class MonitoringTest extends MonitoringTestBase {
    @Description ("Проверка работы Демопримера Monitoring")
    @Test
    public void MonitoringDemoCheck() {
        mainMonitoring.goTo();
        mainMonitoring.DemoMonitoring();
        mainMonitoring.selectWindow();
        mainMonitoring.clickDemoMonitoring();
        checkMonitoringDemoPage.checkDemoMonitoringPage();
    }
}
