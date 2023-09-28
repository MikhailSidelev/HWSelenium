package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

import java.sql.Driver;

public class FaceBookExample {
    public static void main(String[] args) {
        // instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        // find the email address
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("mikhalvira@yahoo.com");

        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("zaq$%frQw");

      WebElement loginBtn = driver.findElement(By.name("login"));

       loginBtn.click();



    }
}
