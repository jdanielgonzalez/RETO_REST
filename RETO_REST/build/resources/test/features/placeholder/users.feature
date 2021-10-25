Feature: Users
  Como un usuario que visita una base de datos de usuarios
  y necesita filtrar los datos de los usuarios
  para obtener su informacion basica

  Background:
    Given el usuario tiene acceso a la base de datos

  Scenario: get users completed
    When el usuario quiere ver todos los usuarios
    Then el sistema deberia mostrar todos los usuarios

  Scenario: filter user by username
    When el usuario quiera filtrar un usuario por username
    Then el sistema deberia mostrar el usuario solicitado

  Scenario: filter user wrongly
    When el usuario filtre de manera incorrecta
    Then el sistema deberia mostrar un mensaje de no encontrado