import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestFrame {
 
 
    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
   //	System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
    //	FirefoxOptions options = new FirefoxOptions();
   //	options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
    	//WebDriver driver = new FirefoxDriver(options);
	//	WebDriver driver = new FirefoxDriver();
    	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
    	
        String baseUrl = "https://demoqa.com/frames";
        String expectedTitle = "DEMOQA";
        String actualTitle = "";
 
       //  launch chrome  and direct it to the Base URL
        driver.get(baseUrl);
        
        WebElement nestedframe = driver.findElement(By.xpath  ("//span[contains(text(),'Nested Frames')]"));
        
      //*[@id="item-3"]/span
        nestedframe.click();
        
        driver.switchTo().frame(1);
     
        
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
        System.out.println("Total number of iframes are " + iframeElements.size());
       
        
        
       
  	      
  	      driver.quit();
 
       
    }
 
}