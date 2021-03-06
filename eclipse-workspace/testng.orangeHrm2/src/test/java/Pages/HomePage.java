package Pages;

import static org.testng.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.test.testng.orangeHrm.Base;

public class HomePage extends Base {

	// Page Factory - OR:

	@FindBy(xpath = "//input[@value='Subscribe']")
	WebElement verifySubscribe;

	@FindBy(xpath = "//span[contains(text(),'Assign Leave')]")
	WebElement assignLeave;

	@FindBy(xpath = "//b[normalize-space()='Maintenance']")
	WebElement mantainanceTab;

	@FindBy(xpath = "//input[@value='Verify']")
	WebElement verifyBtn;

	@FindBy(xpath = "//b[normalize-space()='My Info']")
	WebElement myInfotab;

	@FindBy(xpath = "//a[normalize-space()='Contact Details']")
	WebElement contactDetails;

	@FindBy(xpath = "//input[@id='btnSave']")
	WebElement editbtn;

	@FindBy(xpath = "//b[normalize-space()='Leave'] ")
	WebElement Leave;

	@FindBy(xpath = "//a[@id='menu_leave_assignLeave']")
	WebElement AssignLeave;

	@FindBy(xpath = "//input[@id='assignleave_txtEmployee_empName']")
	WebElement EmployeeName;

	@FindBy(xpath = "//select[@id='assignleave_txtLeaveType']")
	WebElement LeaveType;

	@FindBy(xpath = "//input[@id='assignleave_txtFromDate']")
	WebElement FromDate;

	@FindBy(xpath = "//input[@id='assignleave_txtToDate']")
	WebElement ToDate;

	@FindBy(xpath = "//select[@id='assignleave_duration_duration']")
	WebElement Duration;

	@FindBy(xpath = "//textarea[@id='assignleave_txtComment']")
	WebElement Comments;

	@FindBy(xpath = "//input[@id='assignBtn']")
	WebElement Assign;

	@FindBy(xpath = "//div[@class='message success fadable']")
	WebElement SuccessMesg;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	// Actions:

	public void verifySubscribebtn() {
		try {

			assertEquals(verifySubscribe.isDisplayed(), true);
		} catch (NoSuchElementException e) {
			System.err.println(e);
		}
	}

	public void verifyAssignLeave() {
		String str = assignLeave.getText();
		assertEquals(str, "Assign Leave");
	}

	public void verifyBtn() {

		mantainanceTab.click();

		boolean ver = verifyBtn.isDisplayed();

		assertEquals(ver, true);
	}

	public void verifyMyinfoEdit() {
		myInfotab.click();

		wait.until(ExpectedConditions.elementToBeClickable(contactDetails));

		boolean ver2 = editbtn.isDisplayed();
		assertEquals(ver2, true);
	}

	public void assignPageTest(String empName, String leavetype, String fromDate, String toDate, String DurationValue,
			String comments) {

		Leave.click();
		wait.until(ExpectedConditions.elementToBeClickable(AssignLeave));
		AssignLeave.click();

		wait.until(ExpectedConditions.elementToBeClickable(EmployeeName));
		EmployeeName.sendKeys(empName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Select leaveTypedropdown = new Select(LeaveType);
		leaveTypedropdown.selectByValue(leavetype);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FromDate.clear();
		FromDate.sendKeys(fromDate);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ToDate.clear();
		ToDate.sendKeys(toDate);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Select durationdrpdown = new Select(Duration);

		durationdrpdown.selectByValue(DurationValue);
		Comments.sendKeys(comments);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assign.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(SuccessMesg));
		
		boolean var=SuccessMesg.isDisplayed();
		assertEquals(var, true);

	}

}
