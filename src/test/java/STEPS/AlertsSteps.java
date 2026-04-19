package STEPS;

import POM.AlertsPOM.AlertsPOM;
import UTILS.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

import static CORE.BaseClass.driver;

public class AlertsSteps {
    AlertsPOM alertsPOM = new AlertsPOM(driver);
    Utils utils = new Utils();
    SoftAssert softAssert = new SoftAssert();

    public AlertsSteps openAlertWindow(){
        utils.scroll(alertsPOM.getAlertFrame());
        utils.explicitWaitUntilVisible(alertsPOM.getAlertFrame(), 20);
        utils.explicitWaitUntilClickable(alertsPOM.getAlertFrame(), 20);
        alertsPOM.clickOnAlertFrame();
        utils.explicitWaitUntilVisible(alertsPOM.getAlerts(), 20);
        utils.explicitWaitUntilClickable(alertsPOM.getAlerts(), 20);
        alertsPOM.clickOnAlerts();
        utils.explicitWaitUntilVisible(alertsPOM.getClickMe1(), 20);
        utils.scroll(alertsPOM.getClickMe1());
        utils.explicitWaitUntilClickable(alertsPOM.getClickMe1(), 20);
        alertsPOM.clickOnClickMe1();
        utils.acceptAlert(true);
        utils.explicitWaitUntilClickable(alertsPOM.getClickMe2(), 20);
        alertsPOM.clickOnClickMe2();
        utils.waitAlert(10);
        utils.getText();
        utils.acceptAlert(true);
        alertsPOM.clickOnClickMe3();
       utils.acceptAlert(true);
       softAssert.assertEquals(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText(), "You selected Ok");
        alertsPOM.clickOnClickMe3();
        utils.acceptAlert(false);
       softAssert.assertEquals(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText(), "You selected Cancel");
       alertsPOM.clickOnClickMe4();
       utils.insertText("vasea");
       utils.acceptAlert(true);
       softAssert.assertEquals(driver.findElement(By.xpath("//span[@id='promptResult']")).getText(), "You entered vasea");

        return this;
    }
}
