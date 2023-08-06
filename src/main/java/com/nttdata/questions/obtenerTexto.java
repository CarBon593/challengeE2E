package com.nttdata.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class obtenerTexto implements Question<String> {

    private final Target target;

    public obtenerTexto(Target target) {
        this.target = target;
    }

    public static com.nttdata.questions.obtenerTexto getText(Target target) {
        return new com.nttdata.questions.obtenerTexto(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText();
    }
}
