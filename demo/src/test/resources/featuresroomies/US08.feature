Feature: Instalar la aplicacion en cualquier dispositivo
  Scenario: Usuario busca la app desde la Play Store
    Given el usuario instalar la aplicacion
    When ingrese a la Play Store
    Then se puede instalar sin ningun problema
  Scenario: Usuario busca la app desde la App Store
    Given el usuario instalar la aplicacion
    When ingrese a la App Store
    Then se puede instalar sin ningun inconveniente
