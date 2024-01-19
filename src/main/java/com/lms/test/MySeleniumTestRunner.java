package com.lms.test;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class MySeleniumTestRunner {
//	WebDriver driverInsert;
//
//	@BeforeClass
//	public void initializer() {
//		System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
//
//	}
//
//	@Test
//	public void loadGooglePage() {
//
//		driverInsert = new ChromeDriver();
//
//		driverInsert.navigate().to("http://localhost:4200/");
//
//	}
//
//	@Test
//	public void insert() {
//
////			driver = new ChromeDriver();
////			driver.navigate().to("http://localhost:4200/");
//		driverInsert.findElement(By.name("lid")).sendKeys("109");
//		driverInsert.findElement(By.name("brandName")).sendKeys("Ah12");
//		driverInsert.findElement(By.name("modelName")).sendKeys("F12");
//		driverInsert.findElement(By.name("price")).sendKeys("60000");
//
//		driverInsert.findElement(By.name("Insert")).click();
//		System.out.println(driverInsert.getTitle());
//	}
//
//	@AfterClass
//	public void close() {
//		driverInsert.quit();
//
//	}
//
//	public static void main(String[] args) {
//
//		MySeleniumTestRunner obj = new MySeleniumTestRunner();
//		obj.loadGooglePage();
//
//		obj.insert();
//		obj.close();
//
//	}
//
//}
