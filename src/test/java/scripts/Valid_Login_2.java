package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class Valid_Login_2 extends BaseTest
{
	@Test(priority = 1)
	public void testValidLogin()
	{
		String un = Utility.getExcelData(EXCEL_PATH, "ValidLogin",1, 0);
		String pw = Utility.getExcelData(EXCEL_PATH, "ValidLogin",1, 1);
		
//		1. enter valid user name
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(un);
//		2. enter valid password
		loginPage.setPassword(pw);
//		3. click on go button
		loginPage.clickGoButton();
//		4. verify home page is displayed
		HomePage homePage=new HomePage(driver);
		boolean result = homePage.verifyHomePageIsDisplayed(wait);
		Assert.assertTrue(result);
//		5.verify all the 12 modules
		boolean CustIcon = homePage.verify_CustIcon(wait);
		Assert.assertTrue(CustIcon);
		
		boolean ItemIcon = homePage.verify_ItemIcon(wait);
		Assert.assertTrue(ItemIcon);
		
		boolean ItemKitsIcon = homePage.verify_ItemKitsIcon(wait);
		Assert.assertTrue(ItemKitsIcon);
		
		boolean SupplierIcon = homePage.verify_SupplierIcon(wait);
		Assert.assertTrue(SupplierIcon);
		
		boolean ReportsIcon = homePage.verify_ReportsIcon(wait);
		Assert.assertTrue(ReportsIcon);
		
		boolean ReceivingIcon = homePage.verify_ReportsIcon(wait);
		Assert.assertTrue(ReceivingIcon);
		
		boolean SalesIcon = homePage.verify_SalesIcon(wait);
		Assert.assertTrue(SalesIcon);
		
		boolean GiftCardIcon = homePage.verify_GiftCardIcon(wait);
		Assert.assertTrue(GiftCardIcon);
		
		boolean MsgIcon = homePage.verify_MsgIcon(wait);
		Assert.assertTrue(MsgIcon);
		
		boolean ExpensesIcon = homePage.verify_ExpensesIcon(wait);
		Assert.assertTrue(ExpensesIcon);
		
		boolean CashupsIcon = homePage.verify_CashupsIcon(wait);
		Assert.assertTrue(CashupsIcon);
		
		boolean OfficeIcon = homePage.verify_OfficeIcon(wait);
		Assert.assertTrue(OfficeIcon);
		 
	}
}
