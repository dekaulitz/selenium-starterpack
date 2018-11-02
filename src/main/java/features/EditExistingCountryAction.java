package features;

import config.base.ViewAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class EditExistingCountryAction extends ViewAction {
    public EditExistingCountryAction(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public void onNegative() throws Exception {

    }

    @Override
    public void onExecute() throws Exception {
        Thread.sleep(1000);
        element.getWebDriver().findElement(By.xpath("//table[@id='tree_item']/tbody/tr/td[2]/a/span"))
                .click();
        element.setLink("Back").click();

    }
}
