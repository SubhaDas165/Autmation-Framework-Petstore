package testcase;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browserImplementation.Browser_Launch;
import pages.Registration_Page;

public class Verify_Registration_Page {
	static WebDriver driver=null;
	static Browser_Launch obj;
	static Registration_Page rp;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
		driver.findElement(By.linkText("Enter the Store")).click();
		driver.findElement(By.linkText("Sign In")).click();		
		driver.findElement(By.linkText("Register Now!")).click();

		
		rp=new Registration_Page(driver);
		rp.register_New_User();
		
		driver.quit();
	}

}
