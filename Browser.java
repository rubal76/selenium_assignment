import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static void main(String[] args) throws InterruptedException {
        String name ="Rubel";
        String chromeDriverPath = "C:\\Users\\rubal\\IdeaProjects\\WebBrowserOperation\\driver\\chromedriver (1).exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver chromeDriver = new ChromeDriver();
        String url = "https://www.izaanschool.com/";
        chromeDriver.get(url);
        System.out.println("The Chrome Browser opened ");
        chromeDriver.get("https://www.izaanschool.com/apply");
        chromeDriver.navigate().to("https://www.izaanschool.com");
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();

        // Navigate to Url
            chromeDriver.get("https://google.com");

            // Enter text "q" and perform keyboard action "Enter"
            chromeDriver.findElement(By.name("q")).sendKeys("Izaan School" + Keys.ENTER);
        // Store 'SearchInput' element
        WebElement searchInput = chromeDriver.findElement(By.name("q"));
     //   searchInput.sendKeys("selenium");
        // Clears the entered text
        searchInput.clear();
        Thread.sleep(5000);
         chromeDriver.close();
        System.out.println("The Chrome Browser Closed");

        }






}
