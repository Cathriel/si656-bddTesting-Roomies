Feature: Visualizar informacion de inmueble

  Scenario: Usuario selecciona un anuncio de un inmueble

    Given el usuario se encuentra en la seccion Buscar Inmueble
    When selecciona uno de los anuncios
    Then se muestran todas las fotos, videos y reseñas del anuncio de alquiler escogido

  Scenario: Usuario selecciona un anuncio de inmueble y ve comentarios

    Given el usuario se encuentra en la seccion Buscar Inmueble
    When selecciona el anuncio del inmueble
    Then se muestran los comentarios

  Scenario: Usuario no inicia sesion

    Given el usuario no ha iniciado sesion y se encuentra en la pagina de anuncios
    When selecciona el anuncio del inmueble
    Then aparece un mensaje que indica iniciar sesion