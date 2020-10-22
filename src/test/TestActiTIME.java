package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ActitimeCreateNewCustomerPage;
import pages.ActitimeHomePage;
import pages.ActitimeLoginPage;
import pages.ActitimeTasksPage;

public class TestActiTIME 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		//login.forgotyourpasswordMethod();
		
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.tasksMethod();
		
		ActitimeTasksPage task=new ActitimeTasksPage(driver);
		task.addnewMethod();
		task.newcustomerMethod();
		
		ActitimeCreateNewCustomerPage customer=new ActitimeCreateNewCustomerPage(driver);
		customer.entercustomernameMethod();
		customer.entercustomerdescriptionMethod();
		customer.cancelMethod();
		customer.okbuttonMethod();
		
	}
}