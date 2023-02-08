import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg {
	
	@Test 
	
	public void testAssertFunctions() {
		//System.setProperty("webdriver.chrome.driver", "C:\\I2EWebsiteTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
}
