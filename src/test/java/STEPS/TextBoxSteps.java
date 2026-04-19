package STEPS;


import POM.ElementsPOM;
import POM.TextBoxPOM;
import UTILS.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static CORE.BaseClass.driver;

public class TextBoxSteps {
    ElementsPOM elementsPOM = new ElementsPOM(driver);
    TextBoxPOM textBoxPOM = new TextBoxPOM(driver);
    public SoftAssert softAssert = new SoftAssert();
    Utils utils = new Utils();





    public TextBoxSteps openTextBox() {
        utils.explicitWaitUntilVisible(elementsPOM.getElements(), 20);
        utils.scroll(elementsPOM.getElements());
        utils.explicitWaitUntilClickable(elementsPOM.getElements(), 20);
        elementsPOM.clickOnElements();
        utils.explicitWaitUntilVisible(textBoxPOM.getTextBox(), 20);
        utils.scroll(textBoxPOM.getTextBox());
        utils.explicitWaitUntilClickable(textBoxPOM.getTextBox(), 20);
        textBoxPOM.clickOnTextBox();
        return this;
    }

    public TextBoxSteps completeTextBoxFields(String name, String email, String currAdress, String perAdress) {
        utils.explicitWaitUntilVisible(textBoxPOM.getUserCurrentAdressField(), 20);
        utils.explicitWaitUntilClickable(textBoxPOM.getUserCurrentAdressField(), 20);
        utils.scroll(textBoxPOM.getUserNameField());
        textBoxPOM.fillUserNameField(name);
        textBoxPOM.fillUserEmailField(email);
        textBoxPOM.fillUserCurrentAdress(currAdress);
        textBoxPOM.fillUserPermanentAdress(perAdress);
        return this;
    }

    public TextBoxSteps verifyDisplayedText(String name, String email, String curAdres, String perAdres) {
        textBoxPOM.clickOnSubmit();

        if(name== null || name.isEmpty()) {
            int number = driver.findElements(By.xpath("//p[@id='name']")).size();
            softAssert.assertEquals(number, 0);
        }
        else {
            softAssert.assertEquals(textBoxPOM.getNameInput().getText(), "Name:" + name);
        }

        if(email== null || email.isEmpty()) {
            int emailInputVisibility = driver.findElements(By.xpath("//p[@id='email']")).size();
            softAssert.assertEquals(emailInputVisibility, 0);
        }
        else {
            softAssert.assertEquals(textBoxPOM.getEmailInput().getText(), "Email:" + email);
        }

        if(curAdres== null || curAdres.isEmpty()) {
            int curAdrInputVisibility = driver.findElements(By.xpath("//p[@id='currentAddress']")).size();
            softAssert.assertEquals(curAdrInputVisibility, 0);
        }
        else {
            softAssert.assertEquals(textBoxPOM.getCurAdresInput().getText(), "Current Address :" + curAdres);
        }

        if(perAdres== null || perAdres.isEmpty()) {
            int perAdrInputVisibility = driver.findElements(By.xpath("//p[@id='permanentAddress']")).size();
            softAssert.assertEquals(perAdrInputVisibility, 0);
        }
        else {
            softAssert.assertEquals(textBoxPOM.getPerAdresInput().getText(), "Permananet Address :" + perAdres);
        }
        softAssert.assertAll();
        return this;
    }
}
