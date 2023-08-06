package com.nttdata.tasks;

import com.nttdata.userinterfaces.compraCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ui.Dropdown;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class llenarFomulario implements Task {
    public final String first_name;
    public final String last_name;
    public final String mail;
    public final String telephone;
    public final String address_1;
    public final String city;
    public final String post_code;
    public final String country;
    public final String region_state;


    public llenarFomulario(String first_name, String last_name, String mail, String telephone, String address_1, String city, String post_code, String country, String region_state){
        this.first_name=first_name;
        this.last_name=last_name;
        this.mail=mail;
        this.telephone=telephone;
        this.address_1=address_1;
        this.city=city;
        this.post_code=post_code;
        this.country=country;
        this.region_state=region_state;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(compraCarrito.FIRST_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(first_name).into(compraCarrito.FIRST_NAME),
                Enter.theValue(last_name).into(compraCarrito.LAST_NAME),
                Enter.theValue(mail).into(compraCarrito.MAIL),
                Enter.theValue(telephone).into(compraCarrito.PHONE),
                Enter.theValue(address_1).into(compraCarrito.DIR_1),
                Enter.theValue(city).into(compraCarrito.CITY),
                Enter.theValue(post_code).into(compraCarrito.POST_CODE),
                SelectFromOptions.byVisibleText(country).from(compraCarrito.COUNTRY),
                SelectFromOptions.byVisibleText(region_state).from(compraCarrito.REGION_STATE),
                Click.on(compraCarrito.BTN_FORM),
                Click.on(compraCarrito.BTN_DELIVERY),
                Click.on(compraCarrito.OPT_COD),
                Click.on(compraCarrito.CLICK_TERM),
                Click.on(compraCarrito.CLICK_BTN_M_P)
        );

    }

    public static Performable deCheckout(String first_name, String last_name, String mail, String telephone, String address_1, String city, String post_code, String country, String region_state) {
        return instrumented(llenarFomulario.class, first_name,last_name,mail,telephone,address_1,city,post_code,country,region_state);
    }
}
