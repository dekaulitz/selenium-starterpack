package config.base;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class Element {
    private WebElement formElement;
    private WebElement element;
    private WebElement menu;
    private WebElement cssName;

    protected WebDriver webDriver;
    private WebElement tagName;

    public Element(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement setLink(String lintText) {
        this.menu = webDriver.findElement(By.linkText(lintText));
        return this.menu;
    }

    public void setFormElement(String reference) {
        this.formElement = webDriver.findElement(By.cssSelector(reference));
    }

    public void setValue(String value) {
        formElement.sendKeys(value);
    }

    public WebElement getFormElement() {
        return formElement;
    }

    public void setXpathElement(String reference) {
        this.element = webDriver.findElement(By.xpath(reference));
    }

    public void setCssName(String cssName) {
        this.cssName = webDriver.findElement(By.className(cssName));
    }

    public void setTagName(String tagName) {
        this.tagName = webDriver.findElement(By.tagName(tagName));
    }
}
