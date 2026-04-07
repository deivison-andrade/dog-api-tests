package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ImagesTest extends BaseTest {

    @Test
    void shouldReturnImagesFromBreed() {
        given()
            .pathParam("breed", "hound")
        .when()
            .get("/breed/{breed}/images")
        .then()
            .statusCode(200)
            .body("message", not(empty()));
    }

    @Test
    void shouldFailWithInvalidBreed() {
        given()
            .pathParam("breed", "invalidbreed")
        .when()
            .get("/breed/{breed}/images")
        .then()
            .statusCode(404);
    }
}
