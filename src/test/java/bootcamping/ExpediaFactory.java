package bootcamping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class ExpediaFactory {

   static WebDriver demo;

    public static WebDriver hdBrowser(String browser, String url){

        if (browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver","C:\\Users\\Proxes\\Downloads\\JAVABuildTools\\chromedriver_win32\\chromedriver.exe");
            demo=new ChromeDriver();
        } else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Proxes\\Downloads\\JAVABuildTools\\geckodriver-v0.23.0-win64 (1)\\geckodriver.exe");
            demo=new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","C:\\Users\\Proxes\\Downloads\\JAVABuildTools\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
            demo=new InternetExplorerDriver();
        }

        demo.manage().window().maximize();
        demo.get(url);
        demo.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return demo;
    }


}
