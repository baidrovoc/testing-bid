#language: es
@testfeature
Característica: Compra
  Yo, como usuario
  Quiero, agregar productos al carrito
  Para realizar una compra

  @test
  Esquema del escenario: Realizar un compra de 2 articulos
    Dado que me encuentro en la pagina de login de Saucedemo
    Cuando inicio sesion con las credenciales user: "standard_user" y password: "secret_sauce"
    Entonces valido que deberia aparecer el titulo de "Products"
    Y agrego el producto <producto1> al carrito de compras
    Y agrego el producto <producto2> al carrito de compras
    Y accedo al carrito para verificar que los productos agregados estan presentes
    Y completo el formulario de compra con los datos <name> <lastname> <zipcode>
    Entonces se debe visualizar el mensaje de confirmacion "Thank you for your order!"

    Ejemplos:
      | producto1                 | producto2                  | name   | lastname | zipcode  |
      | "Sauce Labs Bolt T-Shirt" | "Sauce Labs Bike Light"    | "Luis" | "Castro" | "162001" |
      | "Sauce Labs Backpack"     | "Sauce Labs Fleece Jacket" | "Carl" | "Torres" | "162030" |
