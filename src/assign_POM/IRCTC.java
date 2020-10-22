package assign_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IRCTC 
{
	public WebDriver driver;	//initialize WebDriver Globally to access the any whare in side class;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement okpopuplink; 
	
	@FindBy(id="userName")
	private WebElement userTextfield;
	
	@FindBy(id="usrPwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="cnfUsrPwd")
	private WebElement conformpwdTextfield;
	
	@FindBy(xpath="(//span[@class='ui-dropdown-trigger-icon ui-clickable fa fa-fw fa-caret-down'])[1]")
	private WebElement droupdownforsecurityquation;
	
	@FindBy(xpath="//span[.='What is your pet name?']")
	private WebElement securityQuationselect;
	
	@FindBy(xpath="//input[@placeholder='Security Answer']")
	private WebElement securityAnswerTextfield;
	
	@FindBy(xpath="(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[2]")
	private WebElement PreferredLanguageselect;
	
	@FindBy(xpath="//span[.='English']")
	private WebElement selectlanguagelink;
	
	@FindBy(id="firstName")
	private WebElement firstnameTextfield;
	
	@FindBy(id="middleName")
	private WebElement middleNameTextfield;
	
	@FindBy(id="lastname")
	private WebElement lastnameTextfield;
	
	@FindBy(id="M")
	private WebElement genderselect;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	//@FindBy(xpath="//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all ng-tns-c11-6 ng-star-inserted']")
	//@FindBy(xpath="//input[@class='ng-tns-c12-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
	private WebElement DOBclander;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year ng-tns-c12-9 ng-star-inserted']")
	private WebElement yearsdroupdownlistlink;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month ng-tns-c12-9 ng-star-inserted']")
	private WebElement monthdroupdownlistlink;
	
	@FindBy(xpath="//a[.='25']")
	private WebElement daylink;
	
	@FindBy(xpath="//label[.='Select Occupation']")
	private WebElement selectoccupationlist;
	
	@FindBy(xpath="(//li[@class='ng-tns-c10-7 ui-dropdown-item ui-corner-all ng-star-inserted'])[6]")
	private WebElement selectoccupation;
	
	@FindBy(xpath="(//input[@class='ng-pristine ng-valid ng-touched'])[2]")
	private WebElement marrageSttuslink;
	
	public IRCTC(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void okpopupMethod()
	{
		okpopuplink.click();
	}
	public void userTextfieldMethod()
	{
		userTextfield.sendKeys("Ravi.004@gmail.com");
	}
	public void passwordTextfielddMethod()
	{
		passwordTextfield.sendKeys("888888888");
	}
	public void conformpwdTextfieldMethod()
	{
		conformpwdTextfield.sendKeys("888888888");
	}
	public void droupdownforsecurityquationMethod()
	{
		droupdownforsecurityquation.click();
	}
	public void securityQuationselectMethod()
	{
		securityQuationselect.click();
	}
	public void securityAnswerTextfieldMethod()
	{
		securityAnswerTextfield.sendKeys("Rahul");
	}
	public void PreferredLanguageselectMethod()
	{
		PreferredLanguageselect.click();
	}
	public void selectlanguagelinkMethod()
	{
		selectlanguagelink.click();
	}
	public void firstnameTextfieldMethod()
	{
		firstnameTextfield.sendKeys("Ravi");
	}
	public void middleNameTextfieldMethod()
	{
		middleNameTextfield.sendKeys("Ranjan");
	}
	public void lastnameTextfieldMethod()
	{
		lastnameTextfield.sendKeys("Sah");
	}
	public void genderselectMethod()
	{
		genderselect.click();
	}
	public void DOBclanderMethod() throws InterruptedException
	{
		DOBclander.click();
		yearsdroupdownlistlink.click();
		Select years=new Select(yearsdroupdownlistlink);
		Thread.sleep(2000);
		years.selectByVisibleText("1995");
		monthdroupdownlistlink.click();
		Select months=new Select(monthdroupdownlistlink);
		Thread.sleep(2000);
		months.selectByVisibleText("April");
		daylink.click();
	}
	public void selectoccupationMethod()
	{
		selectoccupationlist.click();
		selectoccupation.click();
	}
	public void marrageSttusMethod()
	{
		marrageSttuslink.click();
	}
	
}
