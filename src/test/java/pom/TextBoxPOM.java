package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPOM {
    public TextBoxPOM(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Text Box']")
    WebElement textBox;

    public WebElement getTextBox() {
        return textBox;
    }

    public void setTextBox(WebElement textBox) {
        this.textBox = textBox;
    }

    @FindBy(xpath = "//input[@id='userName']")
    WebElement userNameField;

    public WebElement getUserNameField() {
        return userNameField;
    }

    public void setUserNameField(WebElement userNameField) {
        this.userNameField = userNameField;
    }

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement userEmailField;

    public WebElement getUserEmailField() {
        return userEmailField;
    }

    public void setUserEmailField(WebElement userEmailField) {
        this.userEmailField = userEmailField;
    }

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement userCurrentAdressField;

    public WebElement getUserCurrentAdressField() {
        return userCurrentAdressField;
    }

    public void setUserCurrentAdressField(WebElement userCurrentAdressField) {
        this.userCurrentAdressField = userCurrentAdressField;
    }

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement userPermanentAdressField;

    public WebElement getUserPermanentAdressField() {
        return userPermanentAdressField;
    }

    public void setUserPermanentAdressField(WebElement userPermanentAdressField) {
        this.userPermanentAdressField = userPermanentAdressField;
    }

    @FindBy(xpath = "//button[@id='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//p[@id='name']")
    WebElement nameInput;

    public WebElement getNameInput() {
        return nameInput;
    }

    public void setNameInput(WebElement nameInput) {
        this.nameInput = nameInput;
    }

    @FindBy(xpath = "//p[@id='email']")
    WebElement emailInput;

    public WebElement getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(WebElement emailInput) {
        this.emailInput = emailInput;
    }

    @FindBy(xpath = "//p[@id='currentAddress']")
    WebElement curAdresInput;

    public WebElement getCurAdresInput() {
        return curAdresInput;
    }

    public void setCurAdresInput(WebElement curAdresInput) {
        this.curAdresInput = curAdresInput;
    }

    @FindBy(xpath = "//p[@id='permanentAddress']")
    WebElement perAdresInput;

    public WebElement getPerAdresInput() {
        return perAdresInput;
    }

    public void setPerAdresInput(WebElement perAdresInput) {
        this.perAdresInput = perAdresInput;
    }

    public void clickOnTextBox(){
        textBox.click();
    }

    public void fillUserNameField(String userName){
        userNameField.sendKeys(userName);
    }

    public void fillUserEmailField(String userEmail){
        userEmailField.sendKeys(userEmail);
    }

    public void fillUserCurrentAdress(String userCurrentAdress){
        userCurrentAdressField.sendKeys(userCurrentAdress);
    }

    public void fillUserPermanentAdress(String userPermanentAdress){
        userPermanentAdressField.sendKeys(userPermanentAdress);
    }

    public void clickOnSubmit(){
        submitButton.click();
    }
}
