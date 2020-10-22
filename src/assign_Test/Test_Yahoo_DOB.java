package assign_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import assign_POM.Yahoo_DOB;

public class Test_Yahoo_DOB 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com&src=fpctx&specId=yidReg");
		
		Yahoo_DOB datails=new Yahoo_DOB(driver);
		datails.firstnameTextfaildMathod();
		datails.lastnameTextfaildMathod();
		datails.emailidTextfaildMethod();
		datails.passwordTextfaild();
		datails.contrycodeMethod();
		datails.phonenoTextfaildMathod();
		datails.monthdroupdownlistMethod();
		datails.DateselectMethod();
		datails.yearselectMethod();
		datails.GenderselectMethod();
	}

}
