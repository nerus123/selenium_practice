package link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//set geckodriver
		
		System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
//launch the browser
//interfacename variable=new implementing class();
		WebDriver driver=new FirefoxDriver();
		//maximize window
		driver.manage().window().maximize();
		//open url
		//refvar.method();
		driver.get("http://www.google.com");
		
		//fetch the title
	
    System.out.println("page title:"+driver.getTitle());
    //current url
    System.out.println("current url is:"+driver.getCurrentUrl());
		
		//page source
	//System.out.println("page source:"+driver.getPageSource());
	//window handle
	System.out.println("window is :"+driver.getWindowHandle());
	  
	  //2)type the keyword(selenium) in search editbox in google home page
	  
	driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	//3)submit on the editbox
	driver.findElement(By.id("lst-ib")).submit();
	  //verify whether results text is displayed or not
	//4)fetch the results count text and extract only the number from text
	Thread.sleep(5000);

	String s=driver.findElement(By.xpath(".//*[@id='resultStats']")).getText();
	
	System.out.println("result is:"+s);
	
	String[] words = s.split(" ");
	
	System.out.println(words[1]);
	  
	  //5)click on selenium link in results page
	
	  driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
	  
	  //6)verify the the next page title
	 
	  Thread.sleep(10000);
	 
	 // 7)click on download tab 
	  driver.findElement(By.linkText("Download")).click();

	  Thread.sleep(2000);

	  
	 // 8)navigate back to the previous page.
	  
	  driver.navigate().back();
	  driver.quit();
	  

  
	}

}
