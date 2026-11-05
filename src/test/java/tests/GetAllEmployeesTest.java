package tests;

import base.BaseTest;
import endpoints.EmployeeEndpoints;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import specs.RequestSpecs;
import specs.ResponseSpecs;
import utils.AssertionUtils;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

    public class GetAllEmployeesTest extends BaseTest {

        @Test
        public void getAllEmployeesTest() {

            Response res = given()
                    .spec(RequestSpecs.defaultRequest())
                    .when()
                    .get(EmployeeEndpoints.GET_ALL_EMPLOYEES);

            res.then()
                    .log().all()
                    .spec(ResponseSpecs.successResponse());

            JsonPath jp = res.jsonPath();

            SoftAssert softAssert = new SoftAssert();

            AssertionUtils.verifySuccessMessage(
                    jp.getString("status"),
                    "success",
                    softAssert
            );

            AssertionUtils.verifyEmployeeListIsNotEmpty(
                    jp.getList("data").size(),
                    softAssert
            );

            AssertionUtils.verifyEmployeeId(
                   String.valueOf(jp.getInt("data[0].id")),"1",softAssert);


            softAssert.assertAll();
        }
    }


