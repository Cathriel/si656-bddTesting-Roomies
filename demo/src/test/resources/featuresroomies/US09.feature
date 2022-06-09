 Feature: Ingresar al sistema a toda hora
  Scenario: Usuario ingresa a la app
    Given el usuario desde que la aplicacion web este operativa durante todo el dia
    When ingrese a la hora de su preferencia
    Then puede visualizar el contenido y realizar acciones sin ningun inconveniente