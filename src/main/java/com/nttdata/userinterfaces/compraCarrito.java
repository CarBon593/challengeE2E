package com.nttdata.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class compraCarrito extends PageObject {
    public static final Target PRODUCTO_1 = Target.the("Producto 1").located(By.xpath("//a[text()='MacBook']/../../following-sibling::div/button/span[text()='Add to Cart']"));

    public static final Target PRODUCTO_2 = Target.the("Producto 2").located(By.xpath("//a[text()='iPhone']/../../following-sibling::div/button/span[text()='Add to Cart']"));

    public static final Target BTN_CARRITO = Target.the("Carrito").located(By.xpath("//span[contains(.,'Shopping Cart')]"));

    public static final Target BTN_CHECKOUT = Target.the("Checkout").located(By.xpath("(//a[contains(.,'Checkout')])[3]"));

    public static final Target CHECK_GUEST = Target.the("Check invitado").located(By.xpath("//input[@value='guest']"));

    public static final Target BTN_CONTINUAR = Target.the("Boton continuar").located(By.xpath("//input[@id='button-account']"));

    public static final Target FIRST_NAME = Target.the("First Name").located(By.xpath("//input[@id='input-payment-firstname']"));

    public static final Target LAST_NAME = Target.the("Last Name").located(By.xpath("//input[@id='input-payment-lastname']"));

    public static final Target MAIL = Target.the("Mail").located(By.xpath("//input[@id='input-payment-email']"));

    public static final Target PHONE = Target.the("Teléfono").located(By.xpath("//input[@id='input-payment-telephone']"));

    public static final Target DIR_1 = Target.the("Direccion 1").located(By.xpath("//input[@id='input-payment-address-1']"));

    public static final Target CITY = Target.the("Ciudad").located(By.xpath("//input[@id='input-payment-city']"));

    public static final Target POST_CODE = Target.the("Código postal").located(By.xpath("//input[@id='input-payment-postcode']"));

    public static final Target COUNTRY = Target.the("País").located(By.xpath("//select[@id='input-payment-country']"));

    public static final Target REGION_STATE = Target.the("Provincia").located(By.xpath("//select[@id='input-payment-zone']"));

    public static final Target BTN_FORM = Target.the("Btn formulario").located(By.xpath("//input[@id='button-guest']"));

    public static final Target BTN_DELIVERY = Target.the("Btn delivery").located(By.xpath("//input[@id='button-shipping-method']"));

    public static final Target OPT_COD = Target.the("Opt Cash On Delivery").located(By.xpath("//input[@value='cod']"));

    public static final Target CLICK_TERM = Target.the("Términos y condiciones").located(By.xpath("//input[@name='agree']"));

    public static final Target CLICK_BTN_M_P = Target.the("Btn Continuar").located(By.xpath("//input[@id='button-payment-method']"));

    public static final Target CLICK_BTN_CONFIRMAR = Target.the("Btn confirmar orden").located(By.xpath("//input[@id='button-confirm']"));

    public static final Target ASSERT_MSJ = Target.the("Mensaje").located(By.xpath("//h1[contains(.,'Your order has been placed!')]"));

    public static final Target BTN_CONTINUAR_FIN = Target.the("Btn continuar").located(By.xpath("//a[contains(.,'Continue')]"));
}
