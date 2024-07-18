package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class Verify_Logout_3 extends BaseTest {
	
	@Test
	
	public void testLogout() {
		
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
		homepage.clicklogoutBTN();
		
		String Curr_Url = driver.getCurrentUrl();
		System.out.println(Curr_Url);
	}

}
