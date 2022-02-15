package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).isSelected());

		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();

//		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("$(arguments[0]).mouseout()", element);

//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[contains(@data-testid, 'home-page-travellers')]")).click();
//		Thread.sleep(2000);
//		int i = 1;
//		while(i<5) {
//			driver.findElement(By.xpath("//div[contains(@data-testid, 'Adult-testID-plus-one-cta')]")).click();
//			i++;
//		}
//		System.out.println(driver.findElement(By.xpath("//div[contains(@data-testid, 'home-page-travellers')]")).getText());
//		for(int i=1; i<5; i++) {
//			driver.findElement(By.xpath("//div[contains(@data-testid, 'Adult-testID-plus-one-cta')]")).click();
//		}
//		driver.findElement(By.xpath("//div[contains(@data-testid, 'home-page-travellers-done-cta')]")).click();
//		System.out.println(driver.findElement(By.xpath("//div[contains(@data-testid, 'home-page-travellers')]")).getText());
	}

}
