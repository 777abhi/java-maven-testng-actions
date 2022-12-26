package test.java.arithmeticOperation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Addition {

    @Test
    public void openBrowser(){
        // // use WebDriverManager to download and configure the ChromeDriver binary
        // WebDriverManager.chromedriver().setup();
    
        // // create a new instance of the ChromeDriver class
        // WebDriver driver = new ChromeDriver();
    
        // // use the get() method to navigate to a webpage
        // driver.get("http://www.example.com");

        // driver.quit();

    }



    @Parameters({ "suite-param", "test-three-param" })
    @Test
    public void sampleTest(String param,String paramTwo ){

        System.out.println("Test - Addition Passed"+param+" 2 value--> "+paramTwo);
        Assert.assertEquals(1, 1);

    }

    @Test(groups = { "checkintest" })
    public void sampleTest1(){

        System.out.println("Test - Addition Passed -sampleTest1");

    }
} 
 