package Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com");

		driver.get("https://www.redbus.com");
		driver.findElement(By.xpath("//img[@class='home-redirect rdc-redbus-logo']")).click();
		driver.findElement(By.xpath("//input[@id='src']"));
		driver.findElement(By.xpath("//input[@id='dest']"));

		// By Attribute
		driver.findElement(By.xpath("//button[@id='search_btn']"));
		driver.findElement(By.xpath("//input[@id='txtReturnCalendar']"));

		// By Text
		driver.findElement(By.xpath("//a[text()='Bus Hire']"));
		driver.findElement(By.xpath("//a[text()='Help']"));

		// By Contains
		driver.findElement(By.xpath("//input[contains(@class, 'db')]"));
		driver.findElement(By.xpath("//button[contains(@id, 'search_btn')]"));

		// By Starts-With
		driver.findElement(By.xpath("//input[starts-with(@id, 'txtOnward')]"));
		driver.findElement(By.xpath("//input[starts-with(@id, 'txtReturn')]"));

		// By Multiple Attributes
		driver.findElement(By.xpath("//input[@id='src' and @name='source']"));
		driver.findElement(By.xpath("//input[@id='dest' and @name='destination']"));

		// By Position
		driver.findElement(By.xpath("(//input[@class='db'])[1]"));
		driver.findElement(By.xpath("(//input[@class='db'])[2]"));

		// By Ancestor
		driver.findElement(By.xpath("//div[@id='search']/ancestor::div"));
		driver.findElement(By.xpath("//input[@id='src']/ancestor::div"));

		// By Following-Sibling
		driver.findElement(By.xpath("//input[@id='src']/following-sibling::input"));
		driver.findElement(By.xpath("//input[@id='dest']/following-sibling::input"));
		// Close the driver
		driver.quit();
	}
}
