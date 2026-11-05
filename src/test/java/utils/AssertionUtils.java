package utils;

import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;

public class AssertionUtils {

    public static void verifyStatusCode(Response res, int expectedStatusCode, SoftAssert softAssert) {
        softAssert.assertEquals(
                res.getStatusCode(),
                expectedStatusCode,
                "Status code validation failed"
        );
    }



    public static void verifySuccessMessage(
            String actualMessage,
            String expectedMessage,
            SoftAssert softAssert) {

        softAssert.assertEquals(
                actualMessage,
                expectedMessage,
                "Status message validation failed"
        );
    }

    public static void verifyEmployeeId(
            String actualMessage,
            String expectedMessage,
            SoftAssert softAssert) {

        softAssert.assertEquals(
                actualMessage,
                expectedMessage,
                "Status message validation failed"
        );
    }



    public static void verifyEmployeeListIsNotEmpty(
            int employeeCount,
            SoftAssert softAssert) {

        softAssert.assertTrue(
                employeeCount > 0,
                "Employee list is empty"
        );
    }

    public static void verifyEmployeeName(
            String actualName,
            String expectedName,
            SoftAssert softAssert) {

        softAssert.assertEquals(
                actualName,
                expectedName,
                "Employee name validation failed"
        );
    }




}
