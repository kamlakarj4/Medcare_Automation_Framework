package OPDpages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Un_Hold_AppointMent {

	WebDriver driver = null;

	By tab1 = By.id("tab1");
	By tab2 = By.id("tab2");
	By tab3 = By.id("tab3");
	By tab4 = By.id("tab4");
	By tab5 = By.id("tab5");
	By tab6 = By.id("tab6");
	By tab7  = By.id("tab7");
	By tab8 = By.id("tab8");
	By Menu = By.cssSelector("mat-icon[role='img']");
	By Menu2 =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By mattooltip = By.cssSelector("mat-icon[mattooltip='Menu']");

	By opd = By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[1]/div/img");
	By opd2 = By.xpath("//*[@id=\"mat-menu-panel-6\"]/div/div/div[1]/div[1]/div[1]");
	By Appointmenttypeclick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[1]");

	By sidebar = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[1]/a");
	By Appointment = By.cssSelector("a[id='200101']");
	By Appointmenttype = By.cssSelector("mat-select[ng-reflect-placeholder='Doctor']");
	By consultation = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[2]");
	By speciality = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[3]");
	By search = By.cssSelector("input[placeholder='Search']");
	By selectdoctor = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[1]/div/div[2]/div/ul/li[1]/span/button");
	By selectaappontmet = By.xpath("//*[@id='e-appointment-wrapper-6']/div[27]");                          
	By Existing = By.cssSelector("mat-radio-button[ng-reflect-value='registered']");
	By searchh = By.cssSelector("input[placeholder='Search']");
	By PatientName = By.cssSelector("input[ng-reflect-name='PatientName']");
	By clickonsearch = By.cssSelector("button[ng-reflect-message='Search']");
	By radiobuttonr =By.cssSelector("mat-radio-button[ng-reflect-value='1']");
	By gender =By.cssSelector("mat-select[ng-reflect-name='Gender']");
	By save =By.cssSelector("button[ng-reflect-message='Save']");
	By genderinput = By.xpath("//*[@id=\"mat-option-82\"]/span/ngx-mat-select-search/div/input");
	By yes =By.cssSelector("mat-icon[ ng-reflect-message='Yes']");

	By selectval  = By.cssSelector("mat-select[ng-reflect-name='IdType']");
	By passport = By.cssSelector("input[aria-label='dropdown search']");
	By PrimeryIDNumber = By.cssSelector("input[formcontrolname='IdNumber']");
	By ExpiryDate  = By.cssSelector("input[formcontrolname='idExpiry']");
	By Title = By.cssSelector("mat-select[ng-reflect-name='Title']");



	By Titleopt = By.cssSelector("input[aria-label='dropdown search']");
	By FullNmae = By.cssSelector("input[ng-reflect-placeholder='Full Name']");
	By GenderOpt = By.cssSelector("mat-select[ng-reflect-name='Gender']");
	By Gendesend = By.cssSelector("input[aria-label='dropdown search']");
	By dateOfBirth = By.cssSelector("input[ng-reflect-name='DOB']");
	By address = By.cssSelector("input[ng-reflect-placeholder='Residential Address']");
	By email = By.cssSelector("input[ formcontrolname='Email']");

	By countryPrimary = By.cssSelector("mat-select[ng-reflect-name='countryPrimary']");
	By search2 =  By.cssSelector("input[aria-label='dropdown search']");
	By state= By.cssSelector("mat-select[ng-reflect-name='statePrimary']");
	By statesend =  By.cssSelector("input[aria-label='dropdown search']");
	By City = By.cssSelector("mat-select[ng-reflect-name='cityPrimary']");
	By Citysend =  By.cssSelector("input[aria-label='dropdown search']");
	//  By Area =  By.cssSelector("input[mat-select='subDistrictPrimary']");
	//By Area =  By.xpath("//*[@id=\"mat-dialog-0\"]/app-dilog/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/form/mat-grid-list[4]/div/mat-grid-tile[4]/div/app-master-form-field");
	By Areasearch =  By.cssSelector("input[aria-label='dropdown search']");


	By post = By.cssSelector("input[ng-reflect-name='pincodePrimary']");
	By CountryCode = By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
	By CountryCodesend = By.cssSelector("input[aria-label='dropdown search']");
	By mobileNumber = By.cssSelector("input[formcontrolname='HandPhoneNumber']");
	By workcontactno = By.cssSelector("input[formcontrolname='OffciePhoneNumber']");
	By homecontactno = By.cssSelector("input[formcontrolname='HomePhoneNumber']");
	By Country = By.cssSelector("mat-select[id='mat-select-38']");
	By UploadImhe = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-dilog/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/form/div/div[1]/div/div");

	By UploadImhek = By.cssSelector("input[id='fileAttachment']");

	//Thread.sleep(8000);


	//
	By Save = By.cssSelector("mat-icon[ng-reflect-message='Save']");

	By needviptratment = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-dilog/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/form/section/div/input[1]");

	By AppointmentSerach = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/button");
	By Serach = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-appointment-quick-search/div[2]/form/mat-grid-list[4]/div/mat-grid-tile[3]/div/button");
	//By selectAppointment = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-appointment-quick-search/div[2]/div[1]/table/tbody/tr[1]");
	By selectAppointment = By.xpath("//div[contains(text(),'For Radiotherapy')]");
	
	
	
	By fromDateRange = By.cssSelector("input[ng-reflect-name='fromDateRange']");
	By toDateRange = By.cssSelector("input[ng-reflect-name='toDateRange']");
	By Appointment_1 = By.cssSelector("a[id='2001']");

	By Selectdoctor = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[1]/div/div[2]/div/ul/li[1]/span/button");
	By Day = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div/ejs-schedule/div[1]/div/div/div[3]/div[3]/button");
	By Next = By.cssSelector("div[title='Next']");
	By Selectappointment = By.xpath("//div[contains(text(),'For Consultation')]");
	
    By HoldAppointment = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[3]/div[1]/ejs-checkbox[1]");
    By Un_HoldAppointment = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[3]/div[1]/ejs-checkbox[2]");
    
    By Reason = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirm-remarks/div/form/div[2]/mat-form-field[1]/div/div[1]/div[3]/mat-select/div/div[1]/span");
    
    By SelectOpt = By.xpath("/html/body/div[2]/div[4]/div/div/div/mat-option[2]/span");
    
    By Remarks = By.cssSelector("textarea[ng-reflect-name='remark']");
    
    By Yes =By.cssSelector("mat-icon[ng-reflect-message='Yes']");
    public Un_Hold_AppointMent(WebDriver driver) {
		this.driver= driver;

	}
//String fromDateRangeA,String toDateRangeA, 
	public void NewAppontmetfunc(String AppointmenttypeA, String consultationA, String specialityA) throws InterruptedException, AWTException, IOException {
		driver.findElement(Menu).click();
		Thread.sleep(9000);
		driver.findElement(opd).click();
		Thread.sleep(10000);
		driver.findElement(sidebar).click();
		Thread.sleep(5000);
		driver.findElement(Appointment_1).click();
		Thread.sleep(5000);
		driver.findElement(Appointment).click();
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Appointment Calendar")) 
		{
			System.out.println("OPD > Appointment > Appointment page has been launched successfully"); 
		} else 
		{
			System.out.println("OPD > Appointment > Appointment page has been failed"); 
		}
		driver.findElement(Appointmenttypeclick).click();
		Thread.sleep(2000);
		driver.findElement(search).sendKeys(AppointmenttypeA);
		Thread.sleep(2000);
		driver.findElement(search).sendKeys(Keys.ENTER);
		// driver.findElement(Appointmenttype).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(consultation).click();
		Thread.sleep(2000);
		//driver.findElement(search).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		driver.findElement(search).sendKeys(consultationA);
		Thread.sleep(2000);
		driver.findElement(search).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(speciality).click();
		Thread.sleep(2000);
		driver.findElement(search).sendKeys(specialityA);
		Thread.sleep(2000);
		driver.findElement(search).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(AppointmentSerach).click();
		//Thread.sleep(2000);
		driver.findElement(Selectdoctor).click();
		Thread.sleep(4000);
		driver.findElement(Day).click();
		Thread.sleep(4000);
		driver.findElement(Next).click();
		Thread.sleep(4000);
		driver.findElement(Un_HoldAppointment).click();
		Thread.sleep(4000);
		driver.findElement(Selectappointment).click();
		Thread.sleep(4000);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ScreenShots//Un_Hold_Appointment.png"));
		Thread.sleep(4000);
	//	
		//Thread.sleep(4000);
		driver.findElement(Reason).click();
	    Thread.sleep(2000);
	    driver.findElement(SelectOpt).click();
	    Thread.sleep(2000);
		driver.findElement(Remarks).sendKeys("Holding appointment");
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Confirm")) 
		{
			System.out.println("Appointment has been Un_Hold successfully"); 
		} else 
		{
			System.out.println("Un_Holding appointment failed"); 
		}
		Thread.sleep(4000);
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File(".//ScreenShots//Select_Reason_UnHold_Appointment.png"));
		Thread.sleep(1000);
		driver.findElement(Yes).click();
		
	}
}

