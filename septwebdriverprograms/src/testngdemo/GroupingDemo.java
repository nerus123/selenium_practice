package testngdemo;

import org.testng.annotations.Test;

public class GroupingDemo {
  @Test(groups={"Smoke","Functional"})
  public void smokeTest1() {
	  System.out.println("smoke test1");
  }
  @Test(groups={"Smoke","Functional"})
  public void smokeTest2() {
	  System.out.println("smoke test2");
  }
  @Test(groups={"Regression","Functional"})
  public void regressionTest1() {
	  System.out.println("Regression test1");
  }
  @Test(groups={"Regression","Functional"})
  public void regressionTest2() {
	  System.out.println("Regression test2");
  }
  @Test(groups={"Regression","Sanity","Functional"})
  public void sanityTest1() {
	  System.out.println("Sanity test1");
  }
}
