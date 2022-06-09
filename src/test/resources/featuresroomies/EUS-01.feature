Feature: Verificación del perfil

  Scenario: Verifica el arrendador
    Given el arrendador ha iniciado sesión y se dirige a su perfil
    When presiona el botón “Validar” donde ingresa su DNI
    Then si es correcto el DNI con sus nombres y apellidos, le aparecerá el mensaje de “Perfil Verificado por DNI”

  Scenario: Verifica el arrendatario
    Given el arrendatario ha iniciado sesión y se dirige a su perfil
    When presiona el botón “Validar” donde ingresa su DNI el arrendatario
    Then si es correcto el DNI con sus nombres y apellidos, le aparecerá el mensaje de “Perfil Verificado por DNI” al arrendatario
