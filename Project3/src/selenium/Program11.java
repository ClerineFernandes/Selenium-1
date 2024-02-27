package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program11 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/a849923/OneDrive%20-%20Eviden/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(html/body/input)[1]")).sendKeys("Clerine123");
		driver.findElement(By.xpath("(html/body/input)[2]")).sendKeys("Spt");
		driver.findElement(By.xpath("(html/body/input)[3]")).sendKeys("Sptc100");
		//driver.findElement(By.xpath(" (/html/body/form)[1]/input[1])")).sendKeys("Clerine");
		//driver.findElement(By.xpath("(html/body/form)[1]/input[3])")).click();
		driver.findElement(By.tagName("a")).click();
		
		
		
		

	}

}
