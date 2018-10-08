package modules.article.category;

import config.base.InterfacePage;
import config.base.PageAction;
import org.openqa.selenium.WebDriver;

public class CreateNewArticleAction extends PageAction {
    private final WebDriver webDriver;

    public CreateNewArticleAction(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void onExecute() throws Exception {
        this.input.setInputByCssSelector("input[name=]");
    }
}
