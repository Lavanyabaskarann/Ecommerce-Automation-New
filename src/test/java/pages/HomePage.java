package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        System.out.println("Searching for: " + productName);
        // Add your search locator logic here later
    }

    public void addToCart() {
        System.out.println("Adding product to cart...");
        // Add your click logic here later
    }
}