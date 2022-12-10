package pkg1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exam {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void locator()
	{
		driver.get("https://www.wappalyzer.com/");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"input-1735\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"input-1735\"]")).sendKeys("Java");
	}
}
