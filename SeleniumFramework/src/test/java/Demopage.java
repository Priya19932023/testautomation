import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demopage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://rahulshettyacademy.com/");
		System.out.println("https://rahulshettyacademy.com/");
		WebElement Register =driver.findElement(By.className("theme-btn"));
		Register.click();
		WebElement email = driver.findElement(By.name("sign_up_method"));
		email.click();
		WebElement Firstname = driver.findElement(By.id("user_name"));
		Firstname.sendKeys("hdhj");
		WebElement Email = driver.findElement(By.xpath("/html/body/main/div/form/div[2]/input"));
		Email.sendKeys("sajego4390@fom8.com");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("test@123");
		WebElement Signupbutton= driver.findElement(By.cssSelector("body.dsp-flex-xs.flex-direction-column.identity-layout:nth-child(2) main.p-v-5-l:nth-child(3) div.container.m-auto-xs.col-4-l.col-5-m.col-10-xs.p-h-6-l form.recaptcha-protected div.dsp-flex-xs.flex-justify-content-center-xs.m-b-3-xs:nth-child(7) > input.button.btn-primary.col-10-xs.p-v-2-xs.p-h-5-xs.m-v-3-xs"));
		Signupbutton.click();
		System.out.println( driver.findElement(By.xpath("/html/body/main/div[1]/div/span")).getText());
		driver.findElement(By.xpath("/html/body/main/div[2]/form/div[6]/a")).click();
		driver.findElement(By.id("email")).sendKeys("sajego4390@fom8.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/form[1]/div[4]/input[1]")).click();
//		driver.findElement(By.cssSelector("m-l-0-xs")).click();
	
//		driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.id("search-courses")).sendKeys("Automation");
		
		
		
		
		
		

	}

}
