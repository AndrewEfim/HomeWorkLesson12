package by.itacademy.task12;

import by.itacademy.task12.domain.Hospital;
import by.itacademy.task12.domain.Patient;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class TestHospital {

    @Test
    public void testGetPatients() {
        System.out.println("getPatients");
        Hospital instance = new Hospital( );
        Set<Patient> expResult = new HashSet<>( );
        Set<Patient> result = instance.getPatients( );
        assertEquals(expResult, result);
    }

    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Set<Patient> patients = new HashSet<>( );
        Hospital instance = new Hospital( );
        instance.addAll(patients);
    }
}
