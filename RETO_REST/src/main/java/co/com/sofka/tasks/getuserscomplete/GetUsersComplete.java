package co.com.sofka.tasks.getuserscomplete;


import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetUsersComplete implements Task {

    private final String RESOURCE = "/users";
    private final String id;

    public GetUsersComplete(String id) {
        this.id = id;
    }

    public static Performable fromPage(String id) {
        return instrumented(GetUsersComplete.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(RESOURCE+id)

                        .with(requestSpecification
                                -> requestSpecification.contentType(ContentType.JSON)
                        )
        );
    }
}




