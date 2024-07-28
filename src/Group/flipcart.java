package Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		// By ID
		driver.findElement(By.cssSelector("#container"));
		driver.findElement(By.cssSelector("#email"));

		// By Class
		driver.findElement(By.cssSelector(".LM6RPg"));
		driver.findElement(By.cssSelector(".vh79eN"));

		// By Attribute
		driver.findElement(By.cssSelector("input[type='text']"));
		driver.findElement(By.cssSelector("button[type='submit']"));

		// By Class and Attribute
		driver.findElement(By.cssSelector(".LM6RPg[type='text']"));
		driver.findElement(By.cssSelector(".vh79eN[type='password']"));

		// By Pseudo-Class
		driver.findElement(By.cssSelector("a:hover"));
		driver.findElement(By.cssSelector("button:focus"));

		// By Contains
		driver.findElement(By.cssSelector("input[class*='LM6RPg']"));
		driver.findElement(By.cssSelector("button[class*='vh79eN']"));

		// By Starts-With
		driver.findElement(By.cssSelector("input[class^='LM6RPg']"));
		driver.findElement(By.cssSelector("button[class^='vh79eN']"));

		// By Ends-With
		driver.findElement(By.cssSelector("input[class$='LM6RPg']"));
		driver.findElement(By.cssSelector("button[class$='vh79eN']"));

		// By Sibling
		driver.findElement(By.cssSelector(".LM6RPg + .vh79eN"));
		driver.findElement(By.cssSelector(".vh79eN + .LM6RPg"));

		// By Child
		driver.findElement(By.cssSelector("div > input"));
		driver.findElement(By.cssSelector("div > button"));

		// By Descendant
		driver.findElement(By.cssSelector("div input"));
		driver.findElement(By.cssSelector("div button"));

		// By Grouping
		driver.findElement(By.cssSelector("input, button"));
		driver.findElement(By.cssSelector("div, span"));

	}

}
