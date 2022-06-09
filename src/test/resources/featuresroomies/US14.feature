Feature: Registra una cuenta
  Scenario: Usuario registra una cuenta
    Given el usuario desea registrar una cuenta y se encuentra en la pagina de iniciar sesion
    When presiona el boton de Registrarme, completa el formulario adecuadamente y resiona el boton Registrar
    Then el website registra la cuenta y abre el Home Page
  Scenario: Usuario ingresa datos invalidos
    Given el usuario ingresa un dato invalido en el formulario de registro
    When presiona el boton Registrar
    Then el website muestra el mensaje Correo o password incorrecto
  Scenario: Usuario registra con correo ya registrado
    Given el usuario se registra con un correo ya registrado
    When preiona el boton Registrar
    Then el website muestra el mensaje Correo ya registrado