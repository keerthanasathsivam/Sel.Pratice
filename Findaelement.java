package Sel.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findaelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("keerthanasatha01@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Keerthu@01");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		

	}

}
