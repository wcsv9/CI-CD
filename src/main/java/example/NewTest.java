package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;	
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		

	    	  @Test
	    	  public void openMyBlog() {
	    	 driver.get("https://www.softwaretestingmaterial.com/");
			  WebElement title = driver.findElement(By.xpath("//title"));

       System.out.println("********************************************************");

       System.out.println("*" + title.getAttribute("text") + "*");

       System.out.println("********************************************************");
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
