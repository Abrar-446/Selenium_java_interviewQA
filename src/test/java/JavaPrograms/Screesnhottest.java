package JavaPrograms;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screesnhottest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abrara-c\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		getScreeshot("screenshot",driver);

	}
	
	public static void getScreeshot(String Folder, WebDriver driver) throws IOException {
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Screenshot\\test.png"));
		
	}
	
	public static String getTimeStamp() {
		
		SimpleDateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss"); 
		String timestamp=dateformat.format(Calendar.getInstance().getTime());
		return timestamp;
		
	}

}
