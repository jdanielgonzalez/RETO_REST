package co.com.sofka.stepdefinition.placeholder.users;

import co.com.sofka.models.User;
import co.com.sofka.questions.ResponseCode;
import co.com.sofka.tasks.getuserscomplete.GetUsersComplete;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


import static co.com.sofka.questions.GetUsersByUserName.getUser;
import static co.com.sofka.util.username.UserName.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static javax.servlet.http.HttpServletResponse.SC_NOT_FOUND;

public class UsersStepDefinition {

    private static final String REST_API_URL ="https://jsonplaceholder.typicode.com";
    private static final String USER_NOT_NULL = "Usuario es diferente de nulo";
    private static final String THE_RESPONSE_CODE = "El codigo de respuesta fue: ";
    private static final String ACTOR_NAME = "Chillin la mejor";
    private static final String USER_NAME1= "Bret";
    private static final String USER_NAME9 = "Delphine";
    Actor chillin;
    User datos1;
    User datos2;

    //Assertions
    private static final String ASSERTION_NAME="El nombre de usuario ";

    @Given("el usuario tiene acceso a la base de datos")
    public void el_usuario_tiene_acceso_a_la_base_de_datos() {
        chillin = Actor.named(ACTOR_NAME)
                .whoCan(CallAnApi.at(REST_API_URL));
    }

    @When("el usuario quiere ver todos los usuarios")
    public void el_usuario_quiere_ver_todos_los_usuarios() {
        chillin.attemptsTo(
                GetUsersComplete.fromPage("")
        );
    }

    @Then("el sistema deberia mostrar todos los usuarios")
    public void el_sistema_deberia_mostrar_todos_los_usuarios() {
        chillin.should(
                seeThat(THE_RESPONSE_CODE, ResponseCode.was(),equalTo(SC_OK) )
        );
    }

    @When("el usuario quiera filtrar un usuario por username")
    public void el_usuario_quiera_filtrar_un_usuario_por_username() {
        datos1 =  getUser().answeredBy(chillin)
                .getData().stream()
                .filter(x->x.getUsername().equals(USER_NAME1)).findFirst()
                .orElse(null);

        datos2 = getUser().answeredBy(chillin)
                .getData().stream()
                .filter(x->x.getUsername().equals(USER_NAME9)).findFirst()
                .orElse(null);
    }

    @Then("el sistema deberia mostrar el usuario solicitado")
    public void el_sistema_deberia_mostrar_el_usuario_solicitado() {
        chillin.should(
                seeThat(ASSERTION_NAME+"1", act -> datos1.getUsername(),equalTo(USERNAME1.getValue()))
        );
        chillin.should(
                seeThat(ASSERTION_NAME+"6",act-> datos2.getUsername(),equalTo(USERNAME9.getValue()))
        );
    }

    @When("el usuario filtre de manera incorrecta")
    public void el_usuario_filtre_de_manera_incorrecta() {
        chillin.attemptsTo(
                GetUsersComplete.fromPage("/11")//solo tengo 10 usuarios
        );
    }

    @Then("el sistema deberia mostrar un mensaje de no encontrado")
    public void el_sistema_deberia_mostrar_un_mensaje_de_no_encontrado() {
        chillin.should(
                seeThat("El codigo de respuesta ", ResponseCode.was(),equalTo(SC_NOT_FOUND))

        );
    }
}

/*

        chillin.should(
                seeThat(USER_NOT_NULL, act -> datos1,notNullValue())
        );










 */