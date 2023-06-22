/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author hp
 */
public class Selenium {

         
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\sel\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.navigate().to("https://google.com/");
         System.out.println("working");
         driver.manage().window().maximize();
         driver.findElement(By.name("q")).sendKeys("Software engineering");
         driver.findElement(By.className("qNO9b")).click();
         String appTitle=driver.getTitle();
         System.out.println(appTitle);
         
    }
    
}
