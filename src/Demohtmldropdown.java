import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demohtmldropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/demo.html");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='standard_cars']"));
		Select sortdropdown=new Select(dropdown);
		List<WebElement> options=sortdropdown.getOptions();
		for(WebElement wb:options){
			System.out.println(wb.getText());
	}
}
}

