Feature: Visualizar anuncios similares
  Scenario: El arrendatario ha visualizado cierta cantidad de anuncios
    Given el arrendatario ha visto cierta cantidad de anuncios previamente
    When acceda al apartado de Inico
    Then inmuebles similares son mostrados
  Scenario: El arrendatario no ha visualizado anuncios
    Given el arrendatario no ha visto ningun anuncio previamente
    When acceda al apartado de Inicio
    Then no es mostrado ningun inmueble como similar