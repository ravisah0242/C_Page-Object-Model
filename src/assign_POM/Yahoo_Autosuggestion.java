package assign_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yahoo_Autosuggestion
{
	@FindBy(id="header-search-input")
	private WebElement searchTextfield;
	
	@FindBy(xpath="//b[contains(text(),'eclips')]")
	private List<WebElement> suggestions;
	
	
	public Yahoo_Autosuggestion(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchMethod() throws InterruptedException
	{
		searchTextfield.sendKeys("eclips");
		Thread.sleep(2000);
		System.out.println(suggestions.size());
		for(int i=0; i<suggestions.size(); i++)
		{
			System.out.println(suggestions.get(i).getText());
		}
	}
	/*for(int i=0; i<=suggestions.size(); i++)
	{
		if(suggestions.get(i).getText().equalsIgnoreCase("eclips for java"))
		{
			suggestions.get(i).click();
		}
	}*/
}
