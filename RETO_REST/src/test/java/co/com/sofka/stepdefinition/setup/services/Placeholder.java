package co.com.sofka.stepdefinition.setup.services;

import io.restassured.RestAssured;

public class Placeholder {
    private static final String BASE_URI = "https://jsonplaceholder.typicode.com";


    protected void generalSetUp(){
        setUpLog4j2();
        setUpBases();
    }

    protected void setUpBases(){
        RestAssured.baseURI = BASE_URI;
        //RestAssured.basePath = BASE_PATH;
    }

    protected void setUpLog4j2(){
    }
}