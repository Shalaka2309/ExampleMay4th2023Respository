package com.sgtesting.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteProjectCustomer {
	private static WebDriver obrowser=null;
	public static void main(String[] args) {
		lunchbrowser();
		navigate();
		login();
		minimiz();
		creatcoustmer();
		creatproject();
		creattask();
		deleattask();
		deleatproject();
		deleatcoustmer();
		logout();
		closeappliction();
	}
	private static void lunchbrowser()
	{
		try
		{
			obrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			obrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimiz()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 private static void creatcoustmer()
	    {
	    	try
	    	{
	    		obrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
	    		Thread.sleep(2000);
	    		obrowser.findElement(By.xpath("//div[text()='Add New']")).click();
	    		obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
	    		Thread.sleep(3000);
	    		obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Shravya");
	    		obrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Assigned for testing");
	    		obrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
	    		Thread.sleep(2000);
	    		
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	 private static void  creatproject()
		{
			try
			{
				obrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
				Thread.sleep(3000);
				obrowser.findElement(By.xpath("//div[text()='Add New']")).click();
				obrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Passport Login");
				obrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Login button is not working");
				Thread.sleep(2000);
				obrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	 private static void creattask()
	 {
		 try
		 {
			 obrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			 obrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			 Thread.sleep(3000);
			 obrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("buttons not working");
			 obrowser.findElement(By.id("createTasksPopup_commitBtn")).click();
			 Thread.sleep(3000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 private static void deleattask()
	 {
		 try
		 {
			 obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[2]/tbody/tr/td[2]")).click();
			 Thread.sleep(2000);
			 obrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			 obrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			 Thread.sleep(3000);
			 obrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
			 Thread.sleep(2000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 private static void deleatproject()
		{
			try
			{
				obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(3000);
				obrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
				obrowser.findElement(By.xpath("//div[text()='Delete']")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	 private static void deleatcoustmer()
	    {
	    	try
	    	{
	    	  obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
	    	  Thread.sleep(2000);
	    	  obrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
	    	  Thread.sleep(2000);
	    	  obrowser.findElement(By.xpath("//div[text()='Delete']")).click();
	    	  Thread.sleep(1000);
	    	  obrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
	    	  Thread.sleep(2000);
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	 private static void logout()
		{
			try
			{
				obrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeappliction()
		{
			try
			{
				obrowser.quit();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}



