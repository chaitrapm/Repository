import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clcikonmovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("C:/Users/user/Downloads/iframe.html");
        driver.switchTo().frame(0);
       // driver.switchTo().frame(0);
       // driver.switchTo().frame("")
    
        driver.findElement(By.xpath("//a[contains(text(),'MOVIES')]")).click();
	}

}
