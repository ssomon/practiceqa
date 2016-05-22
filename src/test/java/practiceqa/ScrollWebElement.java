import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class ScrollWebElement {

	public static void main(String[] args) throws InterruptedException {
	
		//FirefoxProfile profile = new FirefoxProfile();
		//profile.setEnableNativeEvents(true);
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.navigate().to("http://jqueryui.com/draggable/#scroll");
		
		Thread.sleep(600L);
		
		
		WebElement element = driver.findElement(By.xpath("//*[@id='draggable']"));
		
		Actions actn = new Actions(driver);
		
		actn.dragAndDropBy(element, 500, 100).build().perform();
	
	}

}
