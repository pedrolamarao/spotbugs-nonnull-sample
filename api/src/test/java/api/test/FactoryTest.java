package api.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class FactoryTest
{    
    private final MockFactory mock = new MockFactory();
    
    @Test
    public void getName ()
    {
        assertNotNull(mock.getName());
    }
    
    @Test
    public void createService ()
    {
        assertNotNull(mock.createService(null));
    }
}
