package parseCore;

import java.util.Optional;

/**
 * Created by Ryan Benasutti on 10/31/2016.
 */

public class Keyword implements Token<Keyword.Keywords>
{
    enum Keywords
    {
        var,
        let;
    }

    @Override
    public Optional<Keywords> match(String token) throws TokenNotPresentException
    {
        switch (token)
        {
            case "var":
                return Optional.of(Keywords.var);

            case "let":
                return Optional.of(Keywords.let);

            default:
                throw new TokenNotPresentException(token);
        }
    }
}
