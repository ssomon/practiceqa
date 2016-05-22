import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CSSAttributes {
@Test
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com");
		
		//to get all the attributes of the text from the web, I put this in the variable named “text” identified by its xpath 
		WebElement text = driver.findElement(By.xpath("//*[@id='main-nav']/li[1]/a/span"));
		
		//for font-size, use the keyword "font-size"
		System.out.println (text.getCssValue("font-size"));
		
		//for font-color, use the word "color" and the output is string value
		String FontColor = text.getCssValue("color");
		System.out.println("The color of the font is " + FontColor);
		
		//for font type, it's font-family
		String FontType = text.getCssValue("font-family");
		System.out.println("The font type is " + FontType);
		
		//for background color
		String backgroundColor = text.getCssValue("background-color");
		System.out.println ("The background color is " + backgroundColor);
	}

}
