package fr.miage.m1.big_data_m1_23_24.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class FileRepository {

    ObjectMapper objectMapper = new ObjectMapper();

    File file = new File("users.json");

    public void save(Object object) {
        try {
            objectMapper.writeValue(file, object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Object load(Class<?> clazz) {
        try {
            return objectMapper.readValue(file, clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
