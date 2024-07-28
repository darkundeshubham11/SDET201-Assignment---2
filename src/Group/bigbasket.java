package Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bigbasket {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.findElement(By.xpath("//input[contains(@id, 'input')]"));
		driver.findElement(By.xpath("//button[contains(@class, 'btn')]"));
		driver.findElement(By.xpath("//a[contains(@href, 'offers')]"));
		driver.findElement(By.xpath("//img[contains(@src, 'logo')]"));
		driver.findElement(By.xpath("//div[contains(@class, 'header')]"));
	}

}
