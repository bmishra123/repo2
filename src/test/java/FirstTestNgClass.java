import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNgClass {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bi050\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("Google page opened");
		
		
		
	}
	@Test(priority=2)
	public void getTitle() throws Exception {
		
		Thread.sleep(200);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
