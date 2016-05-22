import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class Example1 {

	public static void main(String[] args) {
		
//System.out.println("Hello Java");

WebDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com/Login#identifier");
//driver.close();

driver.findElement(By.id("Email")).sendKeys("prasen.gope@gmail.com");
driver.findElement(By.id("next")).click();

driver.findElement(By.name("Passwd")).sendKeys("1L0veY0u");
driver.findElement(By.id("signIn")).click();
driver.getTitle();
//thread.sleep(1000);
//driver.quit();
System.out.println("The Title is -------" +driver.getTitle());
System.out.println("The Current URL is-----------" + driver.getCurrentUrl());
	}
}
