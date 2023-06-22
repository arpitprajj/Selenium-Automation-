package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebook {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\sel\\chromedriver.exe");
        System.out.println("hello");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        System.out.println("browser has been lauched");
        driver.manage().window().maximize();
        org.openqa.selenium.WebElement email=driver.findElement(By.id("email"));
        org.openqa.selenium.WebElement pass=driver.findElement(By.id("pass"));
        email.sendKeys("arpitprajjwal17361@gmail.com");
        Thread.sleep(2000);
        pass.sendKeys("ghjkl");
        Thread.sleep(2000);
       // org.openqa.selenium.WebElement login =driver.findElement(By.id("u_0_5_K4"));
        // Thread.sleep(1000);
        org.openqa.selenium.WebElement create=driver.findElement(By.className("_6ltg"));
       System.out.println("hello666");
       create.click();
        System.out.println("he");

        
    }
    
}