package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        given().accept("application/xml")
          .when().get("/hello")
          .then()
             .statusCode(200)
             .contentType("application/xml")
             .body(containsString("hello"));
    }

}