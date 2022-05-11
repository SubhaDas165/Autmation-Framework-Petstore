package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
	WebDriver driver;
	By EnterSignin=By.linkText("Sign In");
	public Home_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void click_SignIn() {
		driver.findElement(EnterSignin).click();
	}
	public void verify_Fish_Link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img")).click();
	
		String ac=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[2]")).getText();
		String ec="Tiger Shark";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Fish Test case pass ");
		}else {
			System.out.println("Fish Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_Dog_Link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")).click();
	
		String ac=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]")).getText();
		String ec="Bulldog";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Dog Test case pass ");
		}else {
			System.out.println("Dog Test case failed");
		}
		
		driver.navigate().back();
	}
	public void verify_Reptiles_Link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[3]/img")).click();
	
		String ac=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]")).getText();
		String ec="Rattlesnake";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Reptiles Test case pass ");
		}else {
			System.out.println("Reptiles Test case failed");
		}
		
		driver.navigate().back();
	}
	public void verify_Cat_Link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[4]/img")).click();
		
		String ac=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[2]")).getText();
		String ec="Persian";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Cat Test case pass ");
		}else {
			System.out.println("Cat Test case failed");
		}
		
		driver.navigate().back();
		
	}
	public void verify_Birds_Link() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[5]/img")).click();
		
		String ac=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]")).getText();
		String ec="Amazon Parrot";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Birds Test case pass ");
		}else {
			System.out.println("Birds Test case failed");
		}
	
		driver.navigate().back();
		
	}
	public void verify_Search_Button() {
		driver.findElement(By.name("keyword")).sendKeys("fish");
		driver.findElement(By.name("searchProducts")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[3]")).getText();
		String ex="Angelfish";
		if(ac.equalsIgnoreCase(ex)) {
			System.out.println("Search button verified :Test case pass");
		}else {
			System.out.println("Test case failed");
		}
	}
	public void verify_Cart() {
		driver.findElement(By.name("img_cart")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"Cart\"]/h2")).getText();
		String ex="Shopping Cart";
		System.out.println(ac);
		if(ac.equalsIgnoreCase(ex)) {
			System.out.println("Cart verified :Test case pass");
		}else {
			System.out.println("Test case failed");
		}
	}
	public void verify_mybetis_link() {
		driver.findElement(By.linkText("www.mybatis.org")).click();
		String ac=driver.getTitle();
		String ex="The MyBatis Blog";
		if(ac.equalsIgnoreCase(ex)) {
			System.out.println("Mybetis link verified :Test case pass");
		}else {
			System.out.println("Test case failed");
		}
		driver.navigate().back();
	}

}
