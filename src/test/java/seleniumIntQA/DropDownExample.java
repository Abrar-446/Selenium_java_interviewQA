package seleniumIntQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDownExample {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle= driver.findElement(By.xpath("//select[@id='input-country']"));
		
		Select drpCountry =new Select(drpCountryEle);
		
		//drpCountry.selectByIndex(13); //Australia
		//drpCountry.selectByValue("10"); //Argentina
		//drpCountry.selectByVisibleText("Denmark");
		
		List<WebElement> allOptions=drpCountry.getOptions();
		
		for(WebElement option:allOptions) {
			
			if(option.getText().equals("Denmark")) {
				option.click();
				break;
			}
		}
		
		
		
		
		
		

	}

}
