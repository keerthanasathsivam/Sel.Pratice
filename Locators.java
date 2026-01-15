package Sel.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Register")).click();
	    driver.findElement(By.id("gender-female")).click();
		  
	    driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("keerthana");
	    driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("S");
	    driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("keerthuguna01@gmail.com");
	    driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Keerthana@01");
	    driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Keerthana@01");
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
	   // driver.findElement(By.cssSelector("label[@id='gender-female']")).click();
	  
		

	}

}
