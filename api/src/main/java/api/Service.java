package api;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Service
{    
    @Nonnull
    int copy (@Nonnull InputStream source, @javax.annotation.Nonnull OutputStream sink) throws IOException;
}
