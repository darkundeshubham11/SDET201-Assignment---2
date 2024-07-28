package Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.findElement(By.xpath("//a[text()='Sign in']"));
		driver.findElement(By.xpath("//a[text()='Daily Deals']"));
		driver.findElement(By.xpath("//a[text()='Help & Contact']"));
		driver.findElement(By.xpath("//a[text()='Sell']"));
		driver.findElement(By.xpath("//a[text()='Watchlist']"));
	}

}
