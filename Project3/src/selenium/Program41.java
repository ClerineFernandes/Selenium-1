//Link text Program
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program41 {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links in the page are:"+links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement a=links.get(i);
			String text_message=a.getText();
			System.out.println(text_message);

	}

	}}
