package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SonTest {
     Son boy;
    @Before
    public void setUp() throws Exception {

        boy = new Son("Dark","Mtyingwana",56,"Sinetemba");
    }

    @Test
    public void getName() {

        Assert.assertEquals("Sinetemba",boy.getName());
    }
    @Test
    public void getSurname()
    {
        Assert.assertEquals("Kewuti",boy.getSurname());
    }


}