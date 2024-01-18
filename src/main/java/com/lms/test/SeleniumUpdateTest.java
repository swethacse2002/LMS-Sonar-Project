//package com.lms.test;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class SeleniumUpdateTest {
//
//	
//		WebDriver driverUpdate;
//		
//		
//		@BeforeClass
//		public void initializer()
//		{
//			System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
//			
//			
//		}
//		
//		@Test
//		public void loadGooglePage() {
//			
//			driverUpdate = new ChromeDriver();
//
//			driverUpdate.navigate().to("http://localhost:4200/");
//			
//		}
//		
//		@Test
//		public void update() {
//			
////			driver = new ChromeDriver();
////			driver.navigate().to("http://localhost:4200/");
//			
//			//driverUpdate.findElement(By.id("mat-tab-label-0-1")).click();
//			driverUpdate.findElement(By.name("lid")).sendKeys("101");
//			driverUpdate.findElement(By.name("brandName")).sendKeys("A12");
//			driverUpdate.findElement(By.name("modelName")).sendKeys("FHA2");
//			driverUpdate.findElement(By.name("price")).sendKeys("60000");
//			
//
//
//			driverUpdate.findElement(By.name("Update")).click();
//			System.out.println(driverUpdate.getTitle());
//		}
//		
//		@AfterClass
//		public void close() {
//		driverUpdate.quit();
//
//		}
//		
//
//	public static void main(String[] args) {
//		
//		SeleniumUpdateTest obj1 = new SeleniumUpdateTest();
//		obj1.loadGooglePage();
//		
//		obj1.update();
//		//obj1.close();
//		
//		
//	}
//
//	}
