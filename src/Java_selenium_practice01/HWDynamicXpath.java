package Java_selenium_practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HWDynamicXpath {
WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\md ismail hossain\\git\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.costco.com/");
	}
	
	@Test
	public void signinButtonTest() throws InterruptedException {
		//driver.findElement(By.id("cms-login-submit")).click();
		driver.findElement(By.xpath("//a[@class='hidden-xs hidden-sm hidden-md']")).click();
		Thread.sleep(5000); // this is not a part of testing, we used it to see the action is happened
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
