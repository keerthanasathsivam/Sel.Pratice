package Sel.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		//System.out.print(driver.getTitle());
        String actualTitle=driver.getTitle();
        System.out.println("actual title");
        String expectedTitle="www.opencart.com";
        if(actualTitle.equals(expectedTitle)) {
        	System.out.println("verify");
        }
        else {
        	System.out.println(" not a verify");
        	
        }
	}

}
