package com.jbk;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerExampleforDemo.class)
public class TestCases 
{
	
@Test      //////failed
public void verifyequal()
{
	Assert.assertEquals(23, 56);
	
}



@Test       ////////passed---->correct
public void check()
{
	Assert.assertEquals(15, 15);
	
}

@Test(dependsOnMethods="verifyequal")
///test case execution depends on passing or failure of verifyequal
public void temp()
{
	System.out.println("dependant case");
}

}