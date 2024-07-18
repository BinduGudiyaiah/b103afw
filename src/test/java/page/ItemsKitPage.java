package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ItemsKitPage {
	
	@FindBy(xpath = "//div[text()='Kit ID']")
	WebElement KitID;
	
	@FindBy(xpath = "//div[text()='Barcode']")
	WebElement Barcode;
	
	@FindBy(xpath = "//div[text()='Item Kit Name']")
	WebElement ItemKitName;
	
	@FindBy(xpath = "//div[text()='Item Kit Description']")
	WebElement ItemKitDescription;
	
	@FindBy(xpath = "//div[text()='Wholesale Price']")
	WebElement WholesalePrice;
	
	@FindBy(xpath = "//div[text()='Retail Price']")
	WebElement RetailPrice;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement SearchTxtBx;
	
	@FindBy(xpath = "//td[@class='bs-checkbox print_hide']//..//..//td[4]")
	WebElement SearchedTxt;
	
	public void SearchTxtBx() {
		SearchTxtBx.sendKeys("Cricket Kit");
	}
	
	
	
	public boolean verify_KitID(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(KitID));
			Reporter.log("KitID is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("KitID is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_Barcode(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(Barcode));
			Reporter.log("Barcode is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("Barcode is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_ItemKitName(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(ItemKitName));
			Reporter.log("ItemKitName is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("ItemKitName is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_ItemKitDescription(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(ItemKitDescription));
			Reporter.log("ItemKitDescription is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("ItemKitDescription is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_WholesalePrice(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(WholesalePrice));
			Reporter.log("WholesalePrice is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("WholesalePrice is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_RetailPrice(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(RetailPrice));
			Reporter.log("RetailPrice is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("RetailPrice is NOT displayed",true);
			return false;
		}
	}
	
}
