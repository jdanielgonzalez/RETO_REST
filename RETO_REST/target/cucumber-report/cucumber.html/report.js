$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/placeholder/users.feature");
formatter.feature({
  "name": "Users",
  "description": "  Como un usuario que visita una base de datos de usuarios\n  y necesita filtrar los datos de los usuarios\n  para obtener su informacion basica",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "el usuario tiene acceso a la base de datos",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.users.UsersStepDefinition.el_usuario_tiene_acceso_a_la_base_de_datos()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "get users completed",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "el usuario quiere ver todos los usuarios",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.users.UsersStepDefinition.el_usuario_quiere_ver_todos_los_usuarios()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el sistema deberia mostrar todos los usuarios",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.users.UsersStepDefinition.el_sistema_deberia_mostrar_todos_los_usuarios()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "el usuario tiene acceso a la base de datos",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.users.UsersStepDefinition.el_usuario_tiene_acceso_a_la_base_de_datos()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "filter user by username",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "el usuario quiera filtrar un usuario por username",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.users.UsersStepDefinition.el_usuario_quiera_filtrar_un_usuario_por_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el sistema deberia mostrar el usuario solicitado",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.users.UsersStepDefinition.el_sistema_deberia_mostrar_el_usuario_solicitado()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "el usuario tiene acceso a la base de datos",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.users.UsersStepDefinition.el_usuario_tiene_acceso_a_la_base_de_datos()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "filter user wrongly",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "el usuario filtre de manera incorrecta",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.users.UsersStepDefinition.el_usuario_filtre_de_manera_incorrecta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el sistema deberia mostrar un mensaje de no encontrado",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.placeholder.users.UsersStepDefinition.el_sistema_deberia_mostrar_un_mensaje_de_no_encontrado()"
});
formatter.result({
  "status": "passed"
});
});