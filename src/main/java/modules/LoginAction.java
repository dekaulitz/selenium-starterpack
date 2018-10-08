package modules;

import config.base.PageAction;
import config.elements.InputElement;
import config.base.InterfacePage;
import lombok.Getter;
import lombok.Setter;
import modules.article.category.ArticleCategoriesPaginationAction;
import org.openqa.selenium.WebDriver;

@Getter
@Setter
public class LoginAction extends PageAction {
    private InputElement form;
    private WebDriver webDriver;

    public LoginAction(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.form = new InputElement(webDriver);
    }

    public void onExecute() throws Exception {
        this.form.setInputByCssSelector("input[name=username]");
        this.form.setValue("root");
        this.form.setInputByCssSelector("input[name=password]");
        this.form.setValue("fahmisulaiman");
        this.form.setInputByCssSelector("button[type=submit]");
        this.form.getInput().submit();
        if (!this.webDriver.getCurrentUrl().equals("http://localhost/forsa/public/administrator"))
            throw new Exception("invalid url");
        ArticleCategoriesPaginationAction articleCategoriesAction = new ArticleCategoriesPaginationAction(this.webDriver);
        articleCategoriesAction.onExecute();
    }
}
