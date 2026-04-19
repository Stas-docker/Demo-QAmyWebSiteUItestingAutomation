package POM.AlertsPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AlertsPOM {
    public AlertsPOM(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/alertsWindows']")
    public WebElement alertFrame;

    @FindBy(xpath = "//a[@href='/alerts']")
    WebElement alerts;

    @FindBy(xpath = "//button[@id='alertButton']")
    WebElement clickMe1;

    @FindBy(xpath = "//button[@id='timerAlertButton']")
    WebElement clickMe2;

    @FindBy(xpath = "//button[@id='confirmButton']")
    WebElement clickMe3;

    @FindBy(xpath = "//button[@id='promtButton']")
    WebElement clickMe4;

    @FindBy(xpath = "//span[@id='confirmResult']")
    WebElement viVibraliOk;


    public void clickOnAlertFrame(){
        alertFrame.click();
    }

    public WebElement getAlertFrame() {
        return alertFrame;
    }

    public void setAlertFrame(WebElement alertFrame) {
        this.alertFrame = alertFrame;
    }

    public void clickOnAlerts(){
        alerts.click();
    }

    public WebElement getAlerts() {
        return alerts;
    }

    public void setAlerts(WebElement alerts) {
        this.alerts = alerts;
    }

    public void clickOnClickMe1(){
        clickMe1.click();
    }

    public WebElement getClickMe1() {
        return clickMe1;
    }

    public void setClickMe1(WebElement clickMe1) {
        this.clickMe1 = clickMe1;
    }

    public void clickOnClickMe2(){
        clickMe2.click();
    }

    public WebElement getClickMe2() {
        return clickMe2;
    }

    public void setClickMe2(WebElement clickMe2) {
        this.clickMe2 = clickMe2;
    }

    public void clickOnClickMe3(){
        clickMe3.click();
    }

    public void clickOnClickMe4() {
        clickMe4.click();
    }


}
