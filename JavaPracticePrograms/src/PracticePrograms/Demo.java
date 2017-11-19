package PracticePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
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
		driver.get("http://linkedin.com");
		//fetch the text
		String txt=driver.findElement(By.xpath("//*[@id='regForm']/span")).getText();
		System.out.println("text is:"+txt);
		//fetch the src value of an image
		String val=driver.findElement(By.xpath("//*[@id='layout-main']/div/div[1]/div/h1/img")).getAttribute("src");
System.out.println("image src value is:"+val);
// fetch the forgootten url link
String url=driver.findElement(By.linkText("Forgot password?")).getAttribute("href");
System.out.println("url of the forgotten account link is:"+url);
//tagname of the eleemt
String tag=driver.findElement(By.id("login-password")).getTagName();
System.out.println("login editbox tagname is:"+tag);
//get the height and width of the element
Dimension d=driver.findElement(By.id("login-password")).getSize();
System.out.println("height of login password edit box is:"+d.getHeight()+"width of login password edit box is:"+d.getWidth());

// get the  first name element postion
Point p=driver.findElement(By.id("reg-firstname")).getLocation();
System.out.println("x value is:"+p.getX()+"y value is:"+p.getY());
//fetch the color of the sign in button
String clr=driver.findElement(By.id("login-submit")).getCssValue("color");
System.out.println("color of sign in button is:"+clr);

String fs=driver.findElement(By.id("login-submit")).getCssValue("font-size");
System.out.println("font-size of sign in button is:"+fs);



	}
	
	
	

}
