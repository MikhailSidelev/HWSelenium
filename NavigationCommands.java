package class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
 // go to google.com
        driver.get("https:www.google.com");
// max the window
        driver.manage().window().maximize();
 // Slow down to observe the process
        Thread.sleep(2000);
// go to facebook.com
driver.navigate().to("https://www.facebook.com");
// Slow down to observe the process
        Thread.sleep(2000);
// go back
        driver.navigate().back();
// Slow down to observe the process
        Thread.sleep(2000);
// go forward
        driver.navigate().forward();
// Slow down to observe the process
        Thread.sleep(2000);
// refresh
        driver.navigate().refresh();
// close
        driver.close();
// quite
        driver.quit();
    }
}
