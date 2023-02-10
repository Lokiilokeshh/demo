package loki;

import java.util.concurrent.TimeUnit;

import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.devtools.CdpVersionFinder;

public class Maps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/search/dentist/@40.7159339,-73.9991705,14z/data=!4m7!2m6!3m5!2sNew+York,+NY+10002,+USA!3s0x89c25980805f939b:0x988ab4c5b9ea32ea!4m2!1d-73.9859414!2d40.7135097");

		WebElement ele = driver.findElement(By.xpath("//a[@aria-label='East Village Dental Center']"));
		Actions at = new Actions(driver);
		at.moveToElement(ele).build().perform();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,3000)");

	}

}
