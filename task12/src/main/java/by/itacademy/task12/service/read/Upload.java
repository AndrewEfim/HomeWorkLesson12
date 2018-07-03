package by.itacademy.task12.service.read;

import by.itacademy.task12.domain.Hospital;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;

public class Upload {
    URL link = new URL("https://raw.githubusercontent.com/AndrewEfim/ForHomeWork9/master/hospital.json");
    URLConnection connection = link.openConnection( );
    InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream( ));

    public Upload() throws IOException {
        this.link = link;
    }

    public Hospital execute() throws IOException {
        ObjectMapper mapper = new ObjectMapper( );
        SimpleModule module = new SimpleModule( );
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer(LocalDate.class));
        module.addDeserializer(boolean.class, new BooleanDeserializer(Boolean.class));
        mapper.registerModule(module);

        Hospital hospitalupload = mapper.readValue(inputStreamReader, Hospital.class);
        inputStreamReader.close( );
        return hospitalupload;
    }
}
