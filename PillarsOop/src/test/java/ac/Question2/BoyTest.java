package ac.Question2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoyTest {
    Boy boy;
    @Before
    public void setUp() throws Exception {
        boy = new Boy();


    }

    @Test
    public void complexion() {
        Assert.assertEquals("Dark",boy.complexion());
    }

    @Test
    public void surName() {

        Assert.assertEquals("light",boy.surName());
    }
}