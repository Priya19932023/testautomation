
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class Login

	{
		@Test(dataProvider="credentals")
		public void loginpagetest(String scenario, String username, String password)
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/login");
			driver.findElement(By.id("Email")).sendKeys("priya");
			driver.findElement(By.id("Password")).sendKeys("test@123");
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			if(scenario.equals("bothcorrect"))
			{
				WebElement account=driver.findElement(By.className("account"));
				Assert.assertTrue(account.isDisplayed(), "login is not success");
			}
			else if(scenario.equals("bothwrong"))
			{
				String errorMessage= driver.findElement(By.cssSelector(".message-error ul>li")).getText();
				Assert.assertEquals(errorMessage,  "No  customer are found");
			}
			else if(scenario.equals("wrongusername"))
			{
				String errorMessage= driver.findElement(By.cssSelector(".message-error ul>li")).getText();
				Assert.assertEquals(errorMessage,  "invalid username");
			}
			else if(scenario.equals("wrongpassword"))
			{
				String errorMessage= driver.findElement(By.cssSelector(".message-error ul>li")).getText();
				Assert.assertEquals(errorMessage,  "invalid password");
			}
			
		}
		@DataProvider(name="credentals")
		public Object[][] getData()
		{
	return new Object[][]
			{
		{"bothcorrect","priya@gmail.com","test@123"},
		{"bothwrong","priya1@gmail.com","test@1234"},
		{"correctusername","priya@gmail.com","test@1234"},
		{"correctpassword","priya1@gmail.com","test@123"}
		
			};
	}
	}

