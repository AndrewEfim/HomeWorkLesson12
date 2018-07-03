package by.itacademy.task12.domain;

import by.itacademy.task12.service.read.LocalRead;
import by.itacademy.task12.service.read.Upload;
import by.itacademy.task12.service.write.LocalWrite;

import java.io.IOException;

public class Registratura {
    private Hospital hospital;
    private LocalRead localRead = new LocalRead( );
    private LocalWrite localWrite = new LocalWrite( );
    private Upload upload = new Upload( );

    public Registratura(Hospital hospital) throws IOException {
        this.hospital = hospital;
    }

    public void localWrite() {
        localWrite.execute(hospital);
    }

    public void localRead() {
        try {
            hospital.addAll(localRead.execute( ).getPatients( ));
        } catch (IOException e) {
            e.printStackTrace( );
        }
    }

    public void upload() throws IOException {
        hospital.addAll(upload.execute( ).getPatients( ));
    }
}

