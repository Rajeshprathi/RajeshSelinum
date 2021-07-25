package com.adactin.lib;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

import java.awt.Robot;
import java.awt.event.KeyEvent;
            public class General extends Global {
	        public void openApplication() {
		       System.setProperty("webdriver.gecko.driver","C:\\jar files\\geckodriver.exe");
		       driver = new FirefoxDriver();
		       driver.navigate().to(url);
		       System.out.println("Application Opened");
}
//login 
		    public void login ()throws Exception {
			  driver.findElement(By.name(txt_loginname)).sendKeys(un);
			  driver.findElement(By.id(txt_password)).sendKeys(pw);
			  driver.findElement(By.name(btn_login)).click();
			  Thread.sleep(3000);
			 
}
 //Search a hotel
		       public void searchhotel ()throws Exception { 
			   driver.findElement(By.name("location")).click();
				Thread.sleep(3000);	
				Robot r = new Robot();
// To perform RoboClass press down arrow//Search hotel
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_ENTER);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_ENTER);
			    driver.findElement(By.name("hotels")).click();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_ENTER);
				driver.findElement(By.name("room_type")).click();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_ENTER);
  // ANOTHER WAY = SELECT VALUE FROM  DROP DOWN
  //Select select = new Select (driver.findElement(By.name("location")));
 //select.selectByIndex(4);
				driver.findElement(By.name("datepick_in")).sendKeys("21/05/2020");
				driver.findElement(By.name("datepick_out")).sendKeys("22/05/2020");
				driver.findElement(By.name("adult_room")).click();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_ENTER);
				driver.findElement(By.name("child_room")).click();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_ENTER);
				driver.findElement(By.id("Submit")).click();
				Thread.sleep(4000);
				System.out.println("Search hotel sucessfully with all Required Textdata");
  }
 //select hotel
		     public void selecthotel ()throws Exception {
			driver.findElement(By.name("radiobutton_0")).click();
			driver.findElement(By.name("continue")).click();
			Thread.sleep(4000);
			System.out.println("Select hotel sucessfully with all Required Textdata");
 }
 //Book a hotel
		     public void Bookhotel () throws Exception {
			driver.findElement(By.name("first_name")).sendKeys("Rajesh");
			driver.findElement(By.name("last_name")).sendKeys("prathi");
			driver.findElement(By.name("address")).sendKeys("hyderabad_balanagar_idplcolony");
			driver.findElement(By.name("cc_num")).sendKeys("1234567891011123");
			driver.findElement(By.name("cc_type")).click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.name("cc_exp_month")).click();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.name("cc_exp_year")).click();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_ENTER);
			System.out.println(" clicked arrowDown keys sucessfully");
			driver.findElement(By.name("cc_cvv")).sendKeys("0214");
			driver.findElement(By.name("book_now")).click();
			Thread.sleep(4000);
			System.out.println("Book hotel sucessfully with all Required Textdata");
 }
//to perform atert on diplay
		    public void Alert()throws Exception { 
			Alert a = driver.switchTo().alert();
			a.accept();
			Thread.sleep(4000);
			System.out.println("alert clicked sucessfully"); 
}
//Showing My itinerary sucessfully
		   public void myliteneracy()throws Exception {
			driver.findElement(By.name("book_now")).click();
			Thread.sleep(4000);
			driver.findElement(By.className("reg_button")).click();
			Thread.sleep(4000);
			System.out.println("Showing My itinerary sucessfully");
			Thread.sleep(4000);
		}
//log out		    
		   public void logout() {
	     driver.findElement(By.linkText(link_logout)).click();
}
				
}
			 
			 

	
	   