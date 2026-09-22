package steps;

import pom.alertsPOM.AlertsPOM;
import utils.Utils;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static core.BaseClass.driver;

public class AlertsSteps {
    AlertsPOM alertsPOM = new AlertsPOM(driver);
    Utils utils = new Utils();
    SoftAssert softAssert = new SoftAssert();

    // 1. Only page load and scrolling
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
        return this;
    }

    // 2. Checking the first alert
    public AlertsSteps checkClickMe1() {
        utils.explicitWaitUntilClickable(alertsPOM.getClickMe1(), 20);
        alertsPOM.clickOnClickMe1();
        utils.acceptAlert(true);
        return this;
    }

    // 3. Checking the second alert (with a 10-second delay)
    public AlertsSteps checkClickMe2() {
        utils.explicitWaitUntilClickable(alertsPOM.getClickMe2(), 20);
        alertsPOM.clickOnClickMe2();
        utils.waitAlert(10);
        utils.getText();
        utils.acceptAlert(true);
        return this;
    }

    // 4. Checking the third alert (OK and Cancel)
    public AlertsSteps checkClickMe3() {
        alertsPOM.clickOnClickMe3();
        utils.acceptAlert(true);
        softAssert.assertEquals(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText(), "You selected Ok");

        alertsPOM.clickOnClickMe3();
        utils.acceptAlert(false);
        softAssert.assertEquals(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText(), "You selected Cancel");
        return this;
    }

    // 5. Checking the fourth alert (text entry)
    public AlertsSteps checkClickMe4() {
        alertsPOM.clickOnClickMe4();
        utils.insertText("vasea");
        utils.acceptAlert(true);
        softAssert.assertEquals(driver.findElement(By.xpath("//span[@id='promptResult']")).getText(), "You entered vasea");
        return this;
    }

    public AlertsSteps verifyAll() {
        softAssert.assertAll();
        return this;
    }
}
