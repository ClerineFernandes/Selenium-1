//Program to hoverover fashion and click on mens shirt
package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program51 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement fashion=driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
		Thread.sleep(3000);
		Actions a1=new Actions(driver);
		a1.moveToElement(fashion).perform();
		WebElement Mens_Tshirt=driver.findElement(By.linkText("Men's T-Shirts"));
		Mens_Tshirt.click();
	
		

	}

}
