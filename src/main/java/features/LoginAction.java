package features;

import config.base.ViewAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAction extends ViewAction {

    public LoginAction(WebDriver webDriver) {
        super(webDriver);

    }

    @Override
    public void onNegative() throws Exception {

        element.setFormElement("input[name=username]");
        element.setValue("root");
        element.setFormElement("input[name=password]");
        element.setValue("ajosutisna");
        element.setFormElement("button[type=submit]");
        element.getFormElement().submit();
        element.setXpathElement("//div/div[2]/div/h4");
        //WebElement alert = this.webDriver.findElement(By.xpath(""));
        System.out.println(element.getElement().getText());
    }

    public void onExecute() throws Exception {
        element.setFormElement("input[name=username]");
        element.setValue("root");
        element.setFormElement("input[name=password]");
        element.setValue("fahmisulaiman");
        element.setFormElement("button[type=submit]");
        element.getFormElement().submit();
        CountryAction countryAction = new CountryAction(webDriver);
        countryAction.onExecute();

    }
}
