package Codingpractice13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlyBuyHelpDeskPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qafbhelpdesk.ccbp.tech/");
        driver.manage().window().maximize();
        //Test the address text:
        WebElement el1=driver.findElement(By.cssSelector("div[class='text-center text-md-left']>p[class='ecommerce-footer-section-address']"));
        String str1=el1.getText();
        String str2="37, Ayur Vigyan Nagar, New Delhi, India.";
        if(str1.equals(str2)){
            System.out.print("Address: Verified");
        }else{
            System.out.println("Address: Verification Failed");
        }
        //Test the heading of the first section:
        WebElement el2= driver.findElement(By.cssSelector("div[class='row']>div:nth-child(2)>h1"));
        String str3=el2.getText();
        String str4="Get to know ";
        if(str3.equals(str4)){
            System.out.println("Heading 1: Verified");
        }else{
            System.out.println("Heading 1: Verification Failed");
        }
        //Test the heading of the second section:
        WebElement el3= driver.findElement(By.cssSelector("div[class='row']>div:nth-child(3)>h1"));
       String Str5=el3.getText();
       String Str6="Contact with Us";
       if(Str5.equals(Str6)){
           System.out.println("Heading 2: Verified");
       }else{
           System.out.println("Heading 2: Verification Failed");
       }
       //Test the heading of the third section:
        WebElement el4= driver.findElement(By.cssSelector("div[class='row']>div:nth-child(4)>h1"));
        String Str7= el4.getText();
        String Str8="Let Us Help You";
        if(Str7.equals(Str8)){
            System.out.println("Heading 3: Verified");
        }else{
            System.out.println("Heading 3: Verification Failed");
        }
        //Test the copyright text:
        WebElement el5= driver.findElement(By.cssSelector("div[class='text-center']>span:last-child"));
        String Str9= el5.getText();
        String Str10="2020 by Rahul. Created with Bootstrap.";
        if(Str9.equals(Str10)){
            System.out.println("Copyright: Verified");
        }else{
            System.out.println("Copyright: Verification Failed");
        }
        driver.quit();
    }
}
