package testCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageObject.HomePage;
import utilities.ExcelUtilis;
import utilities.ScreenShot;
import utilities.StartUp;

public class TestCaseForLandingPage extends StartUp {

	@Test
	public void verifyTitle() throws Exception {

		HomePage hP = new HomePage(driver);
        ExcelUtilis eU=new ExcelUtilis(driver); 
        eU.setExcelFile(eU.Path, "data");
		driver.findElement(By.xpath(".//*[@id='tab-flight-tab']/span[1]")).click();
		Thread.sleep(2000);

		extent.startTest("TC01.2", "Open Flight Tab");
		extent.log(LogStatus.PASS, "Open Flight TAb", "View details below:",
				ScreenShot.captureScreen(driver, "Flight Tab "));
		extent.endTest();
				
		driver.findElement(By.xpath(".//*[@id='flight-origin']")).sendKeys(eU.getCellData(1, 0));
		driver.findElement(By.xpath(".//*[@id='flight-destination']")).sendKeys(eU.getCellData(1, 1));
		driver.findElement(By.xpath(".//*[@id='flight-departing']")).clear();
		driver.findElement(By.xpath(".//*[@id='flight-departing']")).sendKeys("03/20/2016");
		driver.findElement(By.xpath(".//*[@id='flight-returning']")).clear();
		driver.findElement(By.xpath(".//*[@id='flight-returning']")).sendKeys("03/29/2016");
		extent.startTest("TC01.3", "Enter Data");
		extent.log(LogStatus.PASS, "Enter Data", "View details below:",
				ScreenShot.captureScreen(driver, "Enter Data "));
		extent.endTest();
		driver.findElement(By.xpath(".//*[@id='search-button']")).click();
		Thread.sleep(10000);
		
		//*[starts-with(@id,'flightModule')]
		
		String result=driver.findElement(By.xpath(".//*[@id='flightModuleList']")).getText();
		//eU.setExcelFile(eU.Path, "Sheet2");
		eU.setCellData(eU.Path, result, 1, 6);
		
		extent.startTest("TC01.4", "All Flight Show");
		extent.log(LogStatus.PASS, "All Flight Show", "View details below:",
				ScreenShot.captureScreen(driver, "All Flight Show"));
		extent.endTest();
		
		
		//List<WebElement> list =driver.findElements(By.xpath("//*[starts-with(@id,'flightModule')]"));
		List<WebElement> list =driver.findElements(By.xpath("//*[starts-with(@id,'flex-card')]"));
		
		System.out.println(list.size());
		
		System.out.println(list.get(1).getText());
		
		String timeing=driver.findElement(By.xpath(".//*[@id='flex-card-1']/div[2]/div[1]/div[1]/div[1]")).getText();
		
		String airlines=driver.findElement(By.xpath(".//*[@id='flex-card-1']/div[2]/div[1]/div[1]/div[2]")).getText();
		
		String duration=driver.findElement(By.xpath(".//*[@id='flex-card-1']/div[2]/div[1]/div[2]/div[1]")).getText();
		
		String flightCondition=driver.findElement(By.xpath(".//*[@id='flex-card-1']/div[2]/div[1]/div[3]/div")).getText();
		
		String totalPrice=driver.findElement(By.xpath(".//*[@id='flex-card-1']/div[2]/div[2]/div/div/div")).getText();
		
		
		String[] full=totalPrice.split(" ", 1);
		System.err.println("********************************************************");
		
		for(String getp:full){
			System.out.println(getp);
		}
		
		System.err.println("********************************************************");
		System.out.println(timeing);
		System.out.println(airlines);
		System.out.println(duration);
		System.out.println(flightCondition);
		//System.out.println(price);
		
		
		

	}

}
