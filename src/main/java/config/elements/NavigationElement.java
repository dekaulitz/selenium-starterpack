package config.elements;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class NavigationElement {
    private WebDriver webDriver;
    private WebElement menu;


    public NavigationElement(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement setMenu(String lintText) {
        this.menu = webDriver.findElement(By.linkText(lintText));
        return this.menu;
    }

}
