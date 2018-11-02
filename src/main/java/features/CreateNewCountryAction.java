package features;

import config.base.ViewAction;
import config.base.SelectElement;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.ThreadLocalRandom;

public class CreateNewCountryAction extends ViewAction {
    public CreateNewCountryAction(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public void onNegative() throws Exception {

    }

    @Override
    public void onExecute() throws Exception {
        element.setLink("New").click();
        element.setFormElement("input[name=title]");
        element.setValue("Indonesia Raya");
        element.setFormElement("select[name=continent_id]");
        SelectElement countryId = new SelectElement(element.getFormElement());
        countryId.getSelect().selectByIndex(ThreadLocalRandom.current().nextInt(1, 2));
        element.setFormElement("select[name=status]");
        SelectElement status = new SelectElement(element.getFormElement());
        status.getSelect().selectByIndex(1);
        element.setFormElement("button[type=submit]");
        element.getFormElement().submit();
        EditExistingCountryAction editExistingCountryAction = new EditExistingCountryAction(webDriver);
        editExistingCountryAction.onExecute();


    }
}
