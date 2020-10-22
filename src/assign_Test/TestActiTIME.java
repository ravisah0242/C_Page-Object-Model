package assign_Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import assign_POM.ActiTimeHomePage_Create_Delete_Work;
import assign_POM.Leave_Type;
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
		
		//ActitimeLoginPage login=new ActitimeLoginPage(driver);
		//login.loginMethod();
		//login.forgotyourpasswordMethod();
		
		/*ActiTimeHomePage_Create_Delete_Work createAndDelete=new ActiTimeHomePage_Create_Delete_Work(driver);
		createAndDelete.popupmenuMethod();
		/reateAndDelete.typeofworkMethod();  
		createAndDelete.createtypeofworkMethod();
		createAndDelete.namecreatetypeofworkMethod();
		createAndDelete.submitMethod();
		createAndDelete.deleteHRManagerMethod();
		createAndDelete.okbuttonMethod();*/
		
		/*ActiTimeHomePage_Create_Delete_Work createAndDelete=new ActiTimeHomePage_Create_Delete_Work(driver);
		createAndDelete.popupmenuMethod();
		Leave_Type leavetype=new Leave_Type(driver);
		leavetype.leavetypeMethod();
		leavetype.createleaveMethod();
		leavetype.createnewleavetypeMethod();
		leavetype.createnewMethod();
		leavetype.deleteMethod();
		leavetype.okbuttonMethod();*/
		
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		//login.forgotyourpasswordMethod();
		
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.tasksMethod();
		
		ActitimeTasksPage task=new ActitimeTasksPage(driver);
		//task.addnewMethod();
		//task.newcustomerMethod();
		
		ActitimeCreateNewCustomerPage customer=new ActitimeCreateNewCustomerPage(driver);
		//customer.entercustomernameMethod();
		//customer.entercustomerdescriptionMethod();
		//customer.createcustomerMethod();
		customer.editMethod();
	}
}