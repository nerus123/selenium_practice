package PracticePrograms;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectionDrop {

	public static void main(String[] args) throws InterruptedException {
		//set the system variable gecko driver
		//System.setProperty("webdriver.gecko.driver","C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		//set the system variable path chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//lauanch the browser
		//interface refvar=new implementingclass();
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//maximise the winow
		driver.manage().window().maximize();
		//open url
		driver.get("http://my.monsterindia.com/create_account.html?r=1499115397&src=");
		//call the browser methods
		//fetch the title
		System.out.println("page title is:"+driver.getTitle());
		//fetch absolute url
		System.out.println("current absolute url is:"+driver.getCurrentUrl());
		//fetch window id
		String pid=driver.getWindowHandle();
		System.out.println("window id is:"+pid);
		//fetch all the window ids
		
		Set<String>handles=driver.getWindowHandles();
		for(String h:handles){
			if(!pid.equals(h)){
				driver.switchTo().window(h);
				//identify the industry dropdown
				WebElement ind_drp=driver.findElement(By.id("id_industry"));
				//create an object for the select class if the tag is select
				Select ms=new Select(ind_drp);
				//select an option by visible text
				//ms.selectByVisibleText("Banking/ Financial Services");
				//select by postion
				//ms.selectByIndex(1);
				//select by value
				//ms.selectByValue("8");
				//select an option by visible text
				//ms.selectByVisibleText("Engineering, Procurement, Construction");
				//select an option by position
				//ms.selectByIndex(10);
				//select an option by value
				//ms.selectByValue("77");
				//fetch all selected options
				//List<WebElement>slctdopts=ms.getAllSelectedOptions();
				//System.out.println("all seelcted options are:");
				//for(WebElement s:slctdopts){
				
				//	System.out.println(s.getText()+"\t");
				//}
				//System.out.println("*****************************************************");
				//fetch first selected option
				//WebElement frstslctd=ms.getFirstSelectedOption();
				//System.out.println("first selected option is:"+frstslctd.getText());
				
				//fetch all drop down options
				List<WebElement>opts=ms.getOptions();
				//random option
				//create an object for random class
				Random r=new Random();
				int rnum=r.nextInt(opts.size());
				//select an option by position
				ms.selectByIndex(rnum);
				System.out.println("selected value from the drop down:"+ind_drp.getAttribute("value"));
				Thread.sleep(3000);
			
				//deselect  by visible text
				//ms.deselectByVisibleText("Banking/ Financial Services");
				//ms.deselectAll();
				
				
				driver.close();
			
			}
		}
		
			driver.switchTo().window(pid);
			
			
	}

}
