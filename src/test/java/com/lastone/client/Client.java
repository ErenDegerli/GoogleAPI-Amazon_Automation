package com.lastone.client;

import com.lastone.configuration.Config;
import io.restassured.path.json.JsonPath;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class Client {

    public static String getBuyLink(String isbn) throws IOException {
        String resp = given().when().get(Config.getValue("baseUrl") + "?q=" + isbn).then().extract().response().asString();
        JsonPath js = new JsonPath(String.valueOf(resp));
        List<Object> link = js.getList("items.saleInfo.buyLink");
        String buyLink = null;
        for(int i=0; i<link.size(); i++) {
            if(link.get(i) !=null) {
                buyLink = (String) link.get(i);
            }
        }
        return buyLink;
    }

}
