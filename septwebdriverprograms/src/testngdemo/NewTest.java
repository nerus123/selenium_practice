package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("executing @Test annoatation");
		
	  
  }
  @Test
  public void gh() {
	  System.out.println("executing @Test annoatation");
		
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("executing @BeforeMethod annoatation");
		
  }
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("executing @AfterMethod annoatation");
		
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("executing @beforeClass annoatation");
		
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("executing @AfterClass annoatation");
		
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("executing @BeforeTest annoatation");
		
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("executing @AfterTest annoatation");
		
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("executing @BeforeSuite annoatation");
		
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("executing @AfterSuite annoatation");
		
  }

}
