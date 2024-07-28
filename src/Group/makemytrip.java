package Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		// Multiple Attributes
		driver.findElement(By.xpath(
				"//a[@class='primaryBtn font24 latoBold widgetSearchBtn ' and @data-cy='searchWidgetWidgetSearchButton']"));
		driver.findElement(By.xpath("//li[@class='selected' and @data-cy='roundTrip']"));
		driver.findElement(By.xpath("//input[@id='fromCity' and @placeholder='From']"));
		driver.findElement(By.xpath("//input[@id='toCity' and @placeholder='To']"));
		driver.findElement(By.xpath("//div[@class='datePickerContainer' and @data-cy='departure']"));

	}

}
