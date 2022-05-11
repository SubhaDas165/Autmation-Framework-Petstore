package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import excelUtility.ExcelReader;

public class Registration_Page {
	WebDriver driver;
	ExcelReader er;
	By uname=By.name("username");
	By password=By.name("password");
	By rpassword=By.name("repeatedPassword");
	By fname=By.name("account.firstName");
	By lname=By.name("account.lastName");
	By email=By.name("account.email");
	By phno=By.name("account.phone");
	By add1=By.name("account.address1");
	By add2=By.name("account.address2");
	By city=By.name("account.city");
	By state=By.name("account.state");
	By zip=By.name("account.zip");
	By country=By.name("account.country");

	public Registration_Page(WebDriver driver) throws Exception {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\Automation Framework PetStore\\Data Source\\Registration Data.xlsx";
		er=new ExcelReader(path);
	}
	
	public void register_New_User() {
		int totalrow=er.getRowCount(0);
		for (int i = 0; i < totalrow; i++) {
			
				driver.findElement(uname).sendKeys(er.getData(0, i, 0));
				driver.findElement(password).sendKeys(er.getData(0, i, 1));
				driver.findElement(rpassword).sendKeys(er.getData(0, i, 2));
				driver.findElement(fname).sendKeys(er.getData(0, i, 3));
				driver.findElement(lname).sendKeys(er.getData(0, i, 4));
				driver.findElement(email).sendKeys(er.getData(0, i, 5));
				
				driver.findElement(phno).sendKeys(er.getIntData(0, i, 6)+"");
				driver.findElement(add1).sendKeys(er.getData(0, i, 7));
				driver.findElement(add2).sendKeys(er.getData(0, i, 8));
				driver.findElement(city).sendKeys(er.getData(0, i, 9));
				driver.findElement(state).sendKeys(er.getData(0, i, 10));
				driver.findElement(zip).sendKeys(er.getIntData(0, i, 11)+"");
				driver.findElement(country).sendKeys(er.getData(0, i, 12));
				
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[1]/td[2]/select/option[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[2]")).click();
				driver.findElement(By.name("account.listOption")).click();
				driver.findElement(By.name("account.bannerOption")).click();
				
				driver.findElement(By.name("newAccount")).click();
				if(driver.getTitle().equals("HTTP Status 500 – Internal Server Error")) {
					System.out.println("This user is already exists");
					System.out.println("Login using yours credentials");
					driver.navigate().to("https://petstore.octoperf.com/actions/Account.action?signonForm=");
				}else {
					System.out.println("Test case pass");
					System.out.println("Succesfully registration done");
					driver.findElement(By.linkText("Sign In")).click();
				}
				
				login_Check(i);
				

			}
			
		
		
	}
	public void login_Check(int k) {
		
		driver.findElement(By.name("username")).sendKeys(er.getData(0, k, 0));
		System.out.println("User name is: "+er.getData(0, k, 0));
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys(er.getData(0, k, 1));
		System.out.println("Password is: "+er.getData(0, k, 1));
		driver.findElement(By.name("signon")).click();
		System.out.println("succesfully signin");
		driver.findElement(By.linkText("Sign Out")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.linkText("Register Now!")).click();
	}


}
