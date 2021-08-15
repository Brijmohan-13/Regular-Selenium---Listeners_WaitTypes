package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes 
{
	public static void main(String[] args) 
	{
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/JBK/Selenium/Offline%20website/Offline%20website/Offline%20website/Offline%20website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);// timeout Exception
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// it will work on all webElements
		//NoSuchElementException
		
		WebDriverWait wait = new WebDriverWait(driver, 20);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		// ElementNOtVisible Exception
		
		
		Wait<WebDriver> w =new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS)// 10 pollings
				.ignoring(NoSuchElementException.class);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	}
}
