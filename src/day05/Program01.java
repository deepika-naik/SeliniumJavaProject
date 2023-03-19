package day05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Program01 {

	public static void main(String[] args) {
		WebDriver driver;
		
		
	driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	List<WebElement>headers
	=driver.findElements(By.xpath("//table[@class='dataTable']//th"));
	if(headers.size()==5)
	{
		for(WebElement xpath:headers)
		{
			System.out.println(xpath.getText());
		}
	}
		
	else
	{
		
		System.out.println("headers size not match");

		
		
		
		
		
		
	}

}}
