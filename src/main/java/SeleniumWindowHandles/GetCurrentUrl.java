package SeleniumWindowHandles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class GetCurrentUrl {
    public static void main(String[] args) throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//        driver.get("http://www.facebook.com/");
//        System.out.println(driver.getCurrentUrl());
//        URL u=new URL(driver.getCurrentUrl());
////        String[] url=u.getQuery().split("[.]");
//        String[] url=driver.getCurrentUrl().split("[.]");
//        System.out.println(url[1]);
//
//        driver.findElement(By.cssSelector("input#email")).sendKeys("ineelima@gmail.com");
//        driver.findElement(By.cssSelector("input#pass")).sendKeys("anavrin2");
//        driver.findElement(By.cssSelector("input#u_0_b")).click();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        //driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());
        driver.quit();


    }
}
