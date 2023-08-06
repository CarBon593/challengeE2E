Feature: Compra productos de Opencart

  @ejercicio001
  Scenario Outline: Validar la compra de dos productos
    Given que el usuario desea comprar en el sitio web opencart
    When añade al carrito dos productos e ingresa al carrito el realiza la compra como invitado
    And llena el formulario checkout con los siguientes datos: "<first_name>","<last_name>","<mail>","<telephone>","<address_1>","<city>","<post_code>","<country>","<region_state>","<payment_method>"
    Then luego de confirmar la orden, el visualizará el mensaje de confirmación de la compra "Your order has been placed!"
    Examples:
      |first_name|last_name|mail|telephone|address_1|city|post_code|country|region_state|payment_method|
      |Carlos|Gomez|cgomez@mail.com|09874563210|dir 1|Ciudad 1|171804|Ecuador|Pichincha|Cash On Delivery|