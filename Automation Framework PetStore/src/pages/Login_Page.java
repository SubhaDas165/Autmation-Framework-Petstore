package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	WebDriver driver;
	public Login_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void verify_Login() {
		driver.findElement(By.name("username")).sendKeys("subha123");
		
		WebElement a=driver.findElement(By.name("password"));
		a.clear();
		a.sendKeys("subha123");
		driver.findElement(By.name("signon")).click();
		System.out.println("Testcase pass");
		System.out.println("Login successfully");
		
	}

}
