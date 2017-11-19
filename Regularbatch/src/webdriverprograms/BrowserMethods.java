package webdriverprograms;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserMethods {

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
		driver.navigate().to("https://www.facebook.com/");
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
		// fetch all open window id
		Set<String> handles = driver.getWindowHandles();

		for (String h : handles) {
			System.out.println(h);
		}
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("rty");
		driver.findElement(By.id("loginbutton")).submit();
		driver.navigate().back();
		driver.navigate().refresh();
		// fetch all the monthdropdown options
		/// first identify the dropdown element
		WebElement mth_drp = driver.findElement(By.id("month"));
		List<WebElement> opts = mth_drp.findElements(By.tagName("option"));
		for (WebElement o : opts) {
			System.out.println(o.getText());

			if (o.getText().equals("Mar")) {
				o.click();
				continue;

			}

		}
		System.out.println("total number of dropdown options are:" + opts.size());
		// ELEMENT RETURNTYPE METHODS
		// fecth the text
		String txt = driver.findElement(By.className("_58mv")).getText();
		System.out.println("text is:" + txt);
		// wait commands
		// WebDriverWait wait=new WebDriverWait(driver,10);
		// wait.until(ExpectedConditions.titleContains("Facebook - Log In or
		// Sign Up"));
		// fetch the tooltip
		//String tp = driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).getAttribute("title");
		//System.out.println("tool tip is:" + tp);
		// fetch url of the link
		String url = driver.findElement(By.linkText("Forgot account?")).getAttribute("href");
		System.out.println("url is:" + url);
		String value=driver.findElement(By.id("email")).getAttribute("data-testid");
		System.out.println("attributename value si:"+value);
		//fetch the css value
		String m=driver.findElement(By.id("email")).getCssValue("margin");
		System.out.println("font size is:"+m);
		//fetche the element postition in the webpage
		Point p = driver.findElement(By.id("email")).getLocation();
		System.out.println("x value is:" + p.getX() + "y value is:" + p.getY());
		//fetch the height and width of the element
		Dimension d = driver.findElement(By.id("email")).getSize();
		System.out.println("height is:" + d.getHeight() + " " + "width is:" + d.getWidth());
		//fetch the tagname of the given elemnt
		String tag=driver.findElement(By.id("email")).getTagName();
		System.out.println("tagname is:"+tag);

	}

}
