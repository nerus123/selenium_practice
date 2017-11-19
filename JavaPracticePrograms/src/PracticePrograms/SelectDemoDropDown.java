package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemoDropDown {

	public static void main(String[] args) throws InterruptedException {
		//set the chrome driver
				System.setProperty("webdriver.chrome.driver","C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
				//launch the browser
				WebDriver driver=new ChromeDriver();
				//set the system variable gecko driver
				//System.setProperty("webdriver.gecko.driver","C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
				//launch the browser
				//interface refvar=new implementing class();\
				//WebDriver driver=new FirefoxDriver();
				//maximize the winow
				driver.manage().window().maximize();
				//add implicit wait
				//driver.manage().timeouts().implicitlyWait(20000,TimeUnit.MILLISECONDS);
				//open url
				driver.navigate().to("http://www.ebay.in");
				//browser methods
				//fetch the page title
				String t=driver.getTitle();
				System.out.println("page title is :"+t);
				//fetch absolute url
				String absurl=driver.getCurrentUrl();
				System.out.println("absolute url is:"+absurl);
				//fetch window id
				String pid=driver.getWindowHandle();
				System.out.println("window handle is :"+pid);
			
               //select the dropdown
               WebElement allcat_drp=driver.findElement(By.id("gh-cat"));
               // create an aobject for select class
               Select sel=new Select(allcat_drp);
               //select an option by visible text
               sel.selectByVisibleText("Automotive");
               Thread.sleep(3000);
               //select an option by value
               sel.selectByValue("178777");
               Thread.sleep(3000);
               //select an option by postion
               sel.selectByIndex(1);
               //fetch all the drop down options by using select class method
               List<WebElement>opts=sel.getOptions();
               
               for(WebElement o:opts){
            	   System.out.println(o.getText());
               }
             //select the last option from drop down
           
               sel.selectByIndex(opts.size()-1);
               
            	   
               
               

	}

}
