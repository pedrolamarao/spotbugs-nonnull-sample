package api.test;

import java.io.InputStream;
import java.io.OutputStream;

import api.Service;

public final class MockService implements Service
{
    @Override
    public int copy (InputStream source, OutputStream sink)
    {
        return 0;
    }
}
