package org.applicationsmart.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.applicationsmart.serialization.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("chocolate", null,
                LocalDateTime.of(2024,2, 20, 10, 0));
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(product);
            System.out.println(json);
        }catch (JsonProcessingException exception){
            System.err.println(exception.getMessage());

        }
    }

}