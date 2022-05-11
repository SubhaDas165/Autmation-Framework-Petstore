package testcase;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserImplementation.Browser_Launch;
import configUtility.ObjectReader;
import pages.Landing_Page;

public class Verify_Landing_Page {
	static WebDriver driver=null;
	static Browser_Launch obj;
	static Landing_Page lp;

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		obj=new Browser_Launch();
		System.out.println("Enter The Browser");
		System.out.println("For Chrome Browser press 1");
		System.out.println("For Microsoft Edge Browser press 2");
		System.out.println("For FireFox Browser press 3");
		int k=sc.nextInt();
		if(k==1) {
			driver=obj.launch_Chrome();
			System.out.println("Thank you for choosing Chrome Browser");
		}
		if(k==2) {
			driver=obj.launch_Edge();
			System.out.println("Thank you for choosing Microsoft Edge");

		}
		if(k==3) {
			driver=obj.launch_FireFox();
			System.out.println("Thank you for choosing FireFox Browser");

		}
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		lp=new Landing_Page(driver);
		lp.verify_Title();
		lp.verify_WelcomeMessage();
		lp.verify_Copyright_Message();
		lp.click_EnterStrore();
	
		
		
		driver.quit();
	}

}
