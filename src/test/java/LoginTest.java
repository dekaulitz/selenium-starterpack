
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.Platform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import static org.testng.AssertJUnit.assertEquals;


public class LoginTest {


    private static Wait<WebDriver> wait;
    private static DesiredCapabilities capabillities;
    private static WebDriver driver;


    @BeforeClass
    public static void setUp() throws Exception {
        capabillities = DesiredCapabilities.firefox();
        /** URL is the selenium hub URL here **/
        driver = new RemoteWebDriver(new URL("http://ip_of_the_machine_where_hub_running:port/wd/hub"), capabillities);
        capabillities.setBrowserName("firefox");
        wait = new WebDriverWait(driver, 6000);
    }

    /**
     * To test the UI
     *
     * @throws Exception
     */
    @Test
    public void testUI() throws Exception {
        /** Your application URL which you want to test **/
        driver.get("http://localhost:8090/myapp/index.html");
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                return webDriver.findElement(By.tagName("title")) != null;
            }
        });
        //  log.info(driver.findElement(By.tagName("body")).getText());
        assertEquals("http://localhost:8000", "http://localhost:8000", driver.getCurrentUrl());
        /** put other asserts as well **/
    }

    @Test
    public void mailTest() throws MalformedURLException {
        DesiredCapabilities dr = null;
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dr);
        driver.navigate().to("http://gmail.com");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("password");
        driver.close();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}
