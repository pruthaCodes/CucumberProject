package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
public WebDriver driver;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		
		System.out.println("lets open browser");
		String path= "P:\\Testing IT\\Google chrome\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",path);
		driver= new ChromeDriver();
		
		
		//driver=new FirefoxDriver(); 
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() throws InterruptedException {
		//driver.findElement(By.id("txtUsername")).clear();
		System.out.println("URL Launch");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);

	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		System.out.println("click Login");
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println("On home page");
		driver.close();
	}
	
	
	
}

	
	
	

