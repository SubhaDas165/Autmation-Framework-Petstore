package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing_Page {
	WebDriver driver;
	By EnterStore=By.linkText("Enter the Store");
	public Landing_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void click_EnterStrore() {
		driver.findElement(EnterStore).click();
	}
	public void verify_Title() {
		String exTitle="JPetStore Demo";
		String acTitle=driver.getTitle();
		System.out.println("The captured welcome title is"+acTitle);
		if(exTitle.equalsIgnoreCase(acTitle)) {
			System.out.println("Title matched: Test Case Pass ");
		}else {
			System.out.println("Titleis not matched: Test Case failed ");
		}
	}
	public void verify_WelcomeMessage() {
		String exmsg="Welcome to JPetStore 6";
		String acmsg=driver.findElement(By.xpath("//*[@id=\"Content\"]/h2")).getText();
		System.out.println("The captured welcome title is"+acmsg);

		if(exmsg.equalsIgnoreCase(acmsg)) {
			System.out.println("Welcome message matched: Test case pass");
		}else {
			System.out.println("Welcome message is not matched: Test case failed");
		}
	}
	public void verify_Copyright_Message() {
		String exCrMsg="Copyright www.mybatis.org";
		String acCrMsg=driver.findElement(By.xpath("//*[@id=\"Content\"]/p[2]/sub")).getText();
		System.out.println("The captured welcome title is"+acCrMsg);
		if(exCrMsg.equalsIgnoreCase(acCrMsg)) {
			System.out.println("CopyRight message matched: Test case pass");
		}else {
			System.out.println("CopyRight message is not matched: Test case failed");

		}
	}

}
