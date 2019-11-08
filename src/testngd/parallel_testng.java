package testngd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallel_testng {

	
@Test

public void init() {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.out.println("Current Thread"+Thread.currentThread().getId());
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.geico.com");
}


@Test

public void Launch() {
	
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	System.out.println("Current Thread"+Thread.currentThread().getId());
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.geico.com");
}
}
