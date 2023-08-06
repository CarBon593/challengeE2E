package com.nttdata.tasks;

import com.nttdata.userinterfaces.compraCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class agregarProductos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(compraCarrito.PRODUCTO_1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(compraCarrito.PRODUCTO_1),
                WaitUntil.the(compraCarrito.PRODUCTO_2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(compraCarrito.PRODUCTO_2),
                WaitUntil.the(compraCarrito.BTN_CARRITO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(compraCarrito.BTN_CARRITO),
                WaitUntil.the(compraCarrito.BTN_CHECKOUT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(compraCarrito.BTN_CHECKOUT),
                WaitUntil.the(compraCarrito.CHECK_GUEST, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(compraCarrito.CHECK_GUEST),
                Click.on(compraCarrito.BTN_CONTINUAR)
        );

    }

    public static Performable alCarrito() {
        return instrumented(agregarProductos.class);
    }

}
