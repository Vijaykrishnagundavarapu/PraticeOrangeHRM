package OrangeHRM.Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class addattachmentinimmigration extends login {
	@AfterMethod
	public void Attachment(){
		
		WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		myInfo.click();
		System.out.println("Clicked on myinfo");
		
		WebElement imme = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
		imme.click();
		System.out.println("Clicked on Immgration");
		
		WebElement addbutton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[2]"));
		addbutton.click();
		
		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));

		upload.sendKeys("C:\\Users\\gvija\\OneDrive\\Pictures\\screenshot.png");
		
		
		WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
		comments.click();
		comments.sendKeys("screenshot is good ");
		
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		
		
	}


}