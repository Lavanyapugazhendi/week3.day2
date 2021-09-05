package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//In the search box, type as "bags" and press enter
	driver.findElement(By.name("searchVal")).sendKeys("Bags", Keys.ENTER);
	//To the left  of the screen under " Gender" click the "Men"
	driver.findElement(By.xpath("//label[@class = 'facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	// Under "Category" click "Fashion Bags"
	driver.findElement(By.xpath("//label[@class = 'facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	//Print the count of the items Found. 
	String ItemsCount = driver.findElement(By.xpath("//div[@class = 'length']")).getText();
	System.out.println("The Items found in the Fashion Bags are " + ItemsCount  );
	
	//Get the list of brand of the products displayed in the page and print the list.
	List <WebElement> brandList = driver.findElements(By.xpath("//div[@class = 'brand']"));
	
	for (int i = 0; i < brandList.size(); i++) {
		System.out.println(brandList.get(i).getText());
		
     //Get the list of names of the bags and print it
		System.out.println("**********No.of.Bags**********");
		
		List<WebElement> BagName = driver.findElements(By.xpath("//div[@class = 'name']"));
		for (int j = 0; j < BagName.size(); j++) {
			System.out.println(BagName.get(j).getText());
			
		}
		
	}
	
	
	

	}

}
