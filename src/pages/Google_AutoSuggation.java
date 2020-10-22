package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_AutoSuggation
{
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchTextfield;
	
	@FindBy(xpath="//span[contains(text(),'selenium')]")
	private List<WebElement> suggestions;
	
	
	public Google_AutoSuggation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchMethod() throws InterruptedException
	{
		searchTextfield.sendKeys("Selenium");
		Thread.sleep(2000);
		System.out.println(suggestions.size());
		for(int i=0; i<suggestions.size(); i++)
		{
			System.out.println(suggestions.get(i).getText());
		}
		/*for(int i=0; i<=suggestions.size(); i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("selenium interview questions"))
			{
				suggestions.get(i).click();
			}
		}*/
		
	}
	
}
