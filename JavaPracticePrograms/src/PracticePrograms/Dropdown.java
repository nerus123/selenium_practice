package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		//set the chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//open url
		driver.get("http://amazon.com");
		//fetch all the drop down optio
		//first identiny the drop down element
		WebElement all_drp=driver.findElement(By.id("searchDropdownBox"));
		//create an object for the select class
		Select sel=new Select(all_drp);
		List<WebElement>opts=sel.getOptions();
		System.out.println("options are:");
		for(WebElement o:opts){
			System.out.println(o.getText());
		}
		
//seelct by visible text
		sel.selectByVisibleText("Amazon Warehouse Deals");
		Thread.sleep(3000);
		//selct by value
		sel.selectByValue("search-alias=alexa-skills");
		Thread.sleep(3000);
			//select by postion
		sel.selectByIndex(9);
		//fetch the selected options
		List<WebElement>slctdopts=sel.getAllSelectedOptions();
		System.out.println("#####################################################");
		for(WebElement s:slctdopts){
			System.out.println(s.getText());
		}
			
			
		}

}
