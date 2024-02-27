package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program13 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=15434159631943973051&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146075&hvtargid=kwd-10573980&hydadcr=14453_2371562Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D676742245123%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D13782043417950549376%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9303546%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2367553&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	   Scanner s1 = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) 
        {
        	System.out.print("Enter country: UAE, UK, US: ");
        	String country = s1.next();
        	WebElement countryLink = driver.findElement(By.partialLinkText(country));
            countryLink.click();
        }
	}
}

		           

		      

		   
	

