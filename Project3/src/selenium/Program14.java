package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program14 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/a849923/OneDrive%20-%20Eviden/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Clerine Fernandes");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("cle12");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("cle123456");
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("CLERINE");
		//driver.findElement(By.xpath("(/html/body/form[1]/input[3])")).click();
		driver.findElement(By.xpath("(/html/body/form[2]/input[1])")).click();
		driver.findElement(By.xpath("(/html/body/form[2]/input[2])")).click();
		driver.findElement(By.xpath("(/html/body/form[2]/input[3])")).click();
		//driver.findElement(By.xpath("(/html/body/form[2]/input[4])")).click();
		driver.findElement(By.xpath("(/html/body/input[4])")).click();
		driver.findElement(By.xpath("(/html/body/input[5])")).click();
		driver.findElement(By.xpath("(/html/body/input[6])")).click();
		
		
		

	}

}
