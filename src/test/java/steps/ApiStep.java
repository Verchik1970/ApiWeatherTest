package steps;

import models.RandomValuesModel;

import static io.restassured.RestAssured.given;
import static models.InfoStrings.index;

public class ApiStep {

    public RandomValuesModel getRequest() {

        return given()
                .log().uri()
                .queryParams("units", "metric")
                .queryParams("lang", "ru")

                .when()
                .get(index)
                .then()
                .log().body()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(RandomValuesModel.class);
    }
}

