package loki;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dr {
//private static final int priority = 0;
	public WebDriver driver;

	@BeforeMethod
	public void open() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://onlinetraining.usbiomag.com/");
	}

	
	  @Test
	  public void login() throws AWTException 
	  {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[@class='nav-link page-scroll hidesidebar']")).click();
	  driver.findElement(By.id("email")).sendKeys("testravindra1234@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("vmoksha123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  driver.findElement(By.xpath("(//div[@class='card-body col-md-9 py-2'])[1]")).click(); 
	 WebElement ele = driver.findElement(By.xpath("(//p[@class='card-text uppercase pl-4 small'])[1]"));
	 ele.click();
	// driver.findElement(By.xpath("//h6[text()='Building Blocks of
	// Biomagnetism']")).click();
	// Actions act = new Actions(driver);
	// WebElement ele =
	// driver.findElement(By.xpath("(//div[@class='course-card-img-overlay'])[1]"));
	// act.click(ele).build().perform();

//Actions act = new Actions(driver);
//WebElement ele = driver.findElement(By.xpath("(//div[@class='card text-white border-0'])[1]//h6"));
	// Actions act = new Actions(driver);
	// act.moveToElement(ele).click().build().perform();

	/*
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript("window.scrollBy(0,200)");
	 */

	// driver.findElement(By.xpath("//a[@class='nav-link page-scroll']")).click();
}

	
	  /*@Test
	  public void course()
	  {
	  driver.findElement(By.xpath("//a[@class='nav-link page-scroll']")).click();
	  
	  */
	@Test(priority = 2)
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
		 
	
		
		
		

	@AfterMethod
	public void close() {

		driver.quit();
	}

}
