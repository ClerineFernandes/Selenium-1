package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Program12 {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D676742245123%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D13782043417950549376%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9303546%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2367553&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("clerine20@gmail.com");
		driver.findElement(By.xpath("(//input)[10]")).click();
		
		
		

	}

}
