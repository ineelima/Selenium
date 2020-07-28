package SeleniumWindowHandles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22585/aus-vs-nz-1st-odi-new-zealand-tour-of-australia-2020");
        WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));

        int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        int colCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        System.out.println(rowCount);
        System.out.println(colCount);
        int sum=0;

        for(int i=0;i<colCount-3;i++) {
            String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText() ;
            int intValue=Integer.parseInt(value);
            sum=sum+intValue;
        }
        System.out.println(driver.findElement(By.xpath("//div[text()='Extras'] /following-sibling::div")).getText());
        System.out.println(driver.findElement(By.xpath("//div[text()='Total'] /following-sibling::div")).getText());
        System.out.println(driver.findElement(By.xpath("//div[text()='Total'] /following-sibling::div[2]")).getText());
        driver.quit();
    }

}
