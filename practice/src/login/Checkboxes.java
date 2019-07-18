package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\Hari\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo =	new	ChromeDriver();
		bo.get("https://www.redbus.in/");
		List <WebElement> textboxes=bo.findElements(By.xpath("//div[@class='main-header clearfix']"));
		System.out.println(textboxes.size());
	}

}
