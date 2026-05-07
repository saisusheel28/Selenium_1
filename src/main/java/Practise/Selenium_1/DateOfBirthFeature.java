package Practise.Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class DateOfBirthFeature 
{
	WebDriver driver;
    //public static void main(String[] args) {
	@BeforeTest
	public void setup()
	{
        // Set path to chromedriver
    	System.setProperty("webdriver.edge.driver","C:\\Users\\Gouthami\\Downloads\\edgedriver_win64_138Version\\msedgedriver.exe");
    	
    	
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
        // Navigate to the target web page
        driver.get("https://yourwebsite.com"); // Replace with actual URL
	}
        @Test(priority=1, enabled = true)
        
        public void verifyDOBField()
    {   
        // Locate the Date of Birth input field
        WebElement dobField = driver.findElement(By.name("dateOfBirth"));

        // Locate the calendar icon (assuming it's adjacent to the input field)
        WebElement calendarIcon = driver.findElement(By.xpath("//input[@name='dateOfBirth']/following-sibling::*[contains(@class,'calendar')]"));

        // Check if error message is displayed (after form validation)
        WebElement errorMessage = driver.findElement(By.xpath("//*[contains(text(),'Date of Birth is required')]"));

        // Print confirmations
        System.out.println("DOB field present: " + dobField.isDisplayed());
        System.out.println("Calendar icon present: " + calendarIcon.isDisplayed());
        System.out.println("Error message present: " + errorMessage.isDisplayed());
    }
        @AfterTest
        // Close browser
        public void tearDown() 
     {
        driver.quit();
        
     }
}//

