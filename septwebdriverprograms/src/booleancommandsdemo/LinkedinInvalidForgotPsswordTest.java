package booleancommandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedinInvalidForgotPsswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				//set the chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		              
				//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//open the url
				driver.get("https://www.linkedin.com/");
				
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
				
					//2)click on Forgot password? link
				driver.findElement(By.linkText("Forgot password?")).click();
					//3)verify the next page title-Password Change | LinkedIn
				WebDriverWait wait=new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.titleContains("Password Change | LinkedIn"));
					//4)verify email or phone editbox is displayed or not
				WebElement email_editbox=driver.findElement(By.id("userName-requestPasswordReset"));
				
					//5)check whether submit button is enabled or not?
				WebElement submit_btn=driver.findElement(By.id("btnSubmitResetRequest"));
				if(email_editbox.isDisplayed()&&submit_btn.isEnabled()){
					System.out.println("email edit box is present in the page");
					System.out.println("submit button is enabled");
				}
					//6)type the invalid data in email editbox
				email_editbox.sendKeys("fsfsfffffffff");
				
					//7)click on submit button.
				submit_btn.click();
	}else{
		System.out.println();
		
					//8)fetch the global error message
					//9)fetch the specific email editbox error message
	}
	}
	
	}


