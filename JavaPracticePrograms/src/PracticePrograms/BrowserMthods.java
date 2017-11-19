package PracticePrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMthods {

	public static void main(String[] args) {
     //set the gecko driver path
		System.setProperty("webdriver.gecko.driver","C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		//launch the browser
		   //interface refvar=new implementing class();
		    WebDriver driver=new FirefoxDriver();
		    // maximise the window
		    driver.manage().window().maximize();
		    //open the url
		    driver.get("http://www.monsterindia.com");
		    //fetch the page title
		   String t= driver.getTitle();
		    System.out.println("Title of the current page is:"+t);
		    //fetch the absolute url
		    String absurl=driver.getCurrentUrl();
		    System.out.println("current page of the absolute url is:"+absurl);
		    //fetch the page source code
		    String src=driver.getPageSource();
		    //fetch the window handle
		    String pid=driver.getWindowHandle();
		    System.out.println("current page wino id is:"+pid);
		    //fetch all the open window ids
		    //set<datatype>collectionname=driver.getwindowhandles();
		    Set<String>handles=driver.getWindowHandles();
		    for(String h:handles){
		    	System.out.println(h);
		    	if(!pid.equals(h)){
		    		driver.switchTo().window(h);
		    	}
		    	
		    }
driver.findElement(By.cssSelector("input.border_grey")).sendKeys("abc");

driver.switchTo().window(pid);
	}

}
