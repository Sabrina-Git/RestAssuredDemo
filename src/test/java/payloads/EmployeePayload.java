package payloads;

import java.util.HashMap;
import java.util.Map;

public class EmployeePayload {

    public static Map<String, Object> createNewEmployeePayload() {

        Map<String, Object> payload = new HashMap<>();

        payload.put("name", "Hasan_" + System.currentTimeMillis());
        payload.put("salary", "5000");
        payload.put("age", "27");

        return payload;
    }


}
