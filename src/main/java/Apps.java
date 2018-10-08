
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import modules.LoginAction;

public class Apps {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "D:\\OFFICE_SOME\\PROJECT OFFICE\\pelni\\Apps\\driver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost/forsa/public/");
        webDriver.manage().window().maximize();
        LoginAction loginAction = new LoginAction(webDriver);
        loginAction.onExecute();
        Thread.sleep(50000);
        webDriver.close();


    }
}
