import java.util.Optional;

/**
 * Created by Ryan Benasutti on 10/31/2016.
 */

public interface Token<T>
{
    Optional<T> match(String token) throws TokenNotPresentException;
}
