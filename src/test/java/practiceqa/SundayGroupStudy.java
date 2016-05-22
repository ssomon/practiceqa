import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.SelectFrame;


public class SundayGroupStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com");
		
		WebElement SearchBox = driver.findElement(By.id("gh-ac"));
		SearchBox.sendKeys("Nike shoes");
	
		Select dropdown = new Select (driver.findElement(By.xpath("//*[@id='gh-cat']")));
		dropdown.selectByIndex(4);
		
		WebElement SearchButton = driver.findElement(By.id("gh-btn"));
		SearchButton.click();
		
	}
}
