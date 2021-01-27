package api;

import javax.annotation.Nonnull;

public interface Factory
{
    @Nonnull
	String getName ();
    
    @Nonnull
    Service createService (@Nonnull String foo);
}
