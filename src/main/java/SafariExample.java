import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariExample {

    public WebDriver driver;
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public static void main(String[] args) {
        // Set Safari driver path (not necessary on macOS, SafariDriver is built-in)
        // For Windows: System.setProperty("webdriver.safari.driver", "path/to/safaridriver.exe");

        // Instantiate SafariDriver
        WebDriver driver = new SafariDriver();

        // Example usage: navigating to a website
        driver.get("https://www.example.com");

        // Close the browser
        driver.quit();
    }
}
