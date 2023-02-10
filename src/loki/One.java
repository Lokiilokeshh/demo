package loki;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");

		driver.findElement(By.xpath("(//tp-yt-paper-button[@id='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("lokesh.kumar@vmokshagroup.com");
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lokesh@1234");
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		Thread.sleep(2000);
		String tit = driver.getTitle();
		System.out.print(tit);

		driver.navigate().refresh();
		// driver.quit();

		/*
		 * Alert ale = driver.switchTo().alert(); ale.accept(); ale.dismiss();
		 * ale.getText();
		 */

		/*
		 * ChromeOptions opt = new ChromeOptions();
		 * opt.addArguments("disable notifications");
		 */

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("D-beats");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		// WebElement cli =
		driver.findElement(By.xpath("(//div[@id='subscribe-button'])[4]//tp-yt-paper-button")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("D:\\ss\\subs.jpeg");
		FileUtils.copyFile(src, dst);
		// driver.findElement(By.id("info")).click();

		/*
		 * Thread.sleep(1000); Actions act=new Actions(driver);
		 * 
		 * act.moveToElement(cli).perform();
		 */

		// driver.findElement(By.xpath("(//a[@id='video-title']/yt-formatted-string)[1]")).click();
		// driver.findElement(By.xpath("//tp-yt-paper-button[@id='button']")).click();
		// driver.findElement(By.xpath("(//paper-ripple[@class='style-scope
		// tp-yt-paper-button'])[1]")).click();

	}

}
