package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util
{      public static LoadProp loadProp = new LoadProp();
        public static String browserName = loadProp.getProperty("browserName");

    public void setBrowser() // create Method for start up browser
    {

        if (browserName.equalsIgnoreCase("chrome"))
        {
            // setting up chrome driver path
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
            // create chrome driver object to open Google Chrome browser
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("Firefox"))
        {
            // setting up chrome driver path
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDrivers\\geckodriver.exe");
            //System.setProperty("webdriver.gecko.driver", "C:\\soft\\geckodriver-v0.26.0-win64geckodriver.exe");
            //Now you can Initialize marionette driver to launch firefox
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            driver = new FirefoxDriver();
//
        } else if (browserName.equalsIgnoreCase("ie"))
        {
            // setting up chrome driver path
            System.setProperty("webdriver.ie.driver", "src\\test\\resources\\BrowserDrivers\\IEDriverServer.exe");
            // create chrome driver object to open Google Chrome browser
            driver = new InternetExplorerDriver();
        } else
        {
            System.out.println("you browser name is wrong or empty" + browserName);
        }

        //String urlName = loadProp.getProperty("url");
        // maximising screen
        driver.manage().window().maximize();
        // Applying implicitly wait of 10 sec to driver instance
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // open the URL
        driver.get(loadProp.getProperty("url"));
    }
//    // create new method for Close Browser
//    public void closeBrowser() {driver.close();}// reusable method to close browser
}
