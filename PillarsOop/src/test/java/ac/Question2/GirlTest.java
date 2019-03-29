package ac.Question2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GirlTest {
    Girl gal;
    @Before
    public void setUp() throws Exception {

        gal = new Girl();
    }

    @Test
    public void complexion() {

        Assert.assertEquals("Light",gal.complexion());
    }

    @Test
    public void surName() {
        Assert.assertEquals("Kewuti",gal.surName());

    }
}