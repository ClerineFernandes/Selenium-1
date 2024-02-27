package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	
		public static void main(String[] args) {
			ChromeDriver c1=new ChromeDriver();
			c1.get("https://grotechminds.com/registration/");
			//System.out.println(c1.getWindowHandle());
			//System.out.println(c1.getWindowHandles());
			System.out.println(c1.getTitle());
			 
			c1.findElement(By.id("Username")).sendKeys("clerine123");
			

	}

	

}
