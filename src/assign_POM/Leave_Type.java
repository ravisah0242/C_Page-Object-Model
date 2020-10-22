package assign_POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leave_Type 
{
	public WebDriver driver;
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetypelink;
	
	@FindBy(xpath="//div[@class='i']")
	private WebElement createleavetypelink;
	
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement createnewleavetypelink;
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement createnew;

	//@FindBy(xpath="//span[.='Runing']/../../../../../..//td[@class='leaveTypeDeleteCell last active']")
	//@FindBy(xpath="//td[@class='leaveTypeDeleteCell last active']")
	//@FindBy(xpath="(//td[@class='leaveTypeNameCell'])[13]/..//td[@class='leaveTypeDeleteCell last active']")
	@FindBy(xpath="(//td[@class='leaveTypeNameCell'])[13]")
	private WebElement deletelink;
	
	public Leave_Type(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void leavetypeMethod()
	{
		leavetypelink.click();
	}
	public void createleaveMethod()
	{
		createleavetypelink.click();
	}
	public void createnewleavetypeMethod()
	{
		createnewleavetypelink.sendKeys("Runing");
	}
	public void createnewMethod()
	{
		createnew.click();
	}
	public void deleteMethod()
	{
		deletelink.click();
	}
	public void okbuttonMethod() throws InterruptedException
	{
		//Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();  //initialize WebDriver Globally to access the any whare in side class;
		alt.accept();
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",deletelink );*/
	}
}
