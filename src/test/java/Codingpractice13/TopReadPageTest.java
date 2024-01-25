package Codingpractice13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopReadPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatopreads.ccbp.tech/");
        driver.manage().window().maximize();
        //Test the sub-title of the first blog:
        WebElement el1 = driver.findElement(By.cssSelector("body > div > div > div > div:nth-child(2) > div > div > h1.trending-blogs-card-sub-title"));
        String Str1 = el1.getText();
        String Str2 = "Guide to Fountain Pen Nibs";
        if (Str1.equals(Str2)) {
            System.out.println("Sub-title 1: Verified");
        } else {
            System.out.println("Sub-title 1: Verification failed");
        }
        //Test the sub-title of the second blog:
        WebElement el2 = driver.findElement(By.cssSelector("body > div > div > div > div:nth-child(3) > div > div > h1.trending-blogs-card-sub-title"));
        String Str3 = el2.getText();
        String Str4="Productivity";
        if(Str3.equals(Str4)){
            System.out.println("Sub-title 2: Verified");
        }else{
            System.out.println("Sub-title 2: Verification failed");
        }
        //Test the title of the first blog
        WebElement el3= driver.findElement(By.cssSelector("body > div > div > div > div:nth-child(2) > div > div > h1.trending-blogs-card-title"));
        String Str5=el3.getText();
        String Str6="Guide to Fountain Pen Nibs";
        if(Str5.equals(Str6)){
            System.out.println("Title 1: Verified");
        }else{
            System.out.println("Title 1: Verification failed");
        }
        //Test the title of the second blog:
        WebElement el4= driver.findElement(By.cssSelector("body > div > div > div > div:nth-child(3) > div > div > h1.trending-blogs-card-title"));
       String Str7=el4.getText();
       String Str8="How to Craft a Better Todo List";
       if(Str7.equals(Str8)){
           System.out.println("Title 2: Verified");
       }else{
           System.out.println("Title 2: Verification failed");
       }
       driver.quit();
    }
}
