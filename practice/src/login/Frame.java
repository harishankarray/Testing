package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\Hari\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo =	new	ChromeDriver();
		bo.get("https://www.hdfcbank.com/");
		bo.switchTo().frame("CAR LOAN");
		bo.findElement(By.className("front icon")).click();
		
		
		
		
	}

}
