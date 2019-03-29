package za.ac.cput.projects;

import org.junit.Test;

import static org.junit.Assert.*;

public class PastorTest {

    @Test
    public void getScripture() {

        Pastor pastor = new Pastor();
        pastor.setScripture("Matthew 4:4");
        assertEquals(pastor.getScripture(),pastor.getScripture());
    }

    @Test
    public void testAnother()
    {
        Pastor pastor = new Pastor();
        assertEquals("No Scripture",pastor.getScripture());
    }

    @Test
    public void testJohn()
    {
        Pastor pastor = new Pastor();
        pastor.setScripture("John 3:16");
        assertEquals("For God so loved the world",pastor.getScripture());
    }
}