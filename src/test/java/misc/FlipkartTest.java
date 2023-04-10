package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		
		Thread.sleep(1000);
		
		WebElement  mensmenu=driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		mensmenu.click();
		
		
		
		

	}

}
