package com.script.click;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class VivaInsightHeaderClick {


	public static void main(String[] args) throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://workplace-insights-staging.azurewebsites.net/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Header Click");
		System.out.println("Microsoft logo click");
		driver.findElement(By.className("c-image")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		System.out.println("Microsoft 365 clik");
		driver.findElement(By.id("uhfCatLogo")).click();
		Thread.sleep(2000);
		
		System.out.println("Products Click");
		driver.findElement(By.id("c-shellmenu_0")).click();
		Thread.sleep(2000);
		
		System.out.println("Product & Pricing Click");
		driver.findElement(By.id("c-shellmenu_36")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		System.out.println("Industry Click");
		driver.findElement(By.id("c-shellmenu_37")).click();
		Thread.sleep(2000);
		
		System.out.println("Resource Click");
		driver.findElement(By.id("c-shellmenu_43")).click();
		Thread.sleep(2000);
		
		System.out.println("Support Click");
		driver.findElement(By.id("c-shellmenu_52")).click();
		Thread.sleep(2000);
		
		System.out.println("Blog CLick");
		driver.findElement(By.id("c-shellmenu_73")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		System.out.println("All Microsoft Click");
		driver.findElement(By.xpath("//*[@id=\"uhf-c-nav\"]/ul/li/div/button/span")).click();
		Thread.sleep(2000);
		
		System.out.println("Search box click");
		driver.findElement(By.id("search")).click();
		Thread.sleep(2000);
		
		System.out.println("Search box cancel button click");
		driver.findElement(By.id("cancel-search")).click();
		Thread.sleep(2000);
		
		System.out.println("Account logo click");
		driver.findElement(By.xpath("//*[@id=\"meControl\"]/div/div")).click();
		Thread.sleep(2000);
		System.out.println("Done with header testing");
		
	}

}
