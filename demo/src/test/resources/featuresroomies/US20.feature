Feature: Visualizar lista de mis publicaciones
  Scenario: El arrendador ha realizado uno o vario anuncios previamente
    Given el arrendador ha publicado un par de anuncios en la plataforma
    When acceda a la seccion Mis anuncios
    Then le aparecera la lista de sus anuncios publicados
  Scenario: El arrendador no ha publicado ningun anuncio
    Given el arrendador no ha publicado ningun anuncio en la plataforma
    When acceda a la seccion Mis anuncios
    Then aparecera el mensaje Aun no has hecho ningun anuncio