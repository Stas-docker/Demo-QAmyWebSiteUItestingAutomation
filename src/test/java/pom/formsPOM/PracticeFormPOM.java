package pom.formsPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static core.BaseClass.driver;

public class PracticeFormPOM {
    public PracticeFormPOM(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/automation-practice-form']")
    public WebElement practiceForm;

    public WebElement getPracticeForm() {
        return practiceForm;
    }

    public void setPracticeForm(WebElement practiceForm) {
        this.practiceForm = practiceForm;
    }

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    public WebElement getFirstName() {
        return firstName;
    }

    public void setFirstName(WebElement firstName) {
        this.firstName = firstName;
    }

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement userEmail;

    @FindBy(xpath = "//input[@id='gender-radio-1']")
    public WebElement genderMale;

    @FindBy(xpath = "//input[@id='gender-radio-2']")
    public WebElement genderFemale;

    @FindBy(xpath = "//input[@id='gender-radio-3']")
    public WebElement genderOther;

    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElement userNumber;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    public WebElement userThemes;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-1']")
    public WebElement hobby1;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-2']")
    public WebElement hobby2;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-3']")
    public WebElement hobby3;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    public WebElement currentAdress;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement file;

    @FindBy(xpath = "//input[@id='react-select-3-input']")
    public WebElement cityChoice;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submitButton;

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(WebElement submitButton) {
        this.submitButton = submitButton;
    }

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElement date;

    public WebElement getDate() {
        return date;
    }

    public void setDate(WebElement date) {
        this.date = date;
    }

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement StudentNameInput;

    public WebElement getStudentNameInput() {
        return StudentNameInput;
    }

    public void setStudentNameInput(WebElement studentNameInput) {
        StudentNameInput = studentNameInput;
    }

    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    public WebElement StudentEmailInput;

    public WebElement getStudentEmailInput() {
        return StudentEmailInput;
    }

    public void setStudentEmailInput(WebElement studentEmailInput) {
        StudentEmailInput = studentEmailInput;
    }

    @FindBy(xpath = "//tbody/tr[3]/td[2]")
    public WebElement StudentGenderInput;

    public WebElement getStudentGenderInput() {
        return StudentGenderInput;
    }

    public void setStudentGenderInput(WebElement studentGenderInput) {
        StudentGenderInput = studentGenderInput;
    }

    public void clickOnPracticeForm() {
        practiceForm.click();
    }

    public void fillFirstName(String firstname) {
        firstName.sendKeys(firstname);
    }

    public void fillLastName(String lastname) {
        lastName.sendKeys(lastname);
    }

    public void fillEmail(String email) {
        userEmail.sendKeys(email);
    }

    public void genderChoose(String gender) {
        driver.findElement(By.xpath("//label[normalize-space()='"+gender+"']/preceding-sibling::input")).click();
    }

    public void gender2Choose() {
        genderFemale.click();
    }

    public void gender3Choose() {
        genderOther.click();
    }

    public void fillNumber(String number) {
        userNumber.sendKeys(number);
    }

    public void fillThemes(String themes) {
        userThemes.sendKeys(themes);
    }

    public void hobby1Choose() {
        hobby1.click();
    }

    public void hobby2Choose() {
        hobby2.click();
    }

    public void hobby3Choose() {
        hobby3.click();
    }

    public void fillCurAdress(String curadress) {
        currentAdress.sendKeys(curadress);
    }

    public void chooseFile(String picturePath) {
        file.sendKeys(picturePath);
    }

    public void cityChoose1(String city1){
        cityChoice.sendKeys(city1);
    }

    public void clickOnSubmit() {
        submitButton.click();
    }



}