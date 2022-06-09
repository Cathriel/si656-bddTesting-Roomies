Feature: Observar el inmueble

  Scenario: Usuario selecciona filtros en un inmueble

    Given el usuario se encuentra en la vista principal
    When selecciona los filtros sobre las caracteristicas del inmueble que desea alquilar
    Then se muestran todos los inmuebles que posean tales caracteristicas

  Scenario: Usuario selecciona anuncio de un inmueble

    Given el usuario se encuentra en la seccion Buscar Inmueble
    When selecciona el anuncio del inmueble
    Then se muestran imagenes y videos

  Scenario: Usuario selecciona anuncio de un inmueble y ve similares

    Given el usuario se encuentra en la seccion Buscar Inmueble
    When selecciona el anuncio del inmueble
    Then se muestran otras viviendas similares en la parte inferior