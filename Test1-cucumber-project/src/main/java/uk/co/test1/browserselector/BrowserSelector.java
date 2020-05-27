package uk.co.test1.browserselector;

import com.cucumber.listener.Reporter;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.co.test1.basepage.BasePage;

public class BrowserSelector<projectPath> extends BasePage {
    String projectPath=System.getProperty("user.dir");
    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome"));
        System.setProperty("webdriver.chrome.driver",projectPath+"drivers/chromedriver.exe");
        driver=new ChromeDriver();
        Reporter.addStepLog("chromebrowserselector");

    }
}
