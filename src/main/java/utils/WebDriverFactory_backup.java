package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory_backup {
    public static WebDriver driver;
    public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public WebDriver initDriver(String browser)
    {
        System.out.println("Browser value is:" +browser);
        if(browser.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:/Users/neha_sharma3/Downloads/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        }

        else  if(browser.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            threadLocalDriver.set(new FirefoxDriver());
        }

        else
        {
            System.out.println("Please pass correct Browser value");
        }

        getDriver().manage().deleteAllCookies();
        return getDriver();
    }

    public static  WebDriver getDriver(){
        if (driver == null) {
            // Set system property for Chrome driver executable
            System.setProperty("webdriver.chrome.driver", "C:/Users/neha_sharma3/Downloads/chromedriver_win32/chromedriver.exe");
            // Initialize ChromeDriver
            driver = new ChromeDriver();
        }

        return driver;
    }

    /*public static WebDriver createWebDriver(String browserType) {


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
    }*/

}
