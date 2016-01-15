package smokes;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetUpDriver {

	WebDriver driver;

	@Before
	public void setUp() {
		String[] cli_args = new String[]{ "--ignore-ssl-errors=true" };
		Capabilities caps = new DesiredCapabilities();
		((DesiredCapabilities) caps).setJavascriptEnabled(true);
		((DesiredCapabilities) caps).setCapability("takesScreenshot", true);
		((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cli_args);
		((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
				"/usr/local/bin/phantomjs");
		driver = new PhantomJSDriver(caps);
		driver.manage().window().maximize();
		driver.navigate().to("https://rc.live.test.cheggnet.com/tutors/");
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
