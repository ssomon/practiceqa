package practiceqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class test_googleaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.get("https://accounts.google.com/SignUp?hl=en");
		
		WebElement firstname = driver1.findElement(By.xpath("//*[@id='firstname-label']/*[@id='FirstName']/*[@name='FirstName']"));
		firstname.sendKeys("test");
		
		WebElement lastname = driver1.findElement(By.xpath("//*[@id='LastName']"));
		lastname.sendKeys("user1");
		
		//WebElement birthmonth = driver1.findElement(By.xpath("//*[@id='BirthMonth']/div"));
		//birthmonth.sendKeys("June");
		
		Select birthdaymonth = new Select(driver1.findElement(By.xpath("//*[@id='BirthMonth']/div")));
		birthdaymonth.selectByVisibleText("June");
		
	
		
		//driver1.close();
		driver1.quit();
	}

}
