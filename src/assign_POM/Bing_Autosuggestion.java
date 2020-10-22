package assign_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bing_Autosuggestion 
{
	@FindBy(id="sb_form_q")
	private WebElement searchTextfield;
	
	@FindBy(xpath="//span[contains(text(),'java')]")
	private List<WebElement> suggestaions;
	
	public Bing_Autosuggestion(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void serchMethod() throws InterruptedException
	{
		searchTextfield.sendKeys("java");
		Thread.sleep(5000);
		System.out.println(suggestaions.size());
		
		for(int i=0; i<=suggestaions.size(); i++)
		{
			System.out.println(suggestaions.get(i).getText());
		}
		/*for(int i=0; i<=suggestaions.size(); i++)
		{
			if(suggestaions.get(i).getText().equalsIgnoreCase("javatpoint"))
			{
				suggestaions.get(i).click();
			}
		}*/
	}
}
