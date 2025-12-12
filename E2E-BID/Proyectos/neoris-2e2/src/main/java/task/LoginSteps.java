package task;



import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.LoginPage;
import ui.ProductsPage;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Abrir la pagina de saucedemo
     */
    public void openPage() {
        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            Thread.sleep(2000); // Dar tiempo para que cargue
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        driver.findElement(LoginPage.userInput).sendKeys(user);
    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){
        Serenity.takeScreenshot();
        driver.findElement(LoginPage.loginButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(ProductsPage.productsTitle));
    }

    /**
     * Obtener el título de la pantalla de productos
     * @return el valor del título de la pantalla de productos
     */
    public String getTitle(){
        return driver.findElement(ProductsPage.productsTitle).getText();
    }

}
