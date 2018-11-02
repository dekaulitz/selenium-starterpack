package config.elements;

import config.base.Element;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class CssElement  extends Element {

    WebElement cssElement;
    WebDriver webDriver;

    public CssElement(WebDriver webDriver) {
        super(webDriver);
    }

    public void setCssElement(String cssElement) {
        this.cssElement = webDriver.findElement(By.cssSelector(cssElement));
    }
}
