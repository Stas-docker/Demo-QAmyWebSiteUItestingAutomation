package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPOM {
    public ElementsPOM(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement elements;

    public WebElement getElements() {
        return elements;
    }

    public void setElements(WebElement elements) {
        this.elements = elements;
    }

    public void clickOnElements(){
        elements.click();
    }

}
