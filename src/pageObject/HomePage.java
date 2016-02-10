package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.AllMethod;

public class HomePage {

	public WebDriver driver;

	private By homeLink = By.xpath(".//*[@id='primary-header-home']");
	private By bundleDealsLink = By.xpath(".//*[@id='primary-header-package']");
	private By hotelLink = By.xpath(".//*[@id='primary-header-hotel']");
	private By carLink = By.xpath(".//*[@id='primary-header-car']");
	private By flightLink = By.xpath(".//*[@id='primary-header-flight']");
	private By cruisesLink = By.xpath(".//*[@id='primary-header-cruise']");
	private By thingsToDoLink = By.xpath(".//*[@id='primary-header-activity']");
	private By dealsLink = By.xpath(".//*[@id='primary-header-deals']");
	private By rewardsLink = By.xpath(".//*[@id='primary-header-rewards']");
	private By mobileLink = By.xpath(".//*[@id='primary-header-mobile']");
	private By flightTab = By.xpath(".//*[@id='tab-flight-tab']/span[1]");
	private By hotelTab = By.xpath(".//*[@id='tab-hotel-tab']/span[1]");
	private By bundleTab = By.xpath(".//*[@id='tab-package-tab']/div");
	private By carsTab = By.xpath(".//*[@id='tab-car-tab']/span[1]");
	private By cruiseTab = By.xpath(".//*[@id='tab-cruise-tab']");
	private By thingsToDoTab = By.xpath(".//*[@id='tab-activity-tab']/span[1]");
	private By flightHotelLabel = By.xpath(".//*[@id='package-fh-label']");
	private By flightHotelCarLabel = By.xpath(".//*[@id='package-fhc-label']");
	private By flightCarLabel = By.xpath(".//*[@id='package-fc-label']");
	private By hotelCarLabel = By.xpath(".//*[@id='package-hc-label']");
	private By flyingFrom = By.xpath(".//*[@id='package-origin']");
	private By flyingTo = By.xpath(".//*[@id='package-destination']");
	private By departDate = By.xpath(".//*[@id='package-departing']");
	private By returnDate = By.xpath(".//*[@id='package-returning']");
	private By roomListBox = By.xpath(".//*[@id='package-rooms']");
	private By adultsListBox = By.xpath(".//*[@id='package-1-adults']");
	private By childernListBox = By.xpath(".//*[@id='package-1-children']");
	private By selectClass = By.xpath(".//*[@id='package-advanced-preferred-class']");
	private By searchButton = By.xpath(".//*[@id='search-button']");

	// This is Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// For New Account Label

	// For Insert Text on Flying from Field
	public void enterTxtOnFlyingFrom(String flyCity) {

		driver.findElement(flyingFrom).sendKeys(flyCity);
		if (flyCity == null) {
			driver.findElement(flyingFrom).sendKeys("N/A");
		}
	}

	// For Insert Text on Flying To Field
	public void enterTxtOnFlyingTo(String flyTo) {

		driver.findElement(flyingTo).sendKeys(flyTo);
		if (flyTo == null) {
			driver.findElement(flyingTo).sendKeys("N/A");
		}
	}

	// For Click Home Link
	public void clickHomeLink() {
		driver.findElement(homeLink).click();
	}

	// For Click Bundles Deal Link
	public void clickBundleLink() {
		driver.findElement(bundleDealsLink).click();
	}

	// For Click Hotels Link
	public void clickHotelsLink() {
		driver.findElement(hotelLink).click();
	}

	// For Click Car Link
	public void clickCarLink() {
		driver.findElement(carLink).click();
	}

	// For Click Flight Link
	public void clickFlightLink() {
		driver.findElement(flightLink).click();
	}

	// For Click cruises Link
	public void clickCruisesLink() {
		driver.findElement(cruisesLink).click();
	}

	// For Click Things To Do Link
	public void clicThingsToDoLink() {
		driver.findElement(thingsToDoLink).click();
	}

	// For Click Deals Link
	public void clickDealsLink() {
		driver.findElement(dealsLink).click();
	}

	// For Click Rewards Link
	public void clickRewardsLink() {
		driver.findElement(rewardsLink).click();
	}

	// For Click Mobile Link
	public void clickMobileLink() {
		driver.findElement(mobileLink).click();
	}

	// For Click Flight TAb
	public void clickFlightTab() {
		driver.findElement(flightTab).click();
	}

	// For Click Hotel TAb
	public void clickHotelsTab() {
		driver.findElement(hotelTab).click();
	}

	// For Click Bundle TAb
	public void clickBundleTab() {
		driver.findElement(bundleTab).click();
	}

	// For Click Cars TAb
	public void clickCarTab() {
		driver.findElement(carsTab).click();
	}

	// For Click Cruises TAb
	public void clickCruisesTab() {
		driver.findElement(cruiseTab).click();
	}

	// For Click ThingsToDo TAb
	public void clickThingsToDoTab() {
		driver.findElement(thingsToDoTab).click();
	}

	// For Click Flight Hotel Label
	public void clickFlightHotelLabel() {
		driver.findElement(flightHotelLabel).click();
	}

	// For Click Flight Hotel Car Label
	public void clickFlightHotelCarLabel() {
		driver.findElement(flightHotelCarLabel).click();
	}

	// For Click Flight Car Label
	public void clickFlightCarLabel() {
		driver.findElement(flightCarLabel).click();
	}

	// For Click Hotel Car Label
	public void clickHotelCarLabel() {
		driver.findElement(hotelCarLabel).click();
	}

	// For Insert Text on Flying Date
	public void enterTxtOnDepartingDate(String dDate) {
		driver.findElement(departDate).click();
		driver.findElement(departDate).sendKeys(dDate);
		if (dDate == null) {
			driver.findElement(departDate).sendKeys("N/A");
		}
	}

	// For Insert Text on Return Date
	public void enterTxtOnReturningDate(String rDate) {
		driver.findElement(returnDate).click();
		driver.findElement(returnDate).sendKeys(rDate);
		if (rDate == null) {
			driver.findElement(returnDate).sendKeys("N/A");
		}
	}

	public void selectRooms(String room) {

		AllMethod.selectTextFromComboByVisibleTextUseBy(roomListBox, room);
	}

	public void selectAdults(String adults) {

		AllMethod.selectTextFromComboByVisibleTextUseBy(adultsListBox, adults);
	}

	public void selectChildren(String children) {

		AllMethod.selectTextFromComboByVisibleTextUseBy(childernListBox, children);
	}

	public void selectClass(String className) {

		AllMethod.selectTextFromComboByVisibleTextUseBy(selectClass, className);
	}

	// For Click Search Button
	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}
	
	
	public String title(){
		return driver.getTitle();
	}
	

}
