package impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.Nonnull;

import api.Service;

public final class RealService implements Service
{
    private final String name;

    public RealService (String name)
    {
        this.name = name;
    }

    @Override
    public int copy (InputStream source, OutputStream sink) throws IOException
    {
        final byte[] buffer = new byte[4096];
        int n = 0;
        while (true) {
            final int r = source.read(buffer);
            if (r == -1)
                break;
            sink.write(buffer, 0, r);
            n += r;
        }
        return n;
    }
    
    @Nonnull
    @Override
    public String toString ()
    {
        return name;
    }
}
