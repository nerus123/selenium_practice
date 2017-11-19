package link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chrometest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//set  the chromedriver exe file fath
		
		System.setProperty("webdriver.chrome.driver","C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//open url
		driver.get("http://www.yahoo.com");
		//maximise the window
		driver.manage().window().maximize();
	
		//get the title
	
		System.out.println("title is :"+driver.getTitle());
		//get current url
		System.out.println("current url is:"+driver.getCurrentUrl());
		//get window id
		System.out.println("window handle:"+driver.getWindowHandle());
		//type the keyword selenium in the search box
		driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
		driver.findElement(By.id("uh-search-button")).submit();
		// create an object for webdriver wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='resultStats']")));
	//fetch the results text from search results page
		//String s=driver.findElement(By.xpath(".//*[@id='resultStats']")).getText();
		//System.out.println("result text is:"+s);
		
	//String[] str=s.split("");
	//System.out.println("result count is:"+str[1]);
	//click on downloads
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Download")));	
	    driver.findElement(By.linkText("Download")).click();

	}

}
