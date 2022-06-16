import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-to-word");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/user/Documents/Chaitra_Resume1.pdf");
        
	}

}
