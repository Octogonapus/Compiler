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
    public Keywords match(String token) throws TokenNotPresentException
    {
        switch (token)
        {
            case "var":
                return Keywords.var;

            case "let":
                return Keywords.let;

            default:
                throw new TokenNotPresentException(token);
        }
    }
}
