package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import task.ProductsSteps;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductsStepsDef {

    @Managed
    WebDriver driver;

    ProductsSteps productsSteps;

    @And("agrego el producto {string} al carrito de compras")
    public void agrego_el_producto_al_carrito_de_compras(String product) {
        productsSteps = new ProductsSteps(driver);
        productsSteps.clickAddCar(product);
    }

    @And("accedo al carrito para verificar que los productos agregados estan presentes")
    public void accedo_al_carrito_para_verificar_que_los_productos_agregados_estan_presentes() {
        productsSteps = new ProductsSteps(driver);
        productsSteps.clickCar();
        productsSteps.clickCheckout();
    }

    @And("completo el formulario de compra con los datos {string} {string} {string}")
    public void completo_el_formulario_de_compra_con_los_datos(String name, String lastName, String zipCode) {
        productsSteps = new ProductsSteps(driver);
        productsSteps.typeName(name);
        productsSteps.typeLastName(lastName);
        productsSteps.typeZipCode(zipCode);
        productsSteps.clickContinue();
    }

    @Then("se debe visualizar el mensaje de confirmacion {string}")
    public void se_debe_visualizar_el_mensaje_de_confirmacion(String message) {
        productsSteps = new ProductsSteps(driver);
        productsSteps.clickFinish();
        String messageExpected =  productsSteps.getMessageThank();
        Assert.assertEquals(message, messageExpected);
    }
}
