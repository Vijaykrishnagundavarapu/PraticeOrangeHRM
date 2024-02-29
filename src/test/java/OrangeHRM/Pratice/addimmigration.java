package OrangeHRM.Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class addimmigration extends login {
	@AfterMethod
	public void AddImmigration(){

        WebDriver driver = login.driver;

		WebElement myinfo =  driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		myinfo.click();
		
		
		WebElement immigration = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
		immigration.click();
		
		WebElement addinfo = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		addinfo.click();
		
		WebElement radio1 = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]"));
		radio1.click();

		
		WebElement passnumber = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		passnumber.click();
		passnumber.sendKeys("VA1356");
		
		WebElement issuedate = driver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[1]"));
		issuedate.click();
		issuedate.sendKeys("07-04-2013");
		
		WebElement expirydate = driver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[2]"));
		expirydate.click();
		expirydate.sendKeys("05-09-2033");

		WebElement eligiblestatus = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]"));
		eligiblestatus.click();
		eligiblestatus.sendKeys("Elgible");


	
		WebElement reviewdate = driver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[3]"));
		reviewdate.click();
		reviewdate.sendKeys("21-06-2024");
		
		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("All Selected Details are Valid");
		
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		
	}
	
}

		
		


