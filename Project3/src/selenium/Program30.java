package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program30 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement t1=driver.findElement(By.id("twotabsearchtextbox"));
		t1.sendKeys("Mouse");
		Thread.sleep(3000);
		List<WebElement> t2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		t2.get(t2.size()-6).click();
		
	}
}
