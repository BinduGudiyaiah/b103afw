package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.LoginPage;

public class verify_Login_Page_Fields_1 extends BaseTest {
	
	@Test
	public void testLoginFields() {
	
	LoginPage loginPage=new LoginPage(driver);
	//1. Logo
	boolean logo = loginPage.verifyLogo(wait);
	Assert.assertTrue(logo);
	
	//2.Welcome msg
	boolean Welcomemsg = loginPage.verifyWelcomemsg(wait);
	Assert.assertTrue(Welcomemsg);
	
	//3.username 
	boolean unTB = loginPage.verifyunTB(wait);
	Assert.assertTrue(unTB);
	
	//password text box
	boolean pwTB = loginPage.verifypwTB(wait);
	Assert.assertTrue(pwTB);
	
	//4.Go Button
	boolean Footermsg = loginPage.verifyFootermsg(wait);
	Assert.assertTrue(Footermsg);
	
	//5.footer msg
	boolean GoBtn = loginPage.verifyGoBtn(wait);
	Assert.assertTrue(GoBtn);

}
}
