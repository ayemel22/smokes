package smokes;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SignUpSignInSuccess extends SetUpDriver {

	RandomStringGeneratorEmail random = new RandomStringGeneratorEmail();
	static String studentEmailGenerated = "";
	static String parentEmailGenerated = "";

	// verify the student is able to sign up successfully via the start your
	// free trial link

	@Test
	public void AStudentSignUpSuccessViaStartYourFreeTrialButton() {
		WebElement startYourFreeTrial = driver
				.findElement(By.cssSelector("a[class='nav-free-trial-cta no-separator nav-btn header-right']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(startYourFreeTrial));
		startYourFreeTrial.click();
		// switch window focus in order to focus on modal
		for (String child : driver.getWindowHandles()) {
			driver.switchTo().window(child);
			WebElement yourName = driver.findElement(By.cssSelector("div[class='input-group'] #id-signup-name"));
			WebElement emailAddress = driver.findElement(By.cssSelector("div[class='input-group'] #id-signup-email"));
			WebElement chooseAPassword = driver.findElement(By.cssSelector("div[class='input-group'] #id-signup-password"));
			WebElement signUpButton = driver.findElement(By.cssSelector("#create-account"));
			wait.until(ExpectedConditions.visibilityOf(yourName));
			yourName.clear();
			emailAddress.clear();
			chooseAPassword.clear();
			yourName.click();
			yourName.sendKeys("Student");
			emailAddress.click();
			emailAddress.sendKeys(random.randomString() + "@" + "gmail.com");
			studentEmailGenerated = emailAddress.getAttribute("value").toString();
			chooseAPassword.click();
			chooseAPassword.sendKeys("Test@123");
			signUpButton.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			signUpButton.click();
			WebElement nameOnCard = driver.findElement(By.name("cardName"));
			WebElement cardNumber = driver.findElement(By.name("cardNumber"));
			WebElement securityCode = driver.findElement(By.name("cardCode"));
			WebElement zip = driver.findElement(By.name("zip"));
			WebElement startYourFreeTrialButton = driver.findElement(By.cssSelector("div[class='paywall-submit']"));
			// make sure all values are empty by default
			Assert.assertTrue(nameOnCard.getText().isEmpty());
			Assert.assertTrue(cardNumber.getText().isEmpty());
			Assert.assertTrue(securityCode.getText().isEmpty());
			Assert.assertTrue(zip.getText().isEmpty());
			// input information
			nameOnCard.click();
			nameOnCard.sendKeys("Student");
			cardNumber.click();
			cardNumber.sendKeys("4242424242424242");
			securityCode.click();
			securityCode.sendKeys("456");
			zip.click();
			zip.sendKeys("45678");
			zip.clear();
			zip.click();
			zip.sendKeys("45678");
			startYourFreeTrialButton.click();
			WebDriverWait wait2 = new WebDriverWait(driver, 30);
			WebElement continueButton = driver.findElement(By.cssSelector("a[id='chegg-paywall-next-url']"));
			wait2.until(ExpectedConditions.visibilityOf(continueButton));
			continueButton.click();
			// assert that free trial link is no longer visible meaning that the
			// free trial has been activated
			String bodyText = driver.findElement(By.tagName("body")).getText();
			Assert.assertFalse("Start your free trial", bodyText.contains("Start your free trial"));
			// also check that 30 minutes are given just to be sure
			//WebElement more = driver.findElement(By.cssSelector("div[id='more-menu']"));
			//wait.until(ExpectedConditions.visibilityOf(more));
			//more.click();
			//WebElement free30Min = driver
				//	.findElement(By.cssSelector("div[id='more-menu-popup'] div[id='free-time-box'] h2"));
			//Assert.assertTrue(free30Min.getText().contains("30 min"));
		}
	}

	// verify the parent is able to sign up successfully via the start your
	// free trial link

	@Test
	public void AParentSignUpSuccessViaStartYourFreeTrialButton() {
		WebElement startYourFreeTrial = driver
				.findElement(By.cssSelector("a[class='nav-free-trial-cta no-separator nav-btn header-right']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(startYourFreeTrial));
		startYourFreeTrial.click();
		// switch window focus in order to focus on modal
		for (String child : driver.getWindowHandles()) {
			driver.switchTo().window(child);
			WebElement parentRadioButton = driver.findElement(By.cssSelector("div[class='input-group'] #signup_role_parent_modal"));
			WebElement yourName = driver.findElement(By.cssSelector("div[class='input-group'] #id-signup-name"));
			WebElement emailAddress = driver.findElement(By.cssSelector("div[class='input-group'] #id-signup-email"));
			WebElement chooseAPassword = driver.findElement(By.cssSelector("div[class='input-group'] #id-signup-password"));
			WebElement signUpButton = driver.findElement(By.cssSelector("#create-account"));
			wait.until(ExpectedConditions.visibilityOf(yourName));
			yourName.clear();
			emailAddress.clear();
			chooseAPassword.clear();
			parentRadioButton.click();
			yourName.click();
			yourName.sendKeys("Parent");
			emailAddress.click();
			emailAddress.sendKeys(random.randomString() + "@" + "gmail.com");
			parentEmailGenerated = emailAddress.getAttribute("value").toString();
			chooseAPassword.click();
			chooseAPassword.sendKeys("Test@123");
			signUpButton.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			signUpButton.click();
			WebElement nameOnCard = driver.findElement(By.name("cardName"));
			WebElement cardNumber = driver.findElement(By.name("cardNumber"));
			WebElement securityCode = driver.findElement(By.name("cardCode"));
			WebElement zip = driver.findElement(By.name("zip"));
			WebElement startYourFreeTrialButton = driver.findElement(By.cssSelector("div[class='paywall-submit']"));
			// make sure all values are empty by default
			Assert.assertTrue(nameOnCard.getText().isEmpty());
			Assert.assertTrue(cardNumber.getText().isEmpty());
			Assert.assertTrue(securityCode.getText().isEmpty());
			Assert.assertTrue(zip.getText().isEmpty());
			// input information
			nameOnCard.click();
			nameOnCard.sendKeys("Parent");
			cardNumber.click();
			cardNumber.sendKeys("4242424242424242");
			securityCode.click();
			securityCode.sendKeys("456");
			zip.click();
			zip.sendKeys("45678");
			zip.clear();
			zip.click();
			zip.sendKeys("45678");
			startYourFreeTrialButton.click();
			WebDriverWait wait2 = new WebDriverWait(driver, 30);
			WebElement continueButton = driver.findElement(By.cssSelector("a[id='chegg-paywall-next-url']"));
			wait2.until(ExpectedConditions.visibilityOf(continueButton));
			continueButton.click();
			// assert that free trial link is no longer visible meaning that the
			// free trial has been activated
			String bodyText = driver.findElement(By.tagName("body")).getText();
			Assert.assertFalse("Start your free trial", bodyText.contains("Start your free trial"));
			// also check that 30 minutes are given just to be sure
			//WebElement more = driver.findElement(By.cssSelector("div[id='more-menu']"));
			//wait.until(ExpectedConditions.visibilityOf(more));
			//more.click();
			//WebElement free30Min = driver
				//	.findElement(By.cssSelector("div[id='more-menu-popup'] div[id='free-time-box'] h2"));
			//Assert.assertTrue(free30Min.getText().contains("30 min"));
		}
	}

	// now check if sign in is working by using the email address previously
	// created for student and parent to make sure they can log in and the
	// account was created.

	// student sign in
	
	@Test
	public void SignInStudent() {
		WebElement signInButton = driver.findElement(By.cssSelector("a[id='nav-sign-in']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(signInButton));
		signInButton.click();
		wait.until(ExpectedConditions.urlContains("signin"));
		WebElement emailAddressField = driver.findElement(By.cssSelector("input[id='id-login-email']"));
		WebElement passwordField = driver.findElement(By.cssSelector("input[id='id-login-password']"));
		emailAddressField.clear();
		emailAddressField.sendKeys(studentEmailGenerated);
		passwordField.clear();
		passwordField.sendKeys("Test@123");
		WebElement logInButton = driver
				.findElement(By.cssSelector("button[class='sign-in-submit btn btn-convert btn-fullwidth btn-xlarge']"));
		logInButton.click();
		wait.until(ExpectedConditions.urlContains("/tutors"));
	}

	// parent sign in
	
	@Test
	public void SignInParent() {
		WebElement signInButton = driver.findElement(By.cssSelector("a[id='nav-sign-in']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(signInButton));
		signInButton.click();
		wait.until(ExpectedConditions.urlContains("signin"));
		WebElement emailAddressField = driver.findElement(By.cssSelector("input[id='id-login-email']"));
		WebElement passwordField = driver.findElement(By.cssSelector("input[id='id-login-password']"));
		emailAddressField.clear();
		emailAddressField.sendKeys(parentEmailGenerated);
		passwordField.clear();
		passwordField.sendKeys("Test@123");
		WebElement logInButton = driver
				.findElement(By.cssSelector("button[class='sign-in-submit btn btn-convert btn-fullwidth btn-xlarge']"));
		logInButton.click();
		wait.until(ExpectedConditions.urlContains("/tutors"));
	}
	
	@After
	public void tearDown(){
		driver.close();
		driver.quit();
	}
}
