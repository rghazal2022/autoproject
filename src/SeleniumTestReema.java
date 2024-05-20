



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestReema {
 
 
    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
   //	System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
    //	FirefoxOptions options = new FirefoxOptions();
   //	options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
    	//WebDriver driver = new FirefoxDriver(options);
	//	WebDriver driver = new FirefoxDriver();
    	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
 
        
        
       //  launch chrome  and direct it to the Base URL
        driver.get(baseUrl);
        
        WebElement username = driver.findElement(By.name("userName"));
  	  Thread.sleep(3000);
  	  username.sendKeys("Test username");
  	  Thread.sleep(3000);
  	  username.clear();
  	  Thread.sleep(3000);
  	  username.click();
  	        Thread.sleep(3000);
  	        
  	        
  	      WebElement password = driver.findElement(By.name("password"));
  	    Thread.sleep(3000);
    	  password.sendKeys("Test password");
    	  Thread.sleep(3000);
    	  password.clear();
    	  Thread.sleep(3000);
    	  password.click();
    	        Thread.sleep(3000);
    	        
    	        
    	        
  	      
  	      driver.quit();
 
        // get the actual value of the title
       // actualTitle = driver.getTitle();
 
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
       // if (actualTitle.contentEquals(expectedTitle)){
          //  System.out.println("Test Passed!");
       // } else {
        //    System.out.println("Test Failed");
       // }

 
      //  driver.quit();
    }
 
}