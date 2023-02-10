package loki;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver test = new ChromeDriver();
		test.manage().window().maximize();
		test.get("https://www.zomato.com/");
		Thread.sleep(2000);
	//	WebElement textfield = test.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
	//WebElement textfieldd = test.findElement(By.xpath("(//img[@class='high-res-image'])[2]"));
		WebElement textfield = test.findElement(By.xpath("(//img[@class='high-res-image'])[1]"));
		// textfield.sendKeys("biryani");
		File file = textfield.getScreenshotAs(OutputType.FILE);// taking screenshot for specific element
		FileUtils.copyFile(file, new File("D:\\\\ss\\\\ele.png"));
		
		
		
		/*  TakesScreenshot ts=(TakesScreenshot) test; 
		  //this takes screenshot of visible in the screen 
		 File src = ts.getScreenshotAs(OutputType.FILE); 
		 File dest = new File("D:\\ss\\yt.png");
		 // File dest = new File("D:\\ss\\yt.jpeg");
		   FileUtils.copyFile(src, dest);
		 */

	}

}
