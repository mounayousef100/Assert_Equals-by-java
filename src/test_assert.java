import static org.testng.AssertJUnit.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;





public class test_assert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdallah\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
	driver .get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    String user_name = "standard_user";
    String password ="secret_sauce";

    driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys (user_name); 		
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys (password);
   
    driver.findElement(By.xpath("  //*[@id=\"login-button\"]")).click();
    
//    String actualTitel = driver.getTitle();
//    String expectedTitel = "Swag Labs";
//    Assert.assertEquals(actualTitel, expectedTitel); 
    int expectedItems = 6 ;
    
    List<WebElement> myButtons =driver.findElements(By.className("btn"));
    for(int i = 0 ; i<=myButtons.size(); i++ ) {
    	myButtons.get(i).click();
    }
    
    System.out.println(myButtons.size());
   String actualItemsAdd = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span ")).getText();
   int theRealNumber= Integer.parseInt(actualItemsAdd);
   Assert.assertEquals(theRealNumber, expectedItems);
    
	}
    
	}

	