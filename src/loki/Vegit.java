package loki;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vegit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		String[] items = { "Cucumber", "Beetroot" };

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();

			List itemsneed = Arrays.asList(items);

			if (itemsneed.contains(items)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

			}

		}

	}
}
