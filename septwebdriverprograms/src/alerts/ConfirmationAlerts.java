package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
              
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		//click on confirmation button
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		//handle the alert
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//quit the browser
		driver.quit();
		

	}

}
