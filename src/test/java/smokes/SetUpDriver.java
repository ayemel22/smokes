package smokes;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUpDriver {

	WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rc.live.test.cheggnet.com/tutors");
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
