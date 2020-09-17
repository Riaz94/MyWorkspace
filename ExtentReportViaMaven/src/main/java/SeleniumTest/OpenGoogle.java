package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OpenGoogle {

	public static void main(String[] args) {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("reports.html");
		ExtentReports extentreports = new ExtentReports();
		extentreports.attachReporter(reporter);
		ExtentTest test = extentreports.createTest("Riaz");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
	   
		driver.findElement(By.name("q")).sendKeys("Whatsup Duck!");
	    driver.findElement(By.name("q")).submit();
	    
	    test.pass("Test passed");
	    driver.quit();
	    extentreports.flush();
	    
	}

}
