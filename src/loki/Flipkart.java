package loki;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		 Actions act= new Actions(driver);
		 act.moveToElement(ele).perform();
		 System.out.println(ele);
		driver.findElement(By.xpath("//div[@class='_3XS_gI']/a[2]")).click();
		driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[1]")).click();
		driver.quit();
		//driver.findElement(By.xpath("//button[.='BUY NOW']")).click();
		 
		//act.moveToElement(eleme).click().perform();
		//String brand = driver.findElement(By.xpath("(//div[@class='aMaAEs']/div[1]//span)[1]")).getText();
		//System.out.println(brand);
		//Robot r=new Robot();
		//act.doubleClick(hash).perform();
		
		
/*	r.keyPress(KeyEvent.VK_RIGHT);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    

String ParentWindow = driver.getWindowHandle();
	    System.out.println(ParentWindow);
	    Set<String> alltabs=driver.getWindowHandles();
	    System.out.println(alltabs);
	   
	    for (String string : alltabs) {
	    	if(ParentWindow.equals(alltabs))
	    	{
	    		
	    	//	driver.switchTo().window(ParentWindow);
	     driver.close();*/
		
	    
	//  driver.findElement(By.xpath("(//a[@class='IRpwTa'])[2]")).click();
	    
		 
		
		




	}
	    	
	    
	}

