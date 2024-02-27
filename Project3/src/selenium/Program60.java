package selenium;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program60 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	
		int iterations = 10;

        for (int i = 0; i < iterations; i++) {
        	JavascriptExecutor jse=driver;
    	
    		jse.executeScript("window.scrollBy(0,1000)");
    		Thread.sleep(10000);
    		jse.executeScript("window.scrollBy(0,-5000)");
        }
		

	}

}
