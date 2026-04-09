package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BreedsTest extends BaseTest {

    @Test
    void shouldListAllBreeds() {
        given()
        .when()
            .get("/breeds/list/all")
        .then()
            .statusCode(200)
            .body("message", not(empty()));
    }
}
//teste