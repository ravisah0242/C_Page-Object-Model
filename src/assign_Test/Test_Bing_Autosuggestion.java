package assign_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import assign_POM.Bing_Autosuggestion;

public class Test_Bing_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		
		Bing_Autosuggestion suggestion=new Bing_Autosuggestion(driver);
		suggestion.serchMethod();

	}

}
