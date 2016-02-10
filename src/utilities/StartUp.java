package utilities;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.GridType;
import com.relevantcodes.extentreports.LogStatus;



public class StartUp {
	public static  WebDriver driver = null;
	public static final String url = "https://www.expedia.com/";
	public static final ExtentReports extent = ExtentReports.get(StartUp.class);
	public static String timeStamp=new SimpleDateFormat("mmddyyyy").format(Calendar.getInstance().getTime());
	public static final String reportLocation = "C:\\Users\\jakther\\Desktop\\jahed\\Expedia\\Report\\";
	public static String imageLocation = "images/";
	public static final String validID = "jahid782002@yahoo.com";
	public static final String validPassword = "";
   
	
	@BeforeSuite
	public void reportIni() throws Exception{
		extent.init(reportLocation + "expedia.html", true,
				DisplayOrder.BY_OLDEST_TO_LATEST, GridType.STANDARD);
		extent.config().documentTitle("Expedia Test report in Browser");
		extent.config()
				.reportTitle(
						"<h1><font color='#000099'>Expedia Automation Test Result in browser</font></h1> <h4>1.</h4><h4>\n2.Member Account(Positive,Negetive).</h4><h4>\n2.</h4>");
		extent.config()
				.reportHeadline(
						"<b>Expedia Selenium Automation Test Report.Develop By:JAHED AKTHER</b>");
		
		
		
		
		
	}
	
	
   // @Parameters(value="browser")
	@BeforeTest
	public void openBrowser()  {
	
	   org.apache.log4j.Logger.getRootLogger().setLevel(org.apache.log4j.Level.OFF);
	   
	 /*  
	   if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\jakther\\Desktop\\jahed\\java\\IEDriverServer.exe");
			 DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();  
		        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		        driver = new InternetExplorerDriver(ieCapabilities);
			
		}else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakther\\Desktop\\jahed\\java\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}*/
	 			
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakther\\Desktop\\jahed\\java\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		extent.startTest("TC01.1", "Open The Browser");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(url);
		driver.manage().window().maximize();
		extent.log(LogStatus.PASS, "Open Expedia Application",
				"View details below:",
				ScreenShot.captureScreen(driver, "Open Aplication "));
		extent.endTest();
		
	}

    
    
    
	@AfterSuite
	public void tearDown() {
		//WebDriver driver1=new FirefoxDriver();
		driver.get("C:\\Users\\jakther\\Desktop\\jahed\\Expedia\\Report\\expedia.html");
		driver.manage().window().maximize();
		//driver.quit();
	}

}
