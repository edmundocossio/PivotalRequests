package Piv;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PivotalTest {
    @Test
    public void testPost(){
        Response res = RestAssured.given()
                .baseUri("https://www.pivotaltracker.com/services/v5")
                .header("X-TrackerToken","fb65d6b2bfdcfc20a4c008deeefdf1a2")
                .contentType(ContentType.JSON)
                .when()
                .body("{\"name\":\"Project created by rest assured\"}")
                .post("/projects");
        System.out.println(res.prettyPrint());
    }
}