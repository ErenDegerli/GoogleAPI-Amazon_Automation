package com.lastone.client;

import com.lastone.configuration.Config;
import io.restassured.path.json.JsonPath;
import java.io.IOException;
import java.util.List;
import static io.restassured.RestAssured.given;

public class Client {

    public static String getCountry(String isbn) {
        String resp = null;
        try {
            resp = given().when().get(Config.getValue("baseUrl") + "?q=" + isbn).then().extract().response().asString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonPath js = new JsonPath(String.valueOf(resp));
        List<String> link = js.getList("items.saleInfo.country");
        return link.get(0);
    }
}
