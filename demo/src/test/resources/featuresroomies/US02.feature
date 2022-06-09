Feature: Editar avisos de alquiler

  Scenario: Usuario ha iniciado sesion
    Given el usuario inicia sesion
    When seleccione Editar anuncio
    Then se muestra una vista para editar los detalles del inmueble

  Scenario: Usuario no ha iniciado sesion
    Given que el usuario no ha iniciado sesion
    When se dirige a su perfil para editar un anuncio
    Then se le redirige a la seccion Iniciar Sesion