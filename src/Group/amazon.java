package Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("(//a[@class='nav-a'])[1]"));
		driver.findElement(By.xpath("(//a[@class='nav-a'])[2]"));
		driver.findElement(By.xpath("(//a[@class='nav-a'])[3]"));
		driver.findElement(By.xpath("(//a[@class='nav-a'])[4]"));
		driver.findElement(By.xpath("(//a[@class='nav-a'])[5]"));

	}

}
