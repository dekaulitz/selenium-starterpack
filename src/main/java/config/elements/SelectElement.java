package config.elements;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@Getter
public class SelectElement {

    private final Select select;

    public SelectElement(WebElement select) {
        this.select = new Select(select);
    }
}
