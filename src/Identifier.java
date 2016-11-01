import java.util.Optional;

/**
 * Created by Ryan Benasutti on 10/31/2016.
 */

public class Identifier implements Token<String>
{
    @Override
    public Optional<String> match(String token) throws TokenNotPresentException
    {
        return Optional.ofNullable(token);
    }
}
