package com.nttdata.tasks;

import com.nttdata.userinterfaces.compraCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class confOrden implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(compraCarrito.CLICK_BTN_CONFIRMAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(compraCarrito.CLICK_BTN_CONFIRMAR)
        );


    }

    public static Performable finOrden() {
        return instrumented(confOrden.class);
    }
}
