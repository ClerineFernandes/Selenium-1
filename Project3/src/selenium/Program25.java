package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Program25 {

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		String links[]= {"Arab Emirates", "United kingdom","United State"};
		for(int i=0;i<links.length;i++)
		{
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText(links[i])).click();
			String title=driver.getTitle();
			System.out.println(title);
			
		}
		driver.close();
		

	}

}
