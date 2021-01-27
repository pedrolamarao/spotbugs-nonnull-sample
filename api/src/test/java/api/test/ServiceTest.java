package api.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ServiceTest
{
    private final MockService mock = new MockService();
    
    @Test
    public void convertFoo ()
    {
        assertEquals(0, mock.copy(null, null));
    }
}
