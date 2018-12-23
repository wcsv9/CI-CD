package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;	
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;	
public class NewTest {		
	    private WebDriver driver;		

	    	  @Test
	    	  public void openMyBlog() {
	    	 driver.get("https://www.softwaretestingmaterial.com/");
	    	  }
	    	  
	    	  @BeforeTest
	    	  public void beforeTest() {
	    			System.setProperty("browser.gecko.driver", System.getProperty("user.dir")+"/geckodriver");
//	    	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\taha.patel\\eclipse-workspace2\\SampleProject\\geckodriver.exe");
	    	   driver = new FirefoxDriver();
	    	   
	    	  }
	    	 
	    	  @AfterTest
	    	  public void afterTest() {
	    	   driver.quit();
	    	  }	
}

class RemoteTest {

  public static void main(String[] args) throws Exception {
    // Change this to match the location of your server
    URL server = new URL("http://192.168.16.134:4444/wd/hub");

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setBrowserName("firefox");

    System.out.println("Connecting to " + server);

    WebDriver driver = new RemoteWebDriver(server, capabilities);

    driver.get("http://www.google.com");

    driver.quit();
  }	

