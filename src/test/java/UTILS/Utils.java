package UTILS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static CORE.BaseClass.driver;

public class Utils {
    public void explicitWaitUntilVisible(WebElement webelement, int seconds) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        webDriverWait.until(ExpectedConditions.visibilityOf(webelement));
    }

    public void explicitWaitUntilClickable(WebElement webelement, int seconds) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webelement));
    }

    public void scroll(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", webElement);
    }

    public String createDate() {
        LocalDate localDate = LocalDate.of(2026, 3, 31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = localDate.format(formatter);
        return formattedDate;
    }

    public void acceptAlert(boolean accept) {
        Alert alert = driver.switchTo().alert();
        if (accept) {
            alert.accept();
        } else {
            alert.dismiss();
        }
    }

    public void insertText(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
    }

    public String getText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void waitAlert(int seconds){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        webDriverWait.until(ExpectedConditions.alertIsPresent());
    }
}

