package loki;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuti {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);

		/*
		 * Robot r= new Robot(); r.keyPress(KeyEvent.VK_DOWN);
		 * r.keyRelease(KeyEvent.VK_DOWN);
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		// driver.findElement(By.id("promptBox")).click();
		// Robot r= new Robot();
		// r.keyPress(KeyEvent.VK_DOWN);
	}

}
