package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage {

	@FindBy(id = "input-username")
	private WebElement unTB;

	@FindBy(id = "input-password")
	private WebElement pwTB;

	@FindBy(name = "login-button")
	private WebElement goBTN;

	@FindBy(xpath = "//div[@class='error']")
	private WebElement errMsg;

	@FindBy(xpath = "//img[contains(@src, 'company_logo1.png')]")
	private WebElement Logo;

	@FindBy(xpath = "//h3[text()='Welcome to OSPOS!']")
	private WebElement Welcomemsg;

	@FindBy(xpath = "//span[text()='Open Source Point of Sale']")
	private WebElement Footermsg;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String un) {
		unTB.sendKeys(un);
	}

	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}

	public void clickGoButton() {
		goBTN.click();
	}

	public boolean verifyLogo(WebDriverWait wait) {

		try {
			wait.until(ExpectedConditions.visibilityOf(Logo));
			Reporter.log("Logo is displayed", true);
			return true;

		}

		catch (Exception e) {
			Reporter.log(e.getMessage(), true);
			Reporter.log("Logo is NOT displayed", true);
			return false;
		}

	}

	public boolean verifyWelcomemsg(WebDriverWait wait) {

		try {
			wait.until(ExpectedConditions.visibilityOf(Welcomemsg));
			Reporter.log("Welcomemsg is displayed", true);
			return true;

		}

		catch (Exception e) {
			Reporter.log(e.getMessage(), true);
			Reporter.log("Welcomemsg is NOT displayed", true);
			return false;
		}

	}

	public boolean verifyunTB(WebDriverWait wait) {

		try {
			wait.until(ExpectedConditions.visibilityOf(unTB));
			Reporter.log("unTB is displayed", true);
			return true;

		}

		catch (Exception e) {
			Reporter.log(e.getMessage(), true);
			Reporter.log("unTB is NOT displayed", true);
			return false;
		}

	}

	public boolean verifypwTB(WebDriverWait wait) {

		try {
			wait.until(ExpectedConditions.visibilityOf(pwTB));
			Reporter.log("pwTB is displayed", true);
			return true;

		}

		catch (Exception e) {
			Reporter.log(e.getMessage(), true);
			Reporter.log("pwTB is NOT displayed", true);
			return false;
		}

	}

	public boolean verifyFootermsg(WebDriverWait wait) {

		try {
			wait.until(ExpectedConditions.visibilityOf(Footermsg));
			Reporter.log("Footermsg is displayed", true);
			return true;

		}

		catch (Exception e) {
			Reporter.log(e.getMessage(), true);
			Reporter.log("Footermsg is NOT displayed", true);
			return false;
		}

	}
	
	public boolean verifyGoBtn(WebDriverWait wait) {

		try {
			wait.until(ExpectedConditions.visibilityOf(goBTN));
			Reporter.log("goBTN is displayed", true);
			return true;

		}

		catch (Exception e) {
			Reporter.log(e.getMessage(), true);
			Reporter.log("goBTN is NOT displayed", true);
			return false;
		}

	}

	public boolean verifyErrMsgIsDisplayed(WebDriverWait wait) {
		try {
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			Reporter.log("Err Msg is displayed", true);
			return true;
		} catch (Exception e) {
			Reporter.log(e.getMessage(), true);
			Reporter.log("Err Msg is NOT displayed", true);
			return false;
		}
	}
}
