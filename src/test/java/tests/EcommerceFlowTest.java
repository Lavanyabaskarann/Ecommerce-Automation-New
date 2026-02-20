package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;    // Import your LoginPage
import utils.ExcelReader;
import java.io.IOException;

public class EcommerceFlowTest {
    WebDriver driver;
    LoginPage loginPage; // Changed from CartPage to LoginPage

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/"); // Or your specific URL
        loginPage = new LoginPage(driver);
    }

    @Test(dataProvider = "loginData")
    public void verifyLoginFlow(String user, String pass, String prod) {
        System.out.println("Testing Login for: " + user);

        // Use the method defined in your LoginPage.java
        loginPage.loginToApplication(user, pass);
    }

    @DataProvider(name = "loginData")
    public Object[][] getExcelData() throws IOException {
        String path = "C:\\Users\\Lavanya\\Downloads\\TestData.xlsx";
        return ExcelReader.getTestData(path, "Sheet1");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}