Feature: Visualizar la pagina web en cualquier dispositivo tecnologico
  Scenario: Usuario ingresa a la pagina web desde su dispositivo
    Given el usuario desea visualizar la pagina web desde cualquier dispositivo
    When ingrese desde el dispositivo de su eleccion
    Then el contenido y las funciones se visualizan y ejecutan correctamente