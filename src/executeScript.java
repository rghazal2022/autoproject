import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeScript {


public static void main(String[] args) throws InterruptedException {
	
	
	//System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/users/sign_in");
	js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
	js.executeScript("document.getElementById('user_password').value='password';");
	js.executeScript("document.getElementById('user_submit').click();");
	js.executeScript("alert('enter correct login credentials to continue');");
	Thread.sleep(2000);
	}
}