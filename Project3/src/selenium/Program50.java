package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Program50 {

	public static void main(String[] args) {

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=9726611189848841120&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146075&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e).perform();
		WebElement e1=driver.findElement(By.linkText("Sign in"));
		e1.click();
		driver.findElement(By.id("ap_email")).sendKeys("clerine20@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Sptc400#er");
		driver.findElement(By.id("signInSubmit")).click();
		
		

	}

}
