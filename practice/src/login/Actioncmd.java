package login;

import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actioncmd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\Hari\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo =	new	ChromeDriver();
		bo.get("https://www.amazon.in/");
		Actions act=new Actions(bo);
		act.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Category')]"))).perform();
		act.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Mobiles, Computers')]"))).perform();
		act.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Power Banks')]"))).perform();
		bo.findElement(By.xpath("//span[contains(text(),'Power Banks')]")).click();
	Thread.sleep(5000);
		bo.findElement(By.xpath("//div[@id='100_dealView_2']//div[@class='a-row layer backGround']")).click();
		String wname = bo.getWindowHandle();
		System.out.println(wname);
		bo.switchTo().window("wname");
		bo.findElement(By.xpath("//div[@class='a-section a-padding-medium auth-workflow']")).click();
	
			}
		
	}
		
	

