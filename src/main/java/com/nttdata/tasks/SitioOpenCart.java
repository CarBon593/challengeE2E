package com.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SitioOpenCart implements Task {

    private final String url;

    public SitioOpenCart(String url) {
        this.url=url;
    }

    public static Task openCartWeb() {
        String url="http://opencart.abstracta.us/";
        return instrumented(SitioOpenCart.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }
}
