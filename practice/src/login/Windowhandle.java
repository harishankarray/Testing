package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Hari\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo =	new	ChromeDriver();
		bo.get("https://www.hdfcbank.com/");
		Thread.sleep(5000);
		bo.findElement(By.xpath("//div[@class='homebanner_wrapper']/div/div[2]/div/a[@id='loginsubmit']")).click();
		Thread.sleep(2000);
		
		String newwindow=bo.getWindowHandle();
		System.out.println("window name: " + newwindow);
		
		bo.switchTo().window("newwindow");
		Thread.sleep(5000);
		bo.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/a[1]")).click();
		
	}

}

