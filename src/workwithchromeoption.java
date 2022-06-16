import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class workwithchromeoption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--headless");
		option.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://easemytrip.com/");
		System.out.println("Browser open");
	}

}
