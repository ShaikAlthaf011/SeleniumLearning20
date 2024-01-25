package Codingpractice13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OurCompanyPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qacompany.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.cssSelector("div[class='services-container']>h3:first-of-type"));
        String Str1=el1.getText();
        System.out.println(Str1);
        WebElement el2= driver.findElement(By.cssSelector("div.services-container>h3:nth-of-type(2)"));
        String Str3=el2.getText();
        System.out.println(Str3);
        WebElement el3= driver.findElement(By.cssSelector("div.services-container>h3:last-of-type"));
        String Str4=el3.getText();
        System.out.println(Str4);
        WebElement el4= driver.findElement(By.cssSelector("div[class='services-container']>p:first-of-type"));
        String Str5=el4.getText();
        System.out.println(Str5);
        WebElement el5=driver.findElement(By.cssSelector("div[class='services-container']>p:nth-of-type(2)"));
        String Str6=el5.getText();
        System.out.println(Str6);
        WebElement el6=driver.findElement(By.cssSelector("div[class='services-container']>p:last-of-type"));
        String Str7=el6.getText();
        System.out.println(Str7);
        driver.quit();
    }
}
