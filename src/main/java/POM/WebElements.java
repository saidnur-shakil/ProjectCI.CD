package POM;

//import com.sun.xml.internal.ws.resources.UtilMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebElements {
    WebDriver driver;
    By ManagerLogIn = By.xpath("//button[text()=\"Bank Manager Login\"]");
    By AddCustomerButton = By.xpath(" (//button[text()])[3]");
    By IntName = By.xpath("(//input)[1]");
    By SecondName = By.xpath("(//input)[2]");
    By PostCode = By.xpath("(//input)[3]");
    By AddCustomer = By.xpath(" //button[text()=\"Add Customer\"]");

    public WebElements(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void ManagerLogIn(){
        driver.findElement(ManagerLogIn).click();
    }
    public void AddCustomer(){
        driver.findElement(AddCustomerButton).click();
    }
    public void CustomerData(String FirstName, String lastName, String postcode) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(IntName).sendKeys(FirstName);
        Thread.sleep(1000);
        driver.findElement(SecondName).sendKeys(lastName);
        Thread.sleep(1000);
        driver.findElement(PostCode).sendKeys(postcode);
    }
    public void clickButton(){
        driver.findElement(AddCustomer).click();
        driver.switchTo().alert().accept();
    }
}
