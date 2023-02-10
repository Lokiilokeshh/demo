package loki;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vzone {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vzone.vmokshagroup.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("inputUsername")).sendKeys("Lokesh.kumar@vmokshagroup.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Power@1234");
		driver.findElement(By.id("btnSignIn")).click();
		WebElement ele = driver.findElement(By.xpath("(//a[@class='dropdown-toggle vm-dummy-trunk8 dummy-tooltip'])[3]"));
		Actions act = new Actions(driver);
		// driver.findElement(By.xpath("(//b[@class='caret'])[3]")).click();
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle vm-dummy-trunk8 dummy-tooltip'])[3]")).click();
		driver.findElement(By.xpath("(//a[@class='vm-dummy-trunk8 dummy-tooltip'])[17]")).click();
		Actions act1 = new Actions(driver);
		// act1.moveToElement(driver.findElement(By.id("txtMyTaskTitle"))).click().keyDown(Keys.SHIFT).sendKeys("munch
		// n give");
		act1.moveToElement(driver.findElement(By.xpath("(//input[@class='form-control required'])[1]"))).click().sendKeys("munchngive").build().perform();

		// driver.findElement(By.id("txtMyTaskTitle")).sendKeys("munch magic");

		// driver.findElement(By.id("txtMyTaskDescription")).sendKeys("to be displayed");
		// driver.findElement(By.id("txtMyTaskEffort")).sendKeys("8");

		// driver.findElement(By.xpath("(//div[@class='controls']
		// //input[@type='text'])[2]")).sendKeys("munch magic");
	}

}
