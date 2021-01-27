package impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import impl.RealService;

public class ServiceTest
{
    @Test
    public void convertFoo () throws IOException
    {
        final RealService mock = new RealService(null);
        assertEquals(0, mock.copy(null, null));
    }
    
    @Test
    public void toStringTest () throws IOException
    {
        final RealService mock = new RealService(null);
        assertNotNull(mock.toString());
    }
}
