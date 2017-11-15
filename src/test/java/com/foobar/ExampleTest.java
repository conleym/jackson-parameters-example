package com.foobar;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.junit.Test;

import java.lang.reflect.Parameter;

public class ExampleTest {
    private static final String JSON_EXAMPLE = "{\"field1\": 1, \"field2\": 17}";

    @Test
    public void testDeserialization() throws Exception {
        final ObjectMapper om = new ObjectMapper();
        om.registerModule(new ParameterNamesModule(JsonCreator.Mode.PROPERTIES));

        Parameter[] ps = Example.class.getConstructors()[0].getParameters();
        for (Parameter p : ps) {
            System.out.println(p.getName());
        }
        om.readValue(JSON_EXAMPLE, Example.class);
    }
}
