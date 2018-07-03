package by.itacademy.task12;


import by.itacademy.task12.domain.Hospital;
import by.itacademy.task12.domain.Patient;
import by.itacademy.task12.domain.Registratura;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName( ));

    public static void main(String[] args) throws IOException {
        try {
            FileHandler fileHandler = new FileHandler("logApp");
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.toString( ), e);
            LOGGER.log(Level.WARNING, "Warning level log");
            LOGGER.log(Level.INFO, "Write Log with info level");
        }
        Hospital hospital = new Hospital( );
        hospital.add(new Patient("Wendy", "Rhoads", LocalDate.of(1983, 12, 12), false));
        hospital.add(new Patient("Chuck", "Rhoads", LocalDate.of(1980, 11, 11), false));
        hospital.add(new Patient("Bobby", "Axelrod", LocalDate.of(1981, 10, 10), true));
        hospital.add(new Patient("Bobby","Axelrod",LocalDate.of(1981,10,10),false));
        System.out.println(hospital);
        Registratura registratura = new Registratura(hospital);
        registratura.localWrite( );
        registratura.localRead( );
        System.out.println(hospital);
        registratura.upload( );
        System.out.println(hospital);
    }
}
