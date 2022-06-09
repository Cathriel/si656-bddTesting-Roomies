Feature: Lista de inmuebles favoritos
  Scenario: Usuario guarda sus anuncios
    Given el usuario ha iniciado sesion y se encuentra en la seccion Buscar Inmueble
    When selecciona un anuncio y la opcion Guardar en Favoritos
    Then se muestra el mensaje Guardado Exitoso
  Scenario: Usuario no ha iniciado sesion
    Given el usuario ha iniciado sesion y se encuentra en la descripcion de un anuncio
    When selecciona la opcion Guardar en Favoritos
    Then se muestra el mensaje Guardado Exitoso
