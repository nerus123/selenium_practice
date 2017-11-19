package rizwaana;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class GoogleTestng {
	public static WebDriver driver=null;
	
  @Test
  public void openBrowser() {
	  
	  //open url
	  driver.get("https://www.google.com/");
	  
	  //fetch all links into collection
		 List<WebElement>tot_links=driver.findElements(By.tagName("a"));
		 System.out.println("total number of links in google page:"+tot_links.size());
		 
		 //fetch the text
		WebElement ele = (WebElement) tot_links.toArray()[0];
		System.out.println(ele.getText());
		ele.click();
  }
  @BeforeClass
  public void beforeClass(){
	  
	//set the chrome driver path
			System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
			
			//launch the browser
		 driver=new ChromeDriver();
			 
			 //maximise the window
			 driver.manage().window().maximize();
	   
  }

  @AfterClass
  public void afterClass() {
	  
	//close the broswer
		 driver.quit();
  }

}
