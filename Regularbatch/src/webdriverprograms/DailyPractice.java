package webdriverprograms;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DailyPractice {

	public static void main(String[] args) throws InterruptedException {
		//set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//open th ebrowser
		//interface refvar=new implemnting class();
		WebDriver driver=new ChromeDriver();
		//maximize the window
driver.manage().window().maximize();
//add implicit wait
 driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
 //open url
 driver.navigate().to("https://www.linkedin.com/");
 //fetch the title
String t=driver.getTitle();
System.out.println("page title is:"+t);
 //fetch the absurl
String absurl=driver.getCurrentUrl();
System.out.println("current page absolute url is:"+absurl);
 //fetch the page source
String Src=driver.getPageSource();
 //fetch th ewindow id
String pid=driver.getWindowHandle();
System.out.println("current page winow id is:"+pid);
//fetch the tool tip
//String tp=driver.findElement(By.xpath("//div[@id='blueBarDOMInspector']/div/div/div/div/h1/a")).getAttribute("title");
//System.out.println("tooltip is:"+tp);
//add explicit wait
//WebDriverWait wait=new WebDriverWait(driver,20);
//wait.until(ExpectedConditions.titleIs("Facebook - Log In or Sign Up"));
//fetch the text;
String txt=driver.findElement(By.xpath("//form[@id='regForm']/h2")).getText();
System.out.println("text is:"+txt);
String txt1=driver.findElement(By.xpath("//form[@id='regForm']/h3")).getText();
System.out.println("text is:"+txt1);
String txt2=driver.findElement(By.xpath("//form[@id='regForm']/span")).getText();
System.out.println("text is:"+txt2);
WebElement email_editbox=driver.findElement(By.id("login-email"));
if(email_editbox.isDisplayed()){
	email_editbox.sendKeys("abc");
}else{
	System.out.println("emailedit box is not present");
}
WebElement pass_editbox=driver.findElement(By.id("login-password"));
if(pass_editbox.isDisplayed()){
	pass_editbox.sendKeys("abc");
}else{
	System.out.println("password edit box is not present");
}
WebElement sign_button=driver.findElement(By.id("login-submit"));
if(sign_button.isEnabled()){
	sign_button.click();
	
}


String txt3=driver.findElement(By.xpath("//div[@class='meter']/form/h3")).getText();
System.out.println("text is:"+txt3);
Point p=driver.findElement(By.id("login-password")).getLocation();
System.out.println("x value is:"+p.getX()+"y value is:"+p.y);
Dimension d=driver.findElement(By.id("login-password")).getSize();
System.out.println("height is:"+d.getHeight()+"width is:"+d.getWidth());
//fetch the tagname of the given attribute
String tag=driver.findElement(By.id("login-password")).getTagName();
System.out.println("tagname of given attribut is:"+tag);
String tag1=driver.findElement(By.linkText("Forgot password?")).getTagName();
System.out.println(tag1);
//get attribute value for the given attribute
String val=driver.findElement(By.id("login-email")).getAttribute("name");
System.out.println(val);
//fetch the css value
String fw=driver.findElement(By.id("login-password")).getCssValue("font-weight");
System.out.println(fw);




























	}

}
