package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
              
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("http://www.rediff.com");
		
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
		
		//fetch text
		String txt1=driver.findElement(By.xpath("//*[@id='column1']/div[5]/div/a")).getText();
		System.out.println("text is:"+txt1);
		
		
		//fetch the tool tip for the signin link
		
		String tp=driver.findElement(By.linkText("Sign in")).getAttribute("title");
		System.out.println("tool tip is:"+tp);
		
		//fetch the url of create rediffmail account
		String url1=driver.findElement(By.linkText("Create a Rediffmail account")).getAttribute("href");
		System.out.println("url is:"+url1);
		
		//fetch src of the redifflogo image
		String logosrc=driver.findElement(By.id("redifflogo")).getAttribute("src");
		System.out.println("src of rediff logo is:"+logosrc);
		
		//fetch cssvalue for the cssproperty
	 //fetch the color of the seach button
		String c=driver.findElement(By.className("newsrchbtn")).getCssValue("color");
		System.out.println("coloris:"+c);
		
		//fetch the font family of search button
		String ff=driver.findElement(By.className("newsrchbtn")).getCssValue("font-family");
		System.out.println("font family for search button is:"+ff);
		
 //fetch the location of serach editbox
		Point p=driver.findElement(By.id("srchword")).getLocation();
		System.out.println("x coordinate is:"+p.getX()+"y coordinate is:"+p.getY());
		
//fetch the dimension of search edit box
		Dimension d=driver.findElement(By.id("srchword")).getSize();
		System.out.println("height is:"+d.getHeight()+"width is:"+d.getWidth());
		
		//fetch the tagname of search editbox
		String tag=driver.findElement(By.id("srchword")).getTagName();
		System.out.println("tagname for the search editbox is:"+tag);
		
		//close the browser
		driver.close();
	}
	
	

}
