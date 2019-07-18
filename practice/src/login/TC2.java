package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Hari\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo =	new	ChromeDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		if(bo.switchTo().alert().getText().equals("User Name not given!"))
		{
		System.out.println("pass_TC2");
		}
		else
		{
		System.out.println("fail_TC2");
		}
		bo.switchTo().alert().accept();

	bo.close();
	}

}
