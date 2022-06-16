import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollintoview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.zomato.com/");
        WebElement scrollEle=driver.findElement(By.xpath("//h5[contains(text(),'Marathahalli')]"));
        JavascriptExecutor js=( JavascriptExecutor)driver;
    
        js.executeScript("arguments[0].scrollIntoView(true);", scrollEle);
        
	}

}
