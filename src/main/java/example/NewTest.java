import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

class RemoteTest {

  public static void main(String[] args) throws Exception {
    // Change this to match the location of your server
    URL server = new URL("http://192.168.16.134:4444/wd/hub");

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setBrowserName("firefox");

    System.out.println("Connecting to " + server);

    WebDriver driver = new RemoteWebDriver(server, capabilities);

    driver.get("http://www.google.com");

    driver.quit();
  }
