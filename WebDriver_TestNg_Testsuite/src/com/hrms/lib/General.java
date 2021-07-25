package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class General extends Global{
	public void openApplication () {
	System.setProperty("webdriver.gecko.driver","C:\\jar files\\geckodriver.exe");
	 driver  = new FirefoxDriver();
	driver.navigate().to(url);
	driver.manage().window().maximize();
	System.out.println("Application opened");
	}
	public void Closebrowser() throws Exception {
	driver.quit();
	System.out.println("Application Closed");
	}
	public void login() throws Exception {
		driver.findElement(By.xpath(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		System.out.println("login completed Sucessfully");
	}

    public void logout() throws Exception{
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed Sucessfully");
}
	
	public void AddEmployee()throws Exception {
		//Entering into the frame
				driver.switchTo().frame("rightMenu");
				//clicking on Add Employee
				driver.findElement(By.xpath("//body/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).click();
				driver.findElement(By.name(lastName)).sendKeys(u1);
				driver.findElement(By.name(firstName)).sendKeys(u2);
				driver.findElement(By.name(middleName)).sendKeys(u3);
				driver.findElement(By.name(Nickname)).sendKeys(u4);
				driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
				Thread.sleep(3000);
				System.out.println("New Employee Added");	
				// To exit from Frame
				driver.switchTo().defaultContent();	
		}
public void DeleteEmployee()throws Exception {
	//Entering into the frame
			driver.switchTo().frame("rightMenu");
			//DROP DOWN FOR SELECTING EMP ID
			 Select DD = new Select(driver.findElement(By.xpath("//select[@id='loc_code']")));	
			 DD.selectByIndex(1);
			 //SEARCH EMPLOYEE ID 
			 driver.findElement(By.id("loc_name")).sendKeys("0017");
			 System.out.println("Entered id number");
			 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/input[2]")).click();
			 //CLICK ON CHECK BOX
			 driver.findElement(By.xpath("//input[@id='allCheck']")).click();
			 System.out.println("clicked on check box");
			 driver.findElement(By.className("plainbtn")).click();
			 System.out.println("DELETED EMPLOYEE SUCESSFULLY");
			// To exit from Frame
				driver.switchTo().defaultContent();
}
}