package loki;

/*import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vzoneee {


	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	
	
		
	//	String[] box= {"Title","Description","Effort"};
		driver.get("https://vzone.vmokshagroup.com");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Lokesh.kumar@vmokshagroup.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Power@1234");
		driver.findElement(By.id("btnSignIn")).click();

		WebElement ele = driver.findElement(By.xpath("(//a[@class='dropdown-toggle vm-dummy-trunk8 dummy-tooltip'])[3]"));

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
		driver.findElement(By.xpath("(//a[@class='vm-dummy-trunk8 dummy-tooltip'])[17]")).click();
  
		//WebElement mat = driver.findElement(By.id("txtMyTaskTitle"));
		 //Actions sct=new Actions(driver);
		 //sct.moveToElement(mat).click().sendKeys("tt").perform();
		// title
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	w.until(ExpectedConditions.elementToBeClickable((By.id("txtMyTaskTitle")))).click();
	
	
         
		// description
	//	w.until(ExpectedConditions.elementToBeClickable((By.id("txtMyTaskDescription")))).sendKeys("hello");
		
		// driver.findElement(By.id("txtMyTaskDescription")).sendKeys("munch magic");
         //  driver.findElement(By.id("txtDate_Compoff")).click();
         //  DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
           
         
           
	}



		
		
	}*/
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vzoneee {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);
		formatter = new SimpleDateFormat("ddMMMM");
		strDate = formatter.format(date);
//LocalDate currentdate = LocalDate.now();
//Month currentMonth = currentdate.getMonth();
//int currentDay = currentdate.getDayOfMonth();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// String[] box= {"Title","Description","Effort"};
		driver.get("https://vzone.vmokshagroup.com");

		driver.findElement(By.id("inputUsername")).sendKeys("Lokesh.kumar@vmokshagroup.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Power@1234");
		driver.findElement(By.id("btnSignIn")).click();

		WebElement ele = driver
				.findElement(By.xpath("(//a[@class='dropdown-toggle vm-dummy-trunk8 dummy-tooltip'])[3]"));

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
		driver.findElement(By.xpath("(//a[@class='vm-dummy-trunk8 dummy-tooltip'])[17]")).click();

//WebElement mat = driver.findElement(By.id("txtMyTaskTitle"));
//Actions sct=new Actions(driver);
//sct.moveToElement(mat).click().sendKeys("tt").perform();
// title
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txtMyTaskTitle"))));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("document.getElementById('txtMyTaskTitle').value='Selenium'");
////w.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtMyTaskTitle"))).sendKeys("txtMyTaskTitle");
		j.executeScript("document.getElementById('txtMyTaskDescription').value='hello'");
		//j.executeScript("document.getElementById('j.executeScript(').value
//w.until(ExpectedConditions.elementToBeClickable((By.id("txtMyTaskTitle")))).sendKeys("hello");

// description
///w.until(ExpectedConditions.elementToBeClickable(By.id("txtMyTaskDescription"))).sendKeys("munch magic");
		//driver.findElement(By.id("txtMyTaskDescription")).sendKeys("munch magic");
		//;

		driver.findElement(By.id("txtMyTaskEffort")).sendKeys("8");
		// j.executeScript("arguments[0].click();",
		// driver.findElement(By.xpath("//div[@id='s2id_cbo_Project']/a/span")));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='s2id_cbo_Project']/a/span"))).sendKeys("trainin");
		/*
		 * List<WebElement> projects = driver.findElements(By.
		 * xpath("//div[@class='select2-drop select2-with-searchbox select2-drop-active']/ul/li//span"
		 * )); for (WebElement webElement : projects) { String
		 * result=webElement.getText(); System.out.println(result); if
		 * (result.equals("Admin - Operations")) { //webElement.click();
		 * System.out.println(result); } else { System.out.println("next step"); } }
		 */
		WebElement sys = driver.findElement(
				By.xpath("(//div[@class='select2-drop select2-with-searchbox select2-drop-active']/ul/li//span)[1]"));
		System.out.println(sys.getText());
		act.moveToElement(driver.findElement(
				By.xpath("(//div[@class='select2-drop select2-with-searchbox select2-drop-active']/ul/li//span)[1]")))
				.click().perform();
		driver.findElement(By.xpath("//div[@id='Fromdate']/input")).click();
		WebElement month = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table/thead/tr/th)[2]"));
		String result = month.getText();
		String Month = strDate.toUpperCase().substring(2, strDate.length());
		System.out.println(strDate);
		System.out.println(month);
		result = result.toUpperCase().substring(0, result.length() - 4);
		System.out.println(result);
		String date1 = strDate.substring(0, 2);
		int date11 = Integer.parseInt(date1);
		// if (result.equals(strDate)) {
		List<WebElement> dates = driver
				.findElements(By.xpath("(//div[@class='datepicker-days']/table/thead/tr/th)[2]/../../../tbody/tr/td"));
		for (WebElement webElement : dates) {
			String name = webElement.getText();
			int i = Integer.parseInt(name);
			if (i == date11) {
				webElement.click();
			}

		}
//}

	}

}
