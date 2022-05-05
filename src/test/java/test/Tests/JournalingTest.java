package test.Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.TestBase.JournalingTestBase;


public class JournalingTest extends JournalingTestBase {
    @Description("Проверка работы Демопримера Journaling")
    @Test
    public void JournalingDemoCheck() {
        mainJournaling.goTo();
        mainJournaling.DemoJournaling();
        mainJournaling.selectWindow();
        mainJournaling.clickDemoJournaling();
        checkJournalingDemoPage.checkDemoJournalingPage();
    }


}
