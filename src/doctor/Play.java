package doctor;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Play extends Generic {
	@Test
	public void login() throws AWTException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='nav-link page-scroll hidesidebar']")).click();
		driver.findElement(By.id("email")).sendKeys("testravindra1234@gmail.com");
		driver.findElement(By.id("password")).sendKeys("vmoksha123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//div[@class='card-body col-md-9 py-2'])[1]")).click();
		WebElement ele = driver.findElement(By.xpath("(//p[@class='card-text uppercase pl-4 small'])[1]"));
		ele.click();

	}
}
