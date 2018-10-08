package modules.article.category;

import config.base.PageAction;
import config.elements.InputElement;
import config.elements.NavigationElement;
import config.elements.SelectElement;
import org.openqa.selenium.WebDriver;

public class ArticleCategoriesPaginationAction extends PageAction {
    private WebDriver webDriver;
    private String url = "http://localhost/forsa/public/administrator/articles";

    private InputElement search;

    public ArticleCategoriesPaginationAction(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.navigationElement = new NavigationElement(this.webDriver);
        this.search = new InputElement(this.webDriver);
    }

    public void onExecute() throws Exception {
        navigationElement.setMenu("Master Data").click();
        navigationElement.setMenu("Article Categories").click();
        Thread.sleep(1000);
        this.search.setInputByCssSelector("select[name=q]");
        SelectElement selectElement = new SelectElement(this.search.getInput());
        selectElement.getSelect().selectByValue("display_name");
        this.search.setInputByCssSelector("input[name=search-value]");
        this.search.setValue("Kuliner");
        this.search.setInputByCssSelector("button[name=search-btn-pagination]");
        this.search.getInput().click();
        Thread.sleep(1000);
        navigationElement.setMenu("Master Data").click();
        navigationElement.setMenu("Articles").click();
        CreateNewArticleAction createNewArticleAction = new CreateNewArticleAction(this.webDriver);
        createNewArticleAction.onExecute();
    }
}
