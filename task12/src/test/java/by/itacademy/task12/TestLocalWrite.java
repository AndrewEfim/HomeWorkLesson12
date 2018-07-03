package by.itacademy.task12;

import by.itacademy.task12.domain.Hospital;
import org.junit.Assert;
import org.junit.Test;

public class TestLocalWrite {
    @Test
    public void testExecute(){
        Assert.assertNotNull(new Hospital());
    }
}
