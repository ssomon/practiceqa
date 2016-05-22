import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;


public class NewFirefoxProfile {
//	@Test
	public static void main(String[] args) {
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profile = allProfiles.getProfile("JavaLearning");
		
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.gmail.com");
		System.out.println("Ttile is -----" +driver.getTitle());
		System.out.println("Current URL is-----" +driver.getCurrentUrl());
		System.out.println("Page source is---------");
		//System.out.println(driver.getPageSource());
	}

}
