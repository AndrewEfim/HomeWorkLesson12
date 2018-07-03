package by.itacademy.task12.service.write;

import by.itacademy.task12.domain.Hospital;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class LocalWrite {
    public void execute(Hospital hospital) {
        Gson gson = new GsonBuilder( )
                .setPrettyPrinting( )
                .registerTypeAdapter(LocalDate.class, new LocalDateSerializer( ))
                .registerTypeAdapter(Boolean.class, new BooleanSerializer( ))
                .create( );
        try (FileWriter fileWriter = new FileWriter("hospital.json")) {
            gson.toJson(hospital, fileWriter);
            System.out.println("File has been writen");
        } catch (IOException e) {
            e.printStackTrace( );
        }
    }
}
