import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class LinkCount {
   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = " https://www.credosystemz.com/";
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
      //Using tagname with anchor
      List links = driver.findElements(By.tagName("a"));
      System.out.println(“The number of links is “ + links.size());
      driver.close();
   }
} 
