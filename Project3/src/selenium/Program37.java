package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program37 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/a849923/OneDrive%20-%20Eviden/Desktop/learningHTML1.html");
		WebElement checkbox=driver.findElement(By.xpath("html/body/input[6]"));
		checkbox.click();
		Thread.sleep(1000);
		if(checkbox.isSelected()==true)
		{
			System.out.println("Click on submit");
		}
		else
		{
			checkbox.click();
		}
		
		

		
	}

}
