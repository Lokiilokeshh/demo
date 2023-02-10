package loki;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement drop = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input)[1]"));
		Select sel= new Select(drop);
	   List<WebElement> opt = sel.getOptions();
	   for(WebElement we:opt) {
		  String msg = we.getText();
		  System.out.println(msg);
		   
	   }
	
		
	//driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[3]")).click();
		//Thread.sleep(2000);

		
		// int i=1; while(i<3) {
		//  driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"
		// )).click(); i++;
		  
		//  }
		 
		//String englis = driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[3]"))
		//		.getText();
	//	System.out.println(englis);
		//for (int i = 0; i < 3; i++) {
	//		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	//	}
		//System.out.println(
		//		driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[3]")).getText());
		//driver.quit();
		
	

}
}

