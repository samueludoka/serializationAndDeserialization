package org.applicationsmart.deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.applicationsmart.serialization.Product;

public class main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"Coke\", \"price\": 50.0, \"created_at\":\"2023-03-12T10:00:00\"}";
        try{
            Product product = mapper.readValue(json, Product.class);
            System.out.println(product);
        }catch(JsonProcessingException ex){
            System.err.println(ex.getMessage());
        }
    }
}
