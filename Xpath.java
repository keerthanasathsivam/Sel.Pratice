package Sel.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	//	WebElement nameField = driver.findElement(
			    //By.xpath("//label[text()='Name:']/following-sibling::input[1]"));
		//nameField.sendKeys("keerthana");
		driver.findElement(By.xpath("//label[text()='Name:']/following-sibling::input[1]")).sendKeys("abi");
		driver.findElement(By.xpath("//label[text()='Email:']/following-sibling::input")).sendKeys("abi01@gmail.com");
		driver.findElement(By.xpath("//label[text()='Phone:']/following-sibling::input")).sendKeys("9632587415");
		driver.findElement(By.xpath("//label[text()='Address:']/following-sibling::textarea")).sendKeys("EB Nagar Erode");
		driver.findElement(By.xpath("//input[@id='female']/parent::div")).click();
		driver.findElement(By.xpath("//input[@id='saturday']/parent::div")).click();
		WebElement countryDropdown=driver.findElement(By.xpath("(//label[text()='Country:']/following::select)[1]"));
		Select select=new Select(countryDropdown);
		select.selectByVisibleText("India");
		WebElement colorsDropdown=driver.findElement(By.xpath("(//label[text()='Colors:']/following::select)[1]"));
        Select select1=new Select(colorsDropdown);
        select1.selectByVisibleText("Green");
        WebElement sortedListDropdown=driver.findElement(By.xpath("(//label[text()='Sorted List:']/following-sibling::select)[1]"));
        Select select2=new Select(sortedListDropdown);
        select2.selectByVisibleText("Dog");
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/15/2026");
	}

}
