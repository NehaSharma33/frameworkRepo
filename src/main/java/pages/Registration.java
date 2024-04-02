package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Registration {
private WebDriver driver;
    WebDriverWait wait;
   public Registration(WebDriver driver){
    this.driver=driver;
}

    private By registrationLink = By.xpath("//a[contains(text(), 'Registration')]");
   private By registrationBox = By.xpath("//div[@id='load_box']");
   private By name = By.xpath("//input[@name='name']");
    private By phone = By.xpath("//input[@name='phone']");
    private By email = By.xpath("//input[@name='email']");
    private By country = By.xpath("//select[@name='country']");
    private By city = By.xpath("//input[@name='city']");
    private By username = By.xpath("//input[@name='username']");
    private By password = By.xpath("//input[@name='password']");
    private By submitButton = By.xpath("//input[@value='Submit']");
    private  By alert = By.xpath("//p[@id='alert']");


    public void clickRegistrationLink(){
        wait = new WebDriverWait(driver, 10);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(registrationLink));
        button.click();
        System.out.println("button is clicked");
        WebElement box = wait.until(ExpectedConditions.presenceOfElementLocated(registrationBox));

    }

    public void fillRegistrationForm(){

        driver.findElement(name).sendKeys("Test");
        driver.findElement(phone).sendKeys("9887678876");
        driver.findElement(email).sendKeys("ns@email.com");
        driver.findElement(city).sendKeys("Delhi");
        driver.findElement(username).sendKeys("test");
        driver.findElement(password).sendKeys("test");




    }

    public void submitRegistrationForm()
    {

        driver.findElement(submitButton).click();
    }

    public void registeredSuccessfully(){

        WebElement alertMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(alert));
        if(alertMsg.getText().equals("This is just a dummy form, you just clicked SUBMIT BUTTON"))
        {
            System.out.print("Registrtaion is successful");
        }

    }



}
