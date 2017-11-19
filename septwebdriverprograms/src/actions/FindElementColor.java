package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElementColor {
  // static String baseUrl="http://newtours.demoaut.com/";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///set the chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
					              
							//launch the browser
							WebDriver driver=new ChromeDriver();
					
					  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
							
							//launch the browser
							//WebDriver driver=new FirefoxDriver();
							
							//maximise the window
							driver.manage().window().maximize();
							
							//open the url
							driver.get("http://newtours.demoaut.com/");
							
							//identify the home
							WebElement link_home=driver.findElement(By.linkText("Home"));
							
							//fetch the background color of the home link before mouse over
							String clr=link_home.getCssValue("color");
							System.out.println("before mouse over home lik color is:"+clr);
							
							//identify the home background
							WebElement td_home=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
							String bck_clr=td_home.getCssValue("background-color");
							System.out.println("before mouseover background colour is:"+bck_clr);
							
							//create an object for Actins class
							Actions act=new Actions(driver);
							
                         act.moveToElement(link_home).perform();
                         
                         String mouseover=link_home.getCssValue("color");
                         System.out.println("after mouse over on home link is:"+mouseover);
                         
                         
                         String mouseoverbackground=td_home.getCssValue("background-color");
                         System.out.println(mouseoverbackground);
	}

}
