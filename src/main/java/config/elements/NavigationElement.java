package config.elements;

import config.base.Element;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class NavigationElement extends Element {

    private WebElement menu;


    public NavigationElement(WebDriver webDriver) {

        super(webDriver);
    }

    public WebElement setLink(String lintText) {
        this.menu = webDriver.findElement(By.linkText(lintText));
        return this.menu;
    }

}
