//package com.lms.test;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class SeleniumDeleteTest {
//
//	
//
//		WebDriver driverDelete;
//		
//		
//		@BeforeClass
//		public void initializer()
//		{
//			System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
//				
//		}
//		
//		@Test
//		public void loadGooglePage() {
//			
//			driverDelete = new ChromeDriver();
//
//			driverDelete.navigate().to("http://localhost:4200/");
//			
//		}
//		
//		@Test
//		public void delete() {
//			
//			//driverDelete.findElement(By.id("mat-tab-label-0-2")).click();
//			driverDelete.findElement(By.name("lid")).sendKeys("109");
//			driverDelete.findElement(By.name("Delete")).click();
//			System.out.println(driverDelete.getTitle());
//		}
//		
//		@AfterClass
//		public void close() {
//		driverDelete.quit();
//
//		}
//	
//		public static void main(String[] args) {
//			
//			SeleniumDeleteTest obj= new SeleniumDeleteTest();
//			obj.loadGooglePage();
//			obj.delete();
//			obj.close();
//			
//	}
//
//}
