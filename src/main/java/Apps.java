import config.Utils;
import features.LoginAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Apps {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                Utils.findFile("chromedriver.exe"));
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("http://localhost:8000");
        webDriver.manage().window().maximize();
        LoginAction loginAction = new LoginAction(webDriver);
        loginAction.onExecute();

    }


}
