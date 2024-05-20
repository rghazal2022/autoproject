import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class TestAlert {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();  
  String baseUrl = "https://demoqa.com/alerts";
 
driver.get("https://demoqa.com/alerts");
	

WebElement Alert4 = driver.findElement(By.id("promtButton"));

Thread.sleep(3000);

Alert4.click();

Thread.sleep(3000);


Alert simpleAlert = driver.switchTo().alert();
simpleAlert.sendKeys("Reema");
System.out.print("reema");

driver.quit();

	}
}
