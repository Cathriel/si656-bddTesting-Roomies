Feature: Cambiar foto de perfil
  Scenario: Usuario cambia foto de perfil
    Given el usuario desea cambiar su foto de perfil
    When presiona el boton Cambiar Foto al costado de su foto de perfil
    Then la aplicacion te genera un mensaje de Foto Cambiada