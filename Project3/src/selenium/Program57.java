//Print all the options present in the dropdown.
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program57 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement drop_down=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(drop_down);
		s1.selectByIndex(1);
		List<WebElement> count1=s1.getOptions();
		int count=count1.size();
		System.out.println(count);
		for(int i=0;i<count1.size();i++)
		{
			WebElement a=count1.get(i);
			String Text_message=a.getText();
			System.out.println(Text_message);
		}
		
		
		
	}

}
