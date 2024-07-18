package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.ItemsKitPage;
import page.LoginPage;

public class Verify_Itemskit_Page_Displayed_5 extends BaseTest {
	
	@Test(priority = 1)
	public void testVerify_Itemskit_Page_Displayed()
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
		
		HomePage homepage = new HomePage(driver);
		homepage.clickItemKitsIcon();
		
		boolean verify_NewItemKitBTN = homepage.verify_NewItemKitBTN(wait);
		Assert.assertTrue(verify_NewItemKitBTN);

		ItemsKitPage itemsKitPage = new ItemsKitPage();
		
		boolean verify_KitID = itemsKitPage.verify_KitID(wait);
		Assert.assertTrue(verify_KitID);
		
		boolean verify_Barcode = itemsKitPage.verify_Barcode(wait);
		Assert.assertTrue(verify_Barcode);
		
		boolean verify_ItemKitName = itemsKitPage.verify_ItemKitName(wait);
		Assert.assertTrue(verify_ItemKitName);
		
		boolean verify_ItemKitDescription = itemsKitPage.verify_ItemKitDescription(wait);
		Assert.assertTrue(verify_ItemKitDescription);
		
		boolean verify_WholesalePrice = itemsKitPage.verify_WholesalePrice(wait);
		Assert.assertTrue(verify_WholesalePrice);
		
		boolean verify_RetailPrice = itemsKitPage.verify_RetailPrice(wait);
		Assert.assertTrue(verify_RetailPrice);
	}

}
