package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program39 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=17538921952066937183&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2371562");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links in the page are :"+links.size());
		Thread.sleep(2000);
		for(int i=0;i<links.size();i++)
		{
			WebElement a=links.get(i);
			String urli=a.getAttribute("href");
			
			System.out.println(urli);
		}

	}

}

