/**
 * Created by Ryan Benasutti on 11/1/2016.
 */

public class TokenNotPresentException extends Exception
{
    public TokenNotPresentException(String message)
    {
        super("Token not present: " + message);
    }
}
