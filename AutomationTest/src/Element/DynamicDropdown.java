package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[contains(@data-testid, 'to-testID-origin')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'KQH')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'AMD')]")).click();
		
	}

}
