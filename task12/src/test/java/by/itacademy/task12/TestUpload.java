package by.itacademy.task12;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class TestUpload {
    @Test
    public void uploadConnection() throws IOException {
        URL link = new URL("https://raw.githubusercontent.com/AndrewEfim/ForHomeWork9/master/hospital.json");
        URLConnection connection = link.openConnection( );
        Assert.assertNotNull(link.getContent( ));
        Assert.assertNotNull(connection.getInputStream( ));
    }
}
