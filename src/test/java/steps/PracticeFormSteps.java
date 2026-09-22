package steps;
import pom.formsPOM.FormsPOM;
import pom.formsPOM.PracticeFormPOM;
import utils.Utils;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static core.BaseClass.driver;

public class PracticeFormSteps {
    FormsPOM formsPOM = new FormsPOM(driver);
    PracticeFormPOM practiceFormPOM = new PracticeFormPOM(driver);
    Utils utils = new Utils();
    SoftAssert softAssert = new SoftAssert();

    public PracticeFormSteps openPracticeForm() {
        utils.scroll(formsPOM.getForms());
        utils.explicitWaitUntilVisible(formsPOM.getForms(), 20);
        formsPOM.clickOnForms();
        utils.explicitWaitUntilVisible(practiceFormPOM.getPracticeForm(), 20);
        utils.explicitWaitUntilClickable(practiceFormPOM.getPracticeForm(), 20);
        practiceFormPOM.clickOnPracticeForm();
        return this;
    }

    public PracticeFormSteps fulfillPracticeForm(String firstName, String lastName, String email,String gender, String number,
                                                 String themes, String curAdress, String city1) {
        utils.explicitWaitUntilVisible(practiceFormPOM.getFirstName(), 20);
        practiceFormPOM.fillFirstName(firstName);
        practiceFormPOM.fillLastName(lastName);
        practiceFormPOM.fillEmail(email);
        practiceFormPOM.genderChoose(gender);
        practiceFormPOM.fillNumber(number);
        practiceFormPOM.fillThemes(themes);
        practiceFormPOM.hobby1Choose();
        practiceFormPOM.fillCurAdress(curAdress);
        practiceFormPOM.cityChoose1(city1);
        utils.scroll(practiceFormPOM.getSubmitButton());
        utils.explicitWaitUntilVisible(practiceFormPOM.getSubmitButton(), 20);
        practiceFormPOM.chooseFile("/Users/smiti/Downloads/learn-git-branching-certificate-stanislav-miti.png");
        String currentDate = utils.createDate();
        String dateAttribute = practiceFormPOM.getDate().getAttribute("value");
        softAssert.assertEquals(dateAttribute, currentDate);
        practiceFormPOM.clickOnSubmit();
        return this;
    }


    public PracticeFormSteps verifyInputs(String studentName, String studentEmail, String gender) {
            utils.explicitWaitUntilVisible(practiceFormPOM.getStudentNameInput(), 20);
            String nameValue = practiceFormPOM.getStudentNameInput().getText();
            String emailValue = practiceFormPOM.getStudentEmailInput().getText();
            String genderValue = practiceFormPOM.getStudentGenderInput().getText();
            softAssert.assertEquals(studentName, nameValue);
            softAssert.assertEquals(studentEmail,emailValue);
            softAssert.assertEquals(gender, genderValue);
softAssert.assertAll();
        return this;
    }

    public PracticeFormSteps verifyNegativeInputs() {
            softAssert.assertEquals(driver.findElements(By.xpath("//tbody/tr[1]/td[2]")).isEmpty(), true);
            softAssert.assertEquals(driver.findElements(By.xpath("//tbody/tr[2]/td[2]")).isEmpty(), true);
            softAssert.assertAll();
        return this;
    }


}
