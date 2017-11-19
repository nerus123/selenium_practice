package webdriverprograms;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonsterIndia {

	public static void main(String[] args) {
		// set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		// launch the browser
		// interface refvar=new implementing class();
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implict wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		// open url
		driver.navigate().to("http://www.monsterindia.com/");
		// fetch the title of the page
		String t = driver.getTitle();
		System.out.println("cureent page title is:" + t);
		// fetch the absurl of the page
		String absurl = driver.getCurrentUrl();
		System.out.println("current page of absolute url is:" + absurl);
		// fetch the currenrt page html source code
		String src = driver.getPageSource();
		// fetch th winow id
		String pid = driver.getWindowHandle();
		System.out.println("window is is:"+pid);
		Set<String>handles=driver.getWindowHandles();
		for(String h:handles){
			System.out.println(h);
			if(!pid.equals(h)){
				driver.switchTo().window(h);
			}
			
		}
		System.out.println(handles.size());
		driver.findElement(By.className("border_grey")).sendKeys("abc");
		//identify the multiselection dropdown
		WebElement ind_drp=driver.findElement(By.id("id_industry"));
		//create an object for select class
		Select sel =new Select(ind_drp);
		//select an option by visible text
		sel.selectByVisibleText("Education");
		//select an option by value
		sel.deselectByValue("8");
		//select by postion
		sel.selectByIndex(1);
		//select by visible text
		sel.selectByVisibleText("Sugar");
		//select by value
		sel.selectByValue("70");
	//select by postion
	sel.selectByIndex(20);	
		//fetch all the selected values
	List<WebElement>slctopts=sel.getAllSelectedOptions();
	for(WebElement s:slctopts){
		System.out.print(s.getText()+"\t");
	}
	System.out.println(" ");
	//fetch first selected option
	
	WebElement frstslctopt=sel.getFirstSelectedOption();
	System.out.println("first selected option is:"+frstslctopt.getText());
	//fetch all the drop down options
	List<WebElement>opts=sel.getOptions();
	for(WebElement o:opts){
		
	
	System.out.println(o.getText());
	}
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	//fetch dropdown optons by using drpdown
	List<WebElement>coll=ind_drp.findElements(By.tagName("option"));
	for(WebElement c:coll){
		System.out.println(c.getText());
	}
	//deseelct all
	sel.deselectAll();
	//slect an option  by randomly
//create an object for select class
	//Select sel=new select();
	int icnt=opts.size();
	System.out.println(icnt);
	//using random class to generate random values
	Random r=new Random();
	int rnum=r.nextInt(opts.size());
	//select an option by postion
	sel.selectByIndex(rnum);
	
	}

}
