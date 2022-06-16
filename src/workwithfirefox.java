import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class workwithfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--headless");
		option.addArguments("start-maximized");
		WebDriver driver=new FirefoxDriver(option);
		driver.get("https://easemytrip.com/");
		System.out.println("Browser open");
	}
}


