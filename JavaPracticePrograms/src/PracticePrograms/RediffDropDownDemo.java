package PracticePrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffDropDownDemo {

	public static void main(String[] args) {
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
		driver.navigate().to("http://rediff.com");
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
		//click on rediffmail account link
		driver.findElement(By.partialLinkText("Create a Rediffmail account")).click();
		//verify page title
		//create an object for webdriver wait
		WebDriverWait wait=new WebDriverWait(driver,10);//explicit wait
		//verify the page title
		wait.until(ExpectedConditions.titleIs("Rediffmail Free Unlimited Storage"));
		//verify  the text
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='tblcrtac']/tbody/tr[1]/td"),"Create a Rediffmail account"));
		//identify the country dropdown
		WebElement cntry_drp=driver.findElement(By.id("country"));
		//fetch all dropdown options using tagname option
		List<WebElement>opts=cntry_drp.findElements(By.tagName("option"));
		for(WebElement o:opts){
			System.out.println("each country name:"+o.getText());
			if(o.getText().equals("Andorra")){
				//select an option 
				o.click();
				continue;
			}
		}
		
		
		

	}

}
