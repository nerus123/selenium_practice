package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		
		//open the browser
		//set the  system variable geckodriver 
		System.setProperty("webdriver.gecko.driver","C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		//open the browser
		//interface variable=new implementing class();
		WebDriver driver=new FirefoxDriver();
		//call all methods
		//refvar.methods();
		//open the url
		driver.get("http://www.rediff.com");
		// fetch the title of the page
		String t=driver.getTitle();
		System.out.println("current page title is:"+t);
		//fetch the absolute url
	String absurl=driver.getCurrentUrl();
	System.out.println("current page absolute url is :"+absurl);
	//fetch the window handle
	String pid=driver.getWindowHandle();
	System.out.println("current window id is:"+pid);
	//fetch the current page source code
	String src=driver.getPageSource();
	driver.findElement(By.id("email"));
	//close the current winowdow
	driver.close();
	//quit the entire webdriver
	driver.quit();
	
	

	}

}
