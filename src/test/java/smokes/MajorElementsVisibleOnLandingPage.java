package smokes;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MajorElementsVisibleOnLandingPage extends SetUpDriver {

	@Test
	public void assertElementPresence(){
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement tutorsHomeLink = driver.findElement(By.cssSelector("header[id='chegg-header'] a[id='logo-link']"));
		WebElement pricingButton = driver.findElement(By.cssSelector("header[id='chegg-header'] a[id='nav-pricing']"));
		WebElement howItWorksButton = driver.findElement(By.cssSelector("header[id='chegg-header'] a[id='nav-how-it-works']"));
		WebElement searchButton = driver.findElement(By.cssSelector("header[id='chegg-header'] div[class='search-button-nav']"));
		WebElement signInButton = driver.findElement(By.cssSelector("header[id='chegg-header'] a[id='nav-sign-in']"));
		WebElement startFreeTrialButton = driver.findElement(By.cssSelector("a[class='nav-free-trial-cta no-separator nav-btn header-right']"));
		WebElement howItWorksCenterButton = driver.findElement(By.cssSelector("a[class='js-how-it-works-toggle animateToElement']"));
		WebElement messageModalSubjectSearch = driver.findElement(By.cssSelector("div[class='message-modal-subject-search']"));
		WebElement selectPriorityDropDown = driver.findElement(By.cssSelector("div[class='priority-select-wrapper']"));
		WebElement getTutorMatchesButton = driver.findElement(By.cssSelector("a[class='btn btn-primary find-tutor-now-btn']"));
		WebElement omnibar = driver.findElement(By.cssSelector("div[id='omnibar']"));
		wait.until(ExpectedConditions.visibilityOf(tutorsHomeLink));
		wait.until(ExpectedConditions.visibilityOf(pricingButton));
		wait.until(ExpectedConditions.visibilityOf(howItWorksButton));
		wait.until(ExpectedConditions.visibilityOf(searchButton));
		wait.until(ExpectedConditions.visibilityOf(signInButton));
		wait.until(ExpectedConditions.visibilityOf(startFreeTrialButton));
		wait.until(ExpectedConditions.visibilityOf(howItWorksCenterButton));
		wait.until(ExpectedConditions.visibilityOf(messageModalSubjectSearch));
		wait.until(ExpectedConditions.visibilityOf(selectPriorityDropDown));
		wait.until(ExpectedConditions.visibilityOf(getTutorMatchesButton));
		wait.until(ExpectedConditions.visibilityOf(omnibar));
	}
	
	@After
	public void tearDown(){
		driver.close();
		driver.quit();
	}
}
