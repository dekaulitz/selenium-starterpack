package config.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InputElement {
    private WebElement input;
    private WebDriver webDriver;

    public InputElement(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setInputByCssSelector(String reference) {
        this.input = webDriver.findElement(By.cssSelector(reference));
    }

    public void setInputByName(String reference) {
        this.input = webDriver.findElement(By.name(reference));
    }

    public void setValue(String value) {
        input.sendKeys(value);
    }

    public WebElement getInput() {
        return input;
    }
}
