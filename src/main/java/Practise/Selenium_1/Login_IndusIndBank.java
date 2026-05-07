package Practise.Selenium_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_IndusIndBank 
{
	  static   WebDriver driver;
	
   public static void main(String[] args) throws InterruptedException
	
    { 
    	//System.setProperty("webdriver.edge.driver","C:\\Users\\Gouthami\\Downloads\\edgedriver_win64_138Version\\msedgedriver.exe");
    	//WebDriverManager.edgedriver().setup();
	   WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	//driver = new EdgeDriver();
        driver.get("https://uatinduseasycredit.indusind.com/customer/personal-loan/new-lead");
        
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
    	
        By inputPANNumber = By.id("lead_input_panNumber");   	
    	driver.findElement(inputPANNumber).sendKeys("QQQPA1221A");
    	Thread.sleep(2000);

    	By inputMobileNumber = By.id("lead_input_mobileNumber");   	
    	driver.findElement(inputMobileNumber).sendKeys("6666655560");
    	Thread.sleep(2000);

        By buttonNEXT = By.id("lead_button_NEXT");
    	driver.findElement(buttonNEXT).click();
    	Thread.sleep(2000);

    	By inputOTP = By.id("lead_input_OTP");
    	driver.findElement(inputOTP).sendKeys("123456");
    	Thread.sleep(4000);
    	
    	By buttonNextPopup = By.xpath(".//button[@class='mat-focus-indicator btn-red mat-stroked-button mat-button-base'][1]");
    	driver.findElement(buttonNextPopup).click();
    	Thread.sleep(2000);
    	    	

    	By inputFirstName = By.id("bd_input_firstName");
    	driver.findElement(inputFirstName).sendKeys("Henry");
    	Thread.sleep(2000);

    	By middleName = By.id("middleName");
    	driver.findElement(middleName).sendKeys("PI");
    	Thread.sleep(2000);

    	By inputLastName = By.id("bd_input_LastName");
    	driver.findElement(inputLastName).sendKeys("Stalin");
    	Thread.sleep(2000);
    	
    	
    	//*[@id='mat-select-value-1']/span/span[text()='INDIAN']");
    	//Thread.sleep(2000);
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	By nationality = By.xpath("(//span[@class='mat-select-min-line ng-tns-c216-53 ng-star-inserted'])[1]");
    	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(nationality));
    	
    	element.click();
    	//driver.findElement(nationality).click();
    	
    	Thread.sleep(3000);
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));    
    	By gender = By.xpath("//mat-option[@id='mat-option-3']");
    	
    			//("(//span[@class='mat-option-text'])[2]");
    	WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(gender));
    	element1.click();
    	//driver.findElement(gender).click();
    	
    	Thread.sleep(3000); 
    	/*By inputDateOfBirth = By.xpath("(//div[@class='datevalue currmonth'])[5]");
    	new Select(driver.findElement(By.className("react-datepicker__year-select"))).selectByVisibleText("1995");
    	new Select(driver.findElement(By.className("react-datepicker__month-select"))).selectByVisibleText("December");
    	driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='2']")).click();
    	Thread.sleep(2000);
    	//driver.findElement(inputDateOfBirth).click(); */
    	
    	
    	// Locate the Date of Birth input field
    	WebElement dobField = driver.findElement(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c124-57 cdk-text-field-autofill-monitored ng-touched ng-dirty ng-invalid']"));

        // Locate the calendar icon (assuming it's adjacent to the input field)
        WebElement calendarIcon = driver.findElement(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c124-57 cdk-text-field-autofill-monitored ng-touched ng-dirty ng-invalid']/following-sibling::*[contains(@class,'calendar')]"));

        // Check if error message is displayed (after form validation)
        WebElement errorMessage = driver.findElement(By.xpath("//*[contains(text(),'Date of Birth is required')]"));

        // Print confirmations
        System.out.println("DOB field present: " + dobField.isDisplayed());
        System.out.println("Calendar icon present: " + calendarIcon.isDisplayed());
        System.out.println("Error message present: " + errorMessage.isDisplayed());



    	


    	
    	By employmentType = By.xpath("//*[@id='mat-option-9']/span[text()='SELF EMPLOYED PROFESSIONAL']");
    	driver.findElement(employmentType).click();
    	Thread.sleep(2000);

    	By emailID = By.id("lead_input_emailID");
    	driver.findElement(emailID).sendKeys("Krishna23@gmail.com");
    	Thread.sleep(2000);

    	By inputCurrentPinCode = By.id("lead_input_currentPinCode");
    	driver.findElement(inputCurrentPinCode).sendKeys("600078");
    	Thread.sleep(2000);

    	By netMonthlyIncome = By.xpath("//*[@id='mat-option-18']/span[text()='300000-499999']");
    	driver.findElement(netMonthlyIncome).click();
    	Thread.sleep(2000);

    	By areYouBeingAssistedBySomeoneFromIndusIndBank = By.xpath("//*[@id='mat-option-12']/span");
    	driver.findElement(areYouBeingAssistedBySomeoneFromIndusIndBank).click();
    	Thread.sleep(2000);

    	
    	By inputECNNumber = By.id("bd_input_ecnNumber");
    	driver.findElement(inputECNNumber).sendKeys("789645028");
    	Thread.sleep(2000);

    	By inputdsaCode = By.id("bd_input_dsaCode");
    	driver.findElement(inputdsaCode).sendKeys("TestLink");
    	Thread.sleep(2000);

    	By checkBox = By.xpath(".//input[@type='checkbox']");
    	driver.findElement(checkBox).click();
    	Thread.sleep(2000);

    	By btnNext = By.id("bd_button_NEXT");
    	driver.findElement(btnNext).click();
    	Thread.sleep(2000);

    }
}
