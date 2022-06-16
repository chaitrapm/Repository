package Reports_pgm;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsPractice {
	WebDriver driver;

	public static void main(String[] args) {
		LocalDateTime sysTime=LocalDateTime.now();
		String ReportDate=sysTime.toString().replaceAll(":", "-");
		
	    ExtentReports report=new ExtentReports("./Reports/"+ReportDate+"ExtentReports.html", true);
		ExtentTest test= report.startTest("ExtentDemo");
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
        test.log(LogStatus.INFO, "Browser is open");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.zomato.com/");
		  test.log(LogStatus.INFO, "page is loaded");
	        WebElement scrollEle=driver.findElement(By.xpath("//h5[contains(text(),'Marathahalli')]"));
	        JavascriptExecutor js=( JavascriptExecutor)driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", scrollEle);
	        test.log(LogStatus.PASS, "page is scrolled");
	        test.log(LogStatus.FATAL, "header is not displayed");
	        report.endTest(test);
	        report.flush();
	}
	        public  static String  Screenshots(){
	        	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	            WebDriver driver=new ChromeDriver();
	            LocalDateTime dateTime=LocalDateTime.now();
	            String ReportDate=dateTime.toString().replaceAll(":", "-");
	            String imgpath="./Screenshots/"+ReportDate+".png";
	        	TakesScreenshot ts=(TakesScreenshot)driver;
	            File file=ts.getScreenshotAs(OutputType.FILE);
	            File dest=new File(imgpath);
	            try{
	            	FileHandler.copy(file, dest);
	            }
	            catch(IOException e){
	            	System.out.println("handled");
	            }
	            return "."+imgpath;
	        }
	       
	

}
