package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[contains(@data-testid, 'to-testID-origin')]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'BLR')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(), 'MAA')]")).click();
		driver.findElement(By.cssSelector(
				".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu"))
				.click();
		driver.findElement(By.xpath("//div[contains(@data-testid, 'home-page-travellers')]")).click();
		for (int i = 0; i <= 3; i++) {
			driver.findElement(By.xpath("//div[contains(@data-testid, 'Adult-testID-plus-one-cta')]")).click();
		}
		driver.findElement(By.xpath("//div[contains(@data-testid, 'home-page-travellers-done-cta')]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Currency')]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'USD')]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Family & Friends')]")).click();
		driver.findElement(By.xpath("//div[contains(@data-testid, 'home-page-flight-cta')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[local-name()='rect'][@rx='10%']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(
				".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73"))
				.click();
	}

}
