package com.lastone.pages;

import com.lastone.configuration.Config;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import java.io.IOException;

public class GoogleAPI {

    public String getBuyLink(String isbn ) {

        try {
            RestAssured.baseURI= Config.getValue("baseUrl");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String response = given().queryParam("q", isbn).header("Content-Type","application/json")
                .when().get("/books/v1/volumes/")
                .then().extract().response().asString();
        JsonPath js = new JsonPath(response);
        return js.getString("buyLink");
    }
}
