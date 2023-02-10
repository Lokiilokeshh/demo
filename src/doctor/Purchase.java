package doctor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Purchase extends Generic
{
	@Test
	public void purchase()
	{
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[@class='nav-link page-scroll hidesidebar']")).click();
		  driver.findElement(By.id("email")).sendKeys("testravindra1234@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("vmoksha123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  for(int i=0;i<3;i++)
		  {
			  js.executeScript("window.scrollBy(0,500)");
			  
		  }
	}

}
