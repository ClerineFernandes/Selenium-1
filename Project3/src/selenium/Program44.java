package selenium;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Program44 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(signin).perform();
		WebElement e1=driver.findElement(By.linkText("Sign in"));
		e1.click();
		driver.findElement(By.id("ap_email")).sendKeys("clerine20@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Sptc300#er");
		driver.findElement(By.id("signInSubmit")).click();
	    
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		WebElement shoes=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[30]"));
		shoes.click();
		Set<String> a2=driver.getWindowHandles();
		System.out.println(a2);
		Iterator<String> pcid=a2.iterator();
		String pid=pcid.next();
		String cid=pcid.next();
	    driver.switchTo().window(cid);
	    Thread.sleep(2000);
	    WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();
        Thread.sleep(2000);
        WebElement proceed=driver.findElement(By.name("proceedToRetailCheckout"));
        proceed.click();
        
		
		
		
		
	}

}
