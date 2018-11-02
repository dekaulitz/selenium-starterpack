package config.elements;

import config.base.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InputElement extends Element {
    private WebElement inputElement;

    public InputElement(WebDriver webDriver) {
        super(webDriver);
    }

    public void setFormElement(String reference) {
        this.inputElement = webDriver.findElement(By.cssSelector(reference));
    }

    public void setValue(String value) {
        inputElement.sendKeys(value);
    }

    public WebElement getFormElement() {
        return inputElement;
    }
}
