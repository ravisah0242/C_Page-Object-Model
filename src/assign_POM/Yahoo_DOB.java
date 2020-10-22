package assign_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Yahoo_DOB 
{
	public WebDriver driver; 	//initialize WebDriver Globally to access the any whare in side class;
	
	@FindBy(id="usernamereg-firstName")
	private WebElement firstnameTextfaild;
	
	@FindBy(id="usernamereg-lastName")
	private WebElement lastnameTextfails;
	
	@FindBy(id="usernamereg-yid")
	private WebElement emailidTextfaild;
	
	@FindBy(id="usernamereg-password")
	private WebElement passwordTextfaild;
	
	@FindBy(xpath="(//select[@aria-required='true'])[1]")
	private WebElement contrycodelist;
	
	@FindBy(id="usernamereg-phone")
	private WebElement phonenoTextfaild;
	
	@FindBy(xpath="(//select[@aria-required='true'])[2]")
	private WebElement monthdroupdownlist;
	
	@FindBy(id="usernamereg-day")
	private WebElement selectdatelink;
	
	@FindBy(id="usernamereg-year")
	private WebElement selectyearslink;
	
	@FindBy(id="usernamereg-freeformGender")
	private WebElement selectgenderlink;
	
	public Yahoo_DOB(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void firstnameTextfaildMathod()
	{
		firstnameTextfaild.sendKeys("Ravi");
	}
	public void lastnameTextfaildMathod()
	{
		lastnameTextfails.sendKeys("sah");
	}
	public void emailidTextfaildMethod()
	{
		emailidTextfaild.sendKeys("raviranjankumar000@gmail.com");
	}
	public void passwordTextfaild()
	{
		passwordTextfaild.sendKeys("ravi.8888");
	}
	public void contrycodeMethod()
	{
		Select sel=new Select(contrycodelist);
		sel.selectByValue("AS");
	}
	public void phonenoTextfaildMathod()
	{
		phonenoTextfaild.sendKeys("9887978766");
	}
	public void monthdroupdownlistMethod()
	{
		Select selmonth=new Select(monthdroupdownlist);
		selmonth.selectByVisibleText("April");
	}
	public void DateselectMethod()
	{
		selectdatelink.sendKeys("25");
	}
	public void yearselectMethod()
	{
		selectyearslink.sendKeys("1995");
	}
	public void GenderselectMethod()
	{
		selectgenderlink.sendKeys("Male");
	}
}
