import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demohtmlclickondropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/demo.html");
		//WebElement dropdown=driver.findElement(By.xpath("//select[@id='standard_cars']"));
		Select sortdropdown= new Select(driver.findElement(By.xpath("//select[@id='standard_cars']")));
		List<WebElement> optionslist=sortdropdown.getOptions();
		for(int i=0; i<optionslist.size(); i++){
			Select sortdropdown2 =new Select(driver.findElement(By.xpath("//select[@id='standard_cars']")));
			sortdropdown2.selectByIndex(i);
		}
	}

}
