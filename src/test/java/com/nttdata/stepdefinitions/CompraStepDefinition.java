package com.nttdata.stepdefinitions;

import com.nttdata.questions.obtenerTexto;
import com.nttdata.tasks.SitioOpenCart;
import com.nttdata.tasks.agregarProductos;
import com.nttdata.tasks.llenarFomulario;
import com.nttdata.tasks.confOrden;
import com.nttdata.userinterfaces.compraCarrito;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class CompraStepDefinition {

    EnvironmentVariables environmentVariables;

    @Before
    public void setTheStag(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que el (.*) desea comprar en el sitio web opencart$")
    public void abrirSitioOpenCart(String usuario) {
        theActorCalled(usuario).attemptsTo(
                SitioOpenCart.openCartWeb()
        );
    }

    @When("añade al carrito dos productos e ingresa al carrito el realiza la compra como invitado")
    public void seleccionProductosYCarrito() {
        theActorInTheSpotlight().attemptsTo(
                agregarProductos.alCarrito()
        );
    }

    @And("llena el formulario checkout con los siguientes datos: {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void llenarCheckout(String first_name,String last_name,String mail,String telephone,String address_1,String city,String post_code,String country,String region_state,String payment_method) {
        theActorInTheSpotlight().attemptsTo(
                llenarFomulario.deCheckout(first_name,last_name,mail,telephone,address_1,city,post_code,country,region_state)
        );
    }

    @Then("luego de confirmar la orden, el visualizará el mensaje de confirmación de la compra {string}")
    public void confirmarOrdenCompra(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                confOrden.finOrden()
        );
        theActorInTheSpotlight().should(
                seeThat("Mensaje de confirmación",obtenerTexto.getText(compraCarrito.ASSERT_MSJ),containsString(mensaje))
        );
        theActorInTheSpotlight().attemptsTo(Click.on(compraCarrito.BTN_CONTINUAR_FIN));
    }
}
