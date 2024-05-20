

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {
    public static void main(String[] args) throws InterruptedException {
       
        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
 
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://demo.guru99.com/test/guru99home/");
        
    }
}
