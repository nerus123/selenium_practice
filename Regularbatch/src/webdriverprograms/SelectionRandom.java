package webdriverprograms;//random selecton

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionRandom{
public static void main(String[] args) {
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
		System.out.println("window is is:" + pid);
		Set<String> handles = driver.getWindowHandles();
		for (String h : handles) {
			System.out.println(h);
			if (!pid.equals(h)) {
				driver.switchTo().window(h);
			}

		}
		System.out.println(handles.size());
		driver.findElement(By.className("border_grey")).sendKeys("abc");
		//fetch all the dropdowns
		
		// first identify the drop down and create object for select class
		WebElement ind_drp = driver.findElement(By.id("id_industry"));
		Select sel=new Select(ind_drp);
		List<WebElement>opts=sel.getOptions();
		for(WebElement o:opts){
			System.out.println(o.getText());
		}
		// how to select the optin by ranndomly
		// first identify the drop down and create object for select class
		
		//create object for randoma class
		Random r=new Random();
		int rnum=r.nextInt(opts.size());
		//select by postion
		sel.selectByIndex(rnum);
		System.out.println(opts.size());
		
		



	}

}
