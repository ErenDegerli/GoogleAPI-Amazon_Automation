package com.lastone.client;

import com.lastone.configuration.Config;
import com.lastone.domain.Items;
import com.lastone.domain.SaleInfo;

import java.awt.print.Book;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Client {

    public String url;

    public Client() {
        try {
            this.url = Config.getValue("baseUrl");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected Items getBuyLink(String buyLink) {
        return given().when().get(url).then().extract().response().getBody().jsonPath().getObject(buyLink, Items.class);
    }

}
