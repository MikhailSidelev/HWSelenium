package class02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        //   instance
        WebDriver driver = new ChromeDriver();
        // navigate to website
        driver.get("http://35.175.58.98/input-form-locator.php");
        //  maximize the window
        driver.manage().window().maximize();

        // locate the WebElement first name
        WebElement firstName=driver.findElement(By.id("first_name"));
        firstName.sendKeys("mikhail");

        // locate the WebElement name
        WebElement lastName=driver.findElement(By.name("last_name"));
        lastName.sendKeys("sidelev");

        // locate the WebElement email
        WebElement email=driver.findElement(By.className("form-control-01"));
        email.sendKeys("mikhailsidelev@gmail.com");

        //Tag name
        WebElement submitBtn =driver.findElement(By.tagName("button"));
       submitBtn.click();

       //text
        WebElement linkBtn=driver.findElement(By.linkText("Link"));
       linkBtn.click();

       //partial text
        WebElement clickHere=driver.findElement(By.partialLinkText("Here"));
        clickHere.click();


    }
}
