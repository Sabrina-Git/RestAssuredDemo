package specs;

import config.ConfigReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecs {

    public static RequestSpecification defaultRequest() {
        return new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("baseUrl"))
                .setContentType(ContentType.JSON)
                .build();
    }
}