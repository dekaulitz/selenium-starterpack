package config.base;

import org.openqa.selenium.WebDriver;

public abstract class ViewAction {
    protected WebDriver webDriver;
    protected Element element;


    public ViewAction(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.element = new Element(webDriver);


    }

    /**
     * you may test the negative test with this form action
     *
     * @throws Exception
     */
    abstract public void onNegative() throws Exception;

    /**
     * you may test the positive test with this form action
     *
     * @throws Exception
     */
    abstract public void onExecute() throws Exception;
}
