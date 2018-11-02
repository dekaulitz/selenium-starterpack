package features;

import config.base.Element;
import config.base.ViewAction;
import config.base.SelectElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CountryAction extends ViewAction {

    public CountryAction(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public void onNegative() throws Exception {

    }

    @Override
    public void onExecute() throws Exception {
        element.setLink("Master Data").click();
        element.setLink("Country").click();
        element.setFormElement("select[name=q]");
        Element listSearch = new Element(webDriver);
        listSearch.setFormElement("select[name=q]");
        SelectElement listSelect = new SelectElement(listSearch.getFormElement());
        listSelect.getSelect().selectByVisibleText("Country");
        element.setFormElement("input[name=search-value]");
        element.setValue("A");
        element.setFormElement("button[name=search-btn-pagination]");
        element.getFormElement().click();
        listSearch.setFormElement("select[name=q]");
        SelectElement listSelect2 = new SelectElement(listSearch.getFormElement());
        listSelect2.getSelect().selectByVisibleText("Status");
        element.setFormElement("select[name=search-value]");
        SelectElement select = new SelectElement(element.getFormElement());
        select.getSelect().selectByIndex(1);
        tableFooterNavigation();
        deleteRowTable();
        CreateNewCountryAction createNewCountry = new CreateNewCountryAction(webDriver);
        createNewCountry.onExecute();
    }


    private void tableFooterNavigation() {
        element.setFormElement("button[name=search-btn-pagination]");
        element.getFormElement().click();
        element.setFormElement("button[name=first]");
        element.getFormElement().click();
        element.setFormElement("button[name=last]");
        element.getFormElement().click();
    }

    private void deleteRowTable() throws InterruptedException {
        List<WebElement> elements = element.getWebDriver().findElements(By.xpath("//input[@name='checkbox-del[]']"));
        elements.forEach(elem -> {
            elem.click();
        });
        element.setFormElement("button[name=delete-content]");
        element.getFormElement().click();
        Thread.sleep(5000);
        element.getWebDriver().findElement(By.id("modalAgree")).click();
    }
}
