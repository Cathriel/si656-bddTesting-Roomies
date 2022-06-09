Feature: Verificar los datos del arrendador
  Scenario: Usuario verifica informacion sobre el arrendador
    Given el arrendatario se encuentra en la seccion del anuncio de alquiler elegido
    When se dirija a la seccion Datos del Arrendador
    Then se muestra informacion relevante sobre este
  Scenario: Verificar los datos sin haber iniciado sesion
    Given el usuario no ha iniciado sesion y se encuentra en la pagina de anuncios
    When selecciona el anuncio del inmueble
    Then aparece un mensaje que indica iniciar sesion