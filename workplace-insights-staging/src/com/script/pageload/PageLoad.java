package com.script.pageload;





import java.time.Duration;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoad {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		long start,finish,total_time;
		start=System.currentTimeMillis();
		driver.get("https://workplace-insights-staging.azurewebsites.net/");
		 finish=System.currentTimeMillis();
		 total_time =finish - start;
		System.out.println(total_time);

		StopWatch pageLoad = new StopWatch();
        pageLoad.start();
		 //WebDriverWait wait = new WebDriverWait(driver, 10);
        
        	
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_l")));

	        pageLoad.stop();
	        //Get the time
	        long pageLoadTime_ms = pageLoad.getTime();
	        long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
	        System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
	        System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
	        driver.close();
		
	}
	
}

