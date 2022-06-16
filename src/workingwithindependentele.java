import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithindependentele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		String text=driver.findElement(By.xpath("//table[1]/tbody/tr/td[3]/a")).getText();
		if(text.contains("Laptop"))
				{
			System.out.println("pass: product is displayed");
				}
		driver.close();
	}
}
