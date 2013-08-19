package AnimalFarm;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CowTest {
    @Test
    public void aCowSaysMoo() throws Exception {
        assertEquals("Moooo", new Cow().speak());
    }
}
