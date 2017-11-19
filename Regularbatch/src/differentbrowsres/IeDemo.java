package differentbrowsres;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeDemo {

	public static void main(String[] args) {
		// set the internet explorer driver path
				System.setProperty("webdriver.ie.driver", "C:\\NEERAJA\\IEDriverServer_x64_3.4.0(1)\\IEDriverserver.exe");
				// launch the browser
				// interface refvar=new implementing class();
				WebDriver driver = new InternetExplorerDriver();
				// maximize the window
				driver.manage().window().maximize();
				// add implict wait
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
				// open url
				driver.navigate().to("https://www.google.com/search?q=google&oq=google++++&aqs=chrome..69i57j69i60l3j0l2.6228j0j4&sourceid=chrome&ie=UTF-8");
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
	}

}
