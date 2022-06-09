Feature: Publicar foto 360°
  Scenario: Usuario agrega fotos
    Given el usuario ha iniciado sesion y se encuentra en la seccion Publicar Anuncio
    When selecciona la opción de agregar foto
    Then podra subir las fotos desde su dispositivo
  Scenario: Usuario no agrega fotos
    Given el usuario esta en la vista de publicar
    When selecciona la opcion de continuar sin haber subido por lo menos una foto
    Then se muestra el mensaje Debe agregar por lo menos una foto
  Scenario: Usuario publica foto
    Given el usuario esta en la vista Publicar anuncio y selecciona la opcion de subir foto
    When selecciona la opcion de publicar
    Then se muestra el mensaje Tu anuncio fue publicado con exito
