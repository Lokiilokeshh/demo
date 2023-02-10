package loki;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		 List<WebElement> bannerLinks = driver.findElements(By.xpath("//a"));
		for(WebElement link:bannerLinks){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
			} 
		 //WebElement ele = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
		 //Dimension sus = ele.getSize();/*//div[@class='eFQ30H']/a*/
		 //System.out.print(sus);
		 
		 

	}

}
