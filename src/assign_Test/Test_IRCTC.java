package assign_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import assign_POM.IRCTC;

public class Test_IRCTC 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		
		IRCTC train=new IRCTC(driver);
		train.okpopupMethod();
		train.userTextfieldMethod();
		train.passwordTextfielddMethod();
		train.conformpwdTextfieldMethod();
		train.droupdownforsecurityquationMethod();
		train.securityQuationselectMethod();
		train.securityAnswerTextfieldMethod();
		train.PreferredLanguageselectMethod();
		train.selectlanguagelinkMethod();
		train.firstnameTextfieldMethod();
		train.middleNameTextfieldMethod();
		train.lastnameTextfieldMethod();
		train.genderselectMethod();
		train.DOBclanderMethod();
		train.selectoccupationMethod();
		train.marrageSttusMethod();
		
	}
}
