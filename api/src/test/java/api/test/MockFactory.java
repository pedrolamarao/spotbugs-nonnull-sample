package api.test;

import api.Factory;
import api.Service;

public final class MockFactory implements Factory
{
    @Override
    public String getName ()
    {
        return null;
    }

    @Override
    public Service createService (String foo)
    {
        return new MockService();
    }
}
