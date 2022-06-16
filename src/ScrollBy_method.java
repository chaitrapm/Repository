import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        JavascriptExecutor js=( JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000);");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-1000);");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(670,959);");
	}

}
