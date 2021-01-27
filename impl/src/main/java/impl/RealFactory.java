package impl;

import api.Factory;
import api.Service;

public final class RealFactory implements Factory
{
    private final String name;

    public RealFactory (String name)
    {
        this.name = name;
    }
    
    public String getName ()
    {
        return name;
    }
    
    public Service createService (String foo)
    {
        return new RealService(foo);
    }
}
