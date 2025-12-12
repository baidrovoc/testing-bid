package task;

import ui.CarPage;
import ui.ProductsPage;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsSteps {

    WebDriver driver;

    public ProductsSteps(WebDriver driver){
        this.driver = driver;
    }

    public By findProduct(String product){
        return By.xpath("//div[text()='" + product + "']/ancestor::div[@class='inventory_item_description']//button[text()='Add to cart']");
    }

    public void clickAddCar(String product){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By productLocator = findProduct(product);
        WebElement productElement = wait.until(ExpectedConditions.elementToBeClickable(productLocator));
        productElement.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickCar() {
        driver.findElement(ProductsPage.carButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickCheckout(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productElement = wait.until(ExpectedConditions.elementToBeClickable(CarPage.checkoutButton));
        productElement.click();
    }

    public void typeName(String name){
        driver.findElement(CarPage.nameInput).sendKeys(name);
    }

    public void typeLastName(String lastname){
        driver.findElement(CarPage.lastnameInput).sendKeys(lastname);
    }

    public void typeZipCode(String zipcode){
        driver.findElement(CarPage.zipcodeInput).sendKeys(zipcode);
    }

    public void clickContinue() {
        Serenity.takeScreenshot();
        driver.findElement(CarPage.continueButton).click();
    }

    public void clickFinish() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productElement = wait.until(ExpectedConditions.elementToBeClickable(CarPage.finishButton));
        productElement.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getMessageThank() {
        return driver.findElement(CarPage.thankMessage).getText();
    }

}
