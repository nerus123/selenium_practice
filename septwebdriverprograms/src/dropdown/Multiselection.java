package dropdown;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselection {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		//set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
              
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//open the url
		driver.get("http://my.monsterindia.com/create_account.html");
		
		//fetch the page title
		String txt=driver.getTitle();
		System.out.println("page title is:"+txt);

		//fetch the current page url
		String url=driver.getCurrentUrl();
		System.out.println("current page absolute url is:"+url);
		
		
		//fetch page source
		String src=driver.getPageSource();
		
		//get window handle
		String pid=driver.getWindowHandle();
		System.out.println("page id is:"+pid);
		
		//fetch all winow ids
		Set<String>handles=driver.getWindowHandles();
		System.out.println("size :"+handles.size());
		Iterator it=handles.iterator();
		//fetch the parent winow id
	String pwid=(String) it.next();
	
	//fetch the child window id
	String cwid=(String) it.next();
	
	//switch to the child window id
	driver.switchTo().window(cwid);
		
		/*for(String h:handles){
			if(!pid.equals(h)){
				//switch to child window
				driver.switchTo().window(h);
			}*/
			Thread.sleep(3000);
			
			//identify the industry multiselection drop
			WebElement ind_drp=driver.findElement(By.id("id_industry"));
			
			//create an object for select class
			Select sel=new Select (ind_drp);
			
			//fetch all dropdowns
			List<WebElement>opts=sel.getOptions();
			System.out.println("size is:"+opts.size());
			
			for(WebElement o:opts){
				System.out.println(o.getText());
			}
			
			//select an option by visible text
			sel.selectByVisibleText("Plastic/ Rubber");
			
			//select an option by  value
			sel.selectByValue("45");
			
			//select an option by index
			sel.selectByIndex(2);
			
			//fetch all selected options
			List<WebElement>slctdopts=sel.getAllSelectedOptions();
			System.out.println("selected option size is:"+slctdopts.size());
			for(WebElement s:slctdopts){
				System.out.println(s.getText());
			}
			
			//fetch first selected option
			WebElement frst_opt=sel.getFirstSelectedOption();
			System.out.println("first selected option");
			System.out.println(frst_opt.getText());
			
			//deslect all
			sel.deselectAll();
			
			//fetch all selected options
			List<WebElement>slc_opt=sel.getAllSelectedOptions();
		System.out.println("slected options are;");
		System.out.println(slc_opt.size());
			
			//close the child window
			driver.close();
			
			
			
			//switch to parent window
			driver.switchTo().window(pwid);
			
			driver.findElement(By.id("firstName_id")).sendKeys("neeraja");
			
			driver.findElement(By.id("lastName_id")).sendKeys("surender");
			
			Thread.sleep(3000);
			
			//close the parent winow
			driver.close();
		}
 
		
		
	}


