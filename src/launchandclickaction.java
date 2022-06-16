import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchandclickaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./Driver.geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.navigate().to("http://demowebshop.tricentis.com/");
WebElement link=driver.findElement(By.tagName("a"));

	}

}
