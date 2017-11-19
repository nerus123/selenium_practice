package webdriverprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

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
				driver.navigate().to("http://www.rediff.com/");
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

				//fetch the tooltip
			String tp=driver.findElement(By.id("redifflogo")).getAttribute("title");
			System.out.println("tooltip is:"+tp);
	}

}
