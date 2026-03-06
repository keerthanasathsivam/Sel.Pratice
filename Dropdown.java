package Sel.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("keerthana");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc01@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9363696032");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Erode");
		driver.findElement(By.xpath("//input[@id='female']")).click();
		driver.findElement(By.xpath("//input[@id='saturday']")).click();
		
		
	    WebElement countryDropdown=driver.findElement(By.xpath("//select[@id='country']"));
	    Select select=new Select(countryDropdown);
	    select.selectByVisibleText("India");
		WebElement colorsDropdown=driver.findElement(By.xpath("//select[@id='colors']"));
		Select select1= new Select(colorsDropdown);
		select1.selectByVisibleText("Blue");
		WebElement sortDropdown=driver.findElement(By.xpath("//select[@id='animals']"));
		Select select2=new Select(sortDropdown);
	    select2.selectByVisibleText("Dog");
		}
		
	}



