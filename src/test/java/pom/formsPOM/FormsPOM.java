package pom.formsPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPOM {
public FormsPOM(ChromeDriver driver){
    PageFactory.initElements(driver, this);
   }

   @FindBy (xpath = "//h5[text() = 'Forms']")
    public WebElement forms;

    public WebElement getForms() {
        return forms;
    }

    public void setForms(WebElement forms) {
        this.forms = forms;
    }

    public void clickOnForms(){
        forms.click();
    }
}
