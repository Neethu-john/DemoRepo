package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	SoftAssert softAssert=new SoftAssert();
	
  @Test(priority=1)
  public void homeTest() {
	  
	  System.out.println("I'm in homeTest ");
	  System.out.println("before assertion");
	  Assert.assertTrue(4>3, "verfying element");
	  System.out.println("After assertion");
	  Assert.assertEquals("abc", "abc");
  }
  
 @Test(priority=2,dependsOnMethods="homeTest",groups= {"smoke","sanity"})
public void mainTest() {
	  
	  System.out.println("I'm in mainTest ");
	  System.out.println("before assertion");
	  softAssert.assertTrue(2>3, "verfying element");
	  System.out.println("After assertion");
	  softAssert.assertAll();  // this is same as the error collector in juint
	  
 }
 
 @Test(priority=3,dependsOnMethods="mainTest",groups= {"neethu"})
public void endTest() {
	  
	  System.out.println("I'm in endTest ");
	  System.out.println("before assertion");
	  softAssert.assertTrue(2>3, "verfying element");
	  System.out.println("After assertion");
	  softAssert.assertEquals("abc", "abc");
	  System.out.println("After second  assertion");
	  softAssert.assertAll();  // this is same as the error collector in jun it
	  

 }
}