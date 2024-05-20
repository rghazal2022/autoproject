
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelected {
	
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();  
  driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
	
	WebElement accordionExampleCheckboxTrue = driver.findElement(By.id("bicycle-checkbox"));
	WebElement accordionExampleCheckboxTrue1 = driver.findElement(By.id("hatchback-checkbox"));
	WebElement accordionExampleCheckboxTrue2 = driver.findElement(By.id("sedan-checkbox"));
	WebElement accordionExampleCheckboxTrue3 = driver.findElement(By.id("van-checkbox"));
	WebElement accordionExampleCheckboxTrue4 = driver.findElement(By.id("suv-checkbox"));
	WebElement accordionExampleCheckboxTrue5 = driver.findElement(By.id("truck-checkbox"));
	WebElement accordionExampleCheckboxTrue6 = driver.findElement(By.id("novels-radio-btn"));
	
	
	 accordionExampleCheckboxTrue.click();
	 accordionExampleCheckboxTrue1.click();
	 accordionExampleCheckboxTrue2.click();
	 accordionExampleCheckboxTrue3.click();
	 accordionExampleCheckboxTrue4.click();
	 accordionExampleCheckboxTrue5.click();
	 accordionExampleCheckboxTrue6.click();
	 
	 Thread.sleep(3000);
	 
	 
	 Select programminglanguages = new Select (driver.findElement(By.id("programming-languages")));
	 programminglanguages.selectByVisibleText("Python");
	 
	 
	 Thread.sleep(3000);
	 
	 Select Tool = new Select (driver.findElement(By.id("selenium_suite")));
	 Tool.selectByVisibleText("Advantages");
	 Tool.selectByIndex(1);
	 
	 Thread.sleep(3000);
	 
	  driver.quit();
	
	}
}
