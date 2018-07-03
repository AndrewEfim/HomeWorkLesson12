package by.itacademy.task12.service.write;


import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class BooleanSerializer implements JsonSerializer<Boolean> {

    public JsonPrimitive serialize(Boolean health, Type type, JsonSerializationContext jsonSerializationContext){
        return new JsonPrimitive(health ? "health":"not health");

    }
}
