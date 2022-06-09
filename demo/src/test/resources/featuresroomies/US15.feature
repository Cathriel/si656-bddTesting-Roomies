Feature: Cambiar la password de la cuenta
  Scenario: Usuario cambia password
    Given el usuario desea cambiar el password de su cuenta y se encuentra en el Inicio de sesion
    When presiona el boton de Cambiar Contraseña, completa el formulario y presiona el boton Cambiar
    Then el website registra la nueva contraseña
  Scenario: Usuario no ingresa nueva password
    Given el usuario no ingresa una nueva password
    When presiona el boton Cambiar
    Then se muestra el mensaje Ingresar nueva password