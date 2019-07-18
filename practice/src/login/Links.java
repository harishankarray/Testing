package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Hari\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo =	new	ChromeDriver();
		bo.get("https://www.hdfcbank.com/");
		List <WebElement> nl=bo.findElements(By.tagName("a"));
		System.out.println(nl.size());
		for (int i=1; i<=nl.size();i++)
		{
		
		System.out.println(nl.get(i));
	
		}
	bo.close();
	
	}

}
