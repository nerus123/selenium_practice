package testng;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups={"Smoke","Functional"})
  public void smokeTest1() {
	  System.out.println(" smoke one");
  }
}
