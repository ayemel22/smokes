package smokes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class MajorElementsVisibleOnLandingPage extends SetUpDriver {

	@Test
	public void assertElementPresence(){
		WebElement tutorsHomeLink = driver.findElement(By.cssSelector("a[id='logo-link']"));
		WebElement pricingButton = driver.findElement(By.cssSelector("a[id='nav-pricing']"));
		WebElement howItWorksButton = driver.findElement(By.cssSelector("a[id='nav-how-it-works']"));
		WebElement headerSearch = driver.findElement(By.cssSelector("input[id='header-search']"));
		WebElement searchButton = driver.findElement(By.cssSelector("div[class='search-button-nav']"));
		WebElement signInButton = driver.findElement(By.cssSelector("a[id='nav-sign-in']"));
		WebElement startFreeTrialButton = driver.findElement(By.cssSelector("a[class='nav-free-trial-cta no-separator nav-btn header-right']"));
		WebElement howItWorksCenterButton = driver.findElement(By.cssSelector("a[class='js-how-it-works-toggle animateToElement']"));
		WebElement messageModalSubjectSearch = driver.findElement(By.cssSelector("div[class='message-modal-subject-search']"));
		WebElement selectPriorityDropDown = driver.findElement(By.cssSelector("div[class='priority-select-wrapper']"));
		WebElement getTutorMatchesButton = driver.findElement(By.cssSelector("a[class='btn btn-primary find-tutor-now-btn']"));
		WebElement omnibar = driver.findElement(By.cssSelector("div[id='omnibar']"));
		Assert.assertTrue(tutorsHomeLink.isDisplayed());
		Assert.assertTrue(pricingButton.isDisplayed());
		Assert.assertTrue(howItWorksButton.isDisplayed());
		Assert.assertTrue(headerSearch.isDisplayed());
		Assert.assertTrue(searchButton.isDisplayed());
		Assert.assertTrue(signInButton.isDisplayed());
		Assert.assertTrue(startFreeTrialButton.isDisplayed());
		Assert.assertTrue(howItWorksCenterButton.isDisplayed());
		Assert.assertTrue(messageModalSubjectSearch.isDisplayed());
		Assert.assertTrue(selectPriorityDropDown.isDisplayed());
		Assert.assertTrue(getTutorMatchesButton.isDisplayed());
		Assert.assertTrue(omnibar.isDisplayed());
	}
}
