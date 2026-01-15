package Sel.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	    String actualText=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
	    String expectedText="Orangehrm";
	    if(actualText.equals(expectedText)) {
	    	System.out.println("login");
	    }
	    else {
	    	System.out.println("not login");
	    }

    }
}

	