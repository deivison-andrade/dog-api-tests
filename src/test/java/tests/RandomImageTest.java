package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RandomImageTest extends BaseTest {

    @Test
    void shouldReturnRandomImage() {
        given()
        .when()
            .get("/breeds/image/random")
        .then()
            .statusCode(200)
            .body("message", containsString("http"));
    }
}
