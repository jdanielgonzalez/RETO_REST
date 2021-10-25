package co.com.sofka.questions;



import co.com.sofka.models.User;
import co.com.sofka.models.Users;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import java.util.Arrays;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.lastResponse;


public class GetUsersByUserName implements Question {
    @Override
    public Users answeredBy(Actor actor) {
        List<User> listaAlbunes = Arrays.asList(lastResponse().getBody().as(User[].class));
        Users albuns = new Users();
        albuns.setAlbuns(listaAlbunes);
        return albuns;
    }

    public static GetUsersByUserName getUser() {
        return new GetUsersByUserName();
    }
}
