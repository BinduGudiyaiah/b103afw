package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;

public class HomePage {

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBTN;
	
	@FindBy(xpath="//h3[text()='Welcome to OSPOS, click a module below to get started.']")
	private WebElement Welcomemsg;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicklogoutBTN() {
		logoutBTN.click();
	}
	
	public void clickItemKitsIcon() {
		ItemKitsIcon.click();
	}
	
	@FindBy(xpath="//a[@title='Customers']")
	private WebElement CustIcon;
	
	@FindBy(xpath="//a[@title='Items']")
	private WebElement ItemIcon;
	
	@FindBy(xpath="//a[@title='Item Kits']")
	private WebElement ItemKitsIcon;
	
	@FindBy(xpath="//a[@title='Suppliers']")
	private WebElement SupplierIcon;
	
	@FindBy(xpath="//a[@title='Reports']")
	private WebElement ReportsIcon;
	
	@FindBy(xpath="//a[@title='Receivings']")
	private WebElement ReceivingIcon;
	
	@FindBy(xpath="//a[@title='Sales']")
	private WebElement SalesIcon;
	
	@FindBy(xpath="//a[@title='Gift Cards']")
	private WebElement GiftCardIcon;
	
	@FindBy(xpath="//a[@title='Messages']")
	private WebElement MsgIcon;
	
	@FindBy(xpath="//a[@title='Expenses']")
	private WebElement ExpensesIcon;
	
	@FindBy(xpath="//a[@title='Cashups']")
	private WebElement CashupsIcon;
	
	@FindBy(xpath="//a[@title='Office']")
	private WebElement OfficeIcon;
	
	@FindBy(xpath="//button[@title='New Item Kit']")
	private WebElement NewItemKitBTN;
	
	public boolean verify_NewItemKitBTN(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(NewItemKitBTN));
			Reporter.log("NewItemKitBTN is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("NewItemKitBTN is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_CustIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(CustIcon));
			Reporter.log("CustIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("CustIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_ItemIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(OfficeIcon));
			Reporter.log("ItemIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("ItemIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_ItemKitsIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(ItemKitsIcon));
			Reporter.log("ItemKitsIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("ItemKitsIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_SupplierIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(SupplierIcon));
			Reporter.log("SupplierIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("SupplierIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_ReportsIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(ReportsIcon));
			Reporter.log("ReportsIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("ReportsIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_ExpensesIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(ExpensesIcon));
			Reporter.log("ExpensesIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("ExpensesIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_CashupsIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(CashupsIcon));
			Reporter.log("CashupsIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("CashupsIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_ReceivingIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(ReceivingIcon));
			Reporter.log("ReceivingIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("ReceivingIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_SalesIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(SalesIcon));
			Reporter.log("SalesIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("SalesIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_GiftCardIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(GiftCardIcon));
			Reporter.log("GiftCardIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("GiftCardIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_MsgIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(MsgIcon));
			Reporter.log("MsgIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("MsgIcon is NOT displayed",true);
			return false;
		}
	}
	
	public boolean verify_OfficeIcon(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(OfficeIcon));
			Reporter.log("OfficeIcon is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("OfficeIcon is NOT displayed",true);
			return false;
		}
	}
		
	
	public boolean verifyHomePageIsDisplayed(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(logoutBTN));
			Reporter.log("Homepage is displayed",true);
			return true;
		}
		catch (Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Reporter.log("Homepage is NOT displayed",true);
			return false;
		}
	}
	
}
