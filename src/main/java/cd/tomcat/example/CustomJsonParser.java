package cd.tomcat.example;

import com.fasterxml.jackson.jakarta.rs.json.JacksonJsonProvider;

public class CustomJsonParser extends JacksonJsonProvider {
    public CustomJsonParser() {
        super();
    }
}
