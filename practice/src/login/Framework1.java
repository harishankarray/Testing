package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login lg= new login();
		lg.tc2_1();
		lg.tc2_2();

	}

	
	
	
	
	
}


	class login {
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
	void tc2_1 (){
		System.setProperty("webdriver.chrome.driver","F:\\Hari\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo =	new	ChromeDriver();
		bo.get(bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
			bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
			bo.findElement(By.xpath("//input[@name='Submit']")).click();
			if(bo.getTitle().equals("OrangeHRM"))
			System.out.println("pass_TC2_1");
			else
				System.out.println("fail_TC2_1");

		bo.close();
		
	}
	
	 void tc2_2() {
	System.setProperty("webdriver.chrome.driver","F:\\Hari\\Work\\chromedriver_win32\\chromedriver.exe");
	WebDriver bo =	new	ChromeDriver();
	bo.get(bpath);
	bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
	bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
	bo.findElement(By.xpath("//input[@name='Submit']")).click();
	if(bo.switchTo().alert().getText().equals("User Name not given!"))
	{
	System.out.println("pass_TC2_2");
	}
	else
	{
	System.out.println("fail_TC2_2");
	}
	bo.switchTo().alert().accept();

bo.close();
}		
	
		
	}
