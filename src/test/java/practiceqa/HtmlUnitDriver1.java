import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HtmlUnitDriver1 {

	public static void main(String[] args) {
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.google.com");
		
		/*driver.findElement(By.id("Email")).sendKeys("prasen.gope@gmail.com");
		driver.findElement(By.id("next")).click();

		driver.findElement(By.name("Passwd")).sendKeys("1L0veY0u");
		driver.findElement(By.id("signIn")).click();*/
		
		System.out.println("The Title is -------" +driver.getTitle());
		System.out.println("The Current URL is-----------" + driver.getCurrentUrl());
		driver.quit();
	}
}