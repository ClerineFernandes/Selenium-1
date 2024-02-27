package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program24 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		String s=driver.getTitle();
		System.out.println(s);
		String s1[]=s.split(" ");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		System.out.println(s1[3]);
		System.out.println(s1[4]);
		System.out.println(s1[5]);
		System.out.println(s1[6]);
		System.out.println(s1[7]);
		System.out.println(s1[8]);
		
		
		

	}

}
