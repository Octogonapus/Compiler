package parseCore;

import java.util.Optional;

/**
 * Created by Ryan Benasutti on 10/31/2016.
 */

public class Separator implements Token<Separator.Separators>
{
    enum Separators
    {
        semicolon,
        comma,
        period,
        leftParens,
        rightParens,
        leftBrace,
        rightBrace,
        leftBracket,
        rightBracket
    }

    @Override
    public Optional<Separators> match(String token) throws TokenNotPresentException
    {
        switch (token)
        {
            case ";":
                return Optional.of(Separators.semicolon);

            case ",":
                return Optional.of(Separators.comma);

            case ".":
                return Optional.of(Separators.period);

            case "(":
                return Optional.of(Separators.leftParens);

            case ")":
                return Optional.of(Separators.rightParens);

            case "{":
                return Optional.of(Separators.leftBrace);

            case "}":
                return Optional.of(Separators.rightBrace);

            case "[":
                return Optional.of(Separators.leftBracket);

            case "]":
                return Optional.of(Separators.rightBracket);

            default:
                throw new TokenNotPresentException(token);
        }
    }
}
