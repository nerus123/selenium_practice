package learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class learning1 {

	public static void main(String[] args) {
		// TODO Auto-generated met
		//System.out.println("hai");
		System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		// launch the browser
	//interface reference variable=new implementingclass();
		//WebDriver driver=new ChromeDriver(); 
		WebDriver driver=new FirefoxDriver();
		 //open the url
		// refvar.methodname();
		 driver.get("http://facebook.com");
		 //fetch the page title
		  String t=driver.getTitle();
		  //printing the page title
		  System.out.println("Title is:"+t);
		  //fetch the absolute url
		  String absurl=driver.getCurrentUrl();
		  System.out.println("absolute url is :"+absurl);
		//some actions methods;
		  // close the browser
		  //driver.close();
		  //quitting the webdriver
		  driver.quit();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
		
		
		
		
}

}
