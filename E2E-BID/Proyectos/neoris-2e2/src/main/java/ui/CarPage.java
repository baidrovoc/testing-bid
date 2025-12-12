package ui;

import org.openqa.selenium.By;

public class CarPage {

    public static By checkoutButton = By.id("checkout");

    public static By nameInput = By.id("first-name");
    public static By lastnameInput = By.id("last-name");
    public static By zipcodeInput = By.id("postal-code");

    public static By continueButton = By.id("continue");
    public static By finishButton = By.id("finish");

    public static By thankMessage = By.xpath("//*[@id='checkout_complete_container']/h2");

}
