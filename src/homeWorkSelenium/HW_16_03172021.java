package homeWorkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_03172021 {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\md ismail hossain\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.get("https://www.ebay.com/");
		driver.get("https://www.bestbuy.com/");
	}

	
	@Test(enabled=false, priority = 1)
	public void logoTest() throws InterruptedException {
	//	boolean elementDisplayed = driver	.findElement(By.xpath(	"//img[@id='gh-logo']"))	.isDisplayed();
		boolean elementDisplayed = driver	.findElement(By.xpath(	"//img[@class='block']"))	.isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + elementDisplayed);
		Thread.sleep(5000);
	}
	@Test (enabled = true, priority = 2)
	public void loginButtonTest() throws InterruptedException {
		boolean loginButtonEnabled =	driver.findElement(By.xpath("//button[@class='c-button c-button-secondary c-button-sm email-signup-button']")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: "+loginButtonEnabled);
		Thread.sleep(5000); 
	}
	@Test(enabled = true, priority = 3)
	public void currentURLTest() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Sign in or Create Account']")).click();
		Thread.sleep(5000); // why here pause is necessary?
		System.out.println("The Current URL is: "+driver.getCurrentUrl());
	}
	@Test(enabled = false, priority = 4)
		public void checkBoxEnabledTest01() throws InterruptedException {
			driver.findElement(By.cssSelector("input.c-checkbox-input.appearance-none.border-25.rounded-25")).click();
		boolean checkBoxEnabled = driver.findElement(By.cssSelector("input.c-checkbox-input.appearance-none.border-25.rounded-25")).isSelected(); // Evaluate selected or not
		System.out.println("Is the Check Box Selected? Ans: " + checkBoxEnabled);
		Thread.sleep(5000);
	}
	@Test(enabled = false, priority = 5)
	public void titleTest() {
		System.out.println("The Title of the page is: " + driver.getTitle());	
	}
	@Test(enabled = true, priority = 6)
	public void getTextTest() {
		WebElement csa = driver.findElement(By.xpath("//a[text()='Sign in or Create Account']"));
		System.out.println("The text for the WebElement is: "+csa.getText());
	}
	@Test(enabled = false, priority = 7)
	public void getAttributeTest() {
		String value = driver.findElement(By.xpath("//a[text()='Sign in or Create Account']")).getAttribute("class");
	System.out.println("The value of the class attribute is: " +value);
	}
	@Test (enabled=false, priority = 8)
	public void userIdTest() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='gh-search-input']")).sendKeys("computer");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='header-search-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='gh-search-input']")).clear();
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
}
}