package tests;


import endpoints.EmployeeEndpoints;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import payloads.EmployeePayload;
import specs.RequestSpecs;
import specs.ResponseSpecs;
import utils.AssertionUtils;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class CreateEmployeeTest {

    @Test
    public void createEmployeeTest() {

        Map<String, Object> payload =
                EmployeePayload.createNewEmployeePayload();

        Response res = given()
                .spec(RequestSpecs.defaultRequest())
                .body(payload)
                .when()
                .post(EmployeeEndpoints.CREATE_EMPLOYEE);

        res.then()
                .log().body()
                .spec(ResponseSpecs.successResponse());

        JsonPath jp = res.jsonPath();

        SoftAssert softAssert = new SoftAssert();

        AssertionUtils.verifySuccessMessage(
                jp.getString("status"),
                "success",
                softAssert
        );

        AssertionUtils.verifyEmployeeName(
                jp.getString("data.name"),
                payload.get("name").toString(),
                softAssert
        );

        softAssert.assertAll();
    }
}