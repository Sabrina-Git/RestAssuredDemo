package base;

import config.ConfigReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod   // This BeforeMethod will run before Every Test method and set the baseUrl.
    public void setup() {
        RestAssured.baseURI = ConfigReader.getProperty("baseUrl");
    }
}

