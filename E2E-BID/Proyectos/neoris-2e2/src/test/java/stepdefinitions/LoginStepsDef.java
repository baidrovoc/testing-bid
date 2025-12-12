package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import task.LoginSteps;

public class LoginStepsDef {

    @Managed
    WebDriver driver;

    LoginSteps loginSteps;

    @Given("que me encuentro en la pagina de login de Saucedemo")
    public void que_me_encuentro_en_la_pagina_de_login_de_Saucedemo() {
        loginSteps = new LoginSteps(driver);
        loginSteps.openPage();
    }

    @When("inicio sesion con las credenciales user: {string} y password: {string}")
    public void inicio_sesion_con_las_credenciales_user_y_password(String user, String password) {
        loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
    }

    @Then("valido que deberia aparecer el titulo de {string}")
    public void valido_que_deberia_aparecer_el_titulo_de(String expectedTitle) {
        loginSteps = new LoginSteps(driver);
        String title =  loginSteps.getTitle();
        //prueba: validamos el título del producto
        Assert.assertEquals(expectedTitle, title);
    }
}
