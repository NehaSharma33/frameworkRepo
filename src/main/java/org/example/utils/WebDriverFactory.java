package org.example.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class WebDriverFactory {

    public static WebDriver createWebDriver(String browserType) {
        WebDriver driver = null;

        switch (browserType.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "ie":
            case "internetexplorer":
                System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer");
                driver = new InternetExplorerDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "path/to/MicrosoftWebDriver");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Unsupported browser type: " + browserType);
        }

        return driver;
    }

}
