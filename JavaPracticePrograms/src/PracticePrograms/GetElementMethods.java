package PracticePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementMethods {

	public static void main(String[] args) {
		
		//set the chrome driver
				System.setProperty("webdriver.chrome.driver","C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
				//open the browser
				WebDriver driver=new ChromeDriver();
				//maximize the window
				driver.manage().window().maximize();
				//add implict wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
				//open url
				driver.get("http://facebook.com");
				//fetch the text from anywebpage
				//String txt=driver.findElement(By.xpath("//*[@id='u_0_m']/p")).getText();
				//System.out.println("paragraph text is:"+txt);
				//any attribut value
				//getAttribute("attributevalue")
				//fetch the tool tip of facebook logo
				
		String tp=driver.findElement(By.xpath("//a[@title='Go to Facebook Home']")).getAttribute("title");
				System.out.println("tool tip of facebook logo is:"+tp);
				
				//get image src attribute value
				
			//String  val=driver.findElement(By.className("_s0 _4ooo _1gax img"))	.getAttribute("src");
			//System.out.println("imafe src value is:"+val);
			//get the forgotten acc link
			String url=driver.findElement(By.linkText("Forgot account?")).getAttribute("href");
				System.out.println("forgotten account link is:"+url);
				//fetch the create an account button colour
				String clr=driver.findElement(By.id("u_0_n")).getCssValue("color");
				System.out.println("color of create account button :"+clr);
		String ff=driver.findElement(By.cssSelector("button[name='websubmit']")).getCssValue("font-family");
		System.out.println("font-family is:"+ff);
		//get location 
		Point p=driver.findElement(By.id("u_0_f")).getLocation();
		System.out.println("x coordinate value:"+p.getX()+"y coordinate value is"+p.getY());
		
		//fetch the size of month dropdown
		Dimension d=driver.findElement(By.xpath("//select[@name='birthday_month']")).getSize();
		System.out.println("height of the month drp is:"+d.getHeight()+"width of the month drop is:"+d.getWidth());
		//fetch login button tagname
		String t=driver.findElement(By.id("loginbutton")).getTagName();
				System.out.println("tagname of login button is:"+t);
		
	}

}
