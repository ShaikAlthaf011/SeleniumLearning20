package Codingpractice13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeedAppTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qafeedback.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1= driver.findElement(By.cssSelector("div#root>div>div>div>ul>li:first-child"));
        el1.click();
        WebElement el2= driver.findElement(By.cssSelector("div.thank-you-container>button:last-child"));
       el2.click();
       WebElement el3= driver.findElement(By.cssSelector("li:nth-child(2)"));
       el3.click();
        WebElement el4= driver.findElement(By.cssSelector("div.thank-you-container>button:last-child"));
        el4.click();
        WebElement el5=driver.findElement(By.cssSelector("li:last-child"));
        el5.click();
        WebElement el6=driver.findElement(By.cssSelector("div#root>div>div>div>h1"));
        String Str1=el6.getText();
        String Str2= "Thank You!";
        if(Str1.equals(Str2)){
            System.out.println("Thank You text: Verified");
        }else{
            System.out.println("Thank You text: Verification Failed");
        }
        WebElement el7= driver.findElement(By.cssSelector("#root>div>div>div>p"));
        String Str17=el7.getText();
        String Str18="We will use your feedback to improve our customer support performance.";
        if(Str17.equals(Str18)){
            System.out.println("Description: Verified");
        }else{
            System.out.println("Description: Verification Failed");
        }
        driver.quit();
    }
}
