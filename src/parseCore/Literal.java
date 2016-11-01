package parseCore;

import java.util.Optional;

/**
 * Created by Ryan Benasutti on 11/1/2016.
 */

public class Literal implements Token<Literal.Literals>
{
    enum Literals
    {
        byte_Literal,
        char_Literal,
        int_Literal,
        float_Literal,
        long_Literal,
        bool_Literal,
        string_Literal,
        null_Literal
    }

    @Override
    public Optional<Literals> match(String token) throws TokenNotPresentException
    {
        switch (token)
        {
            case "byte":
                return Optional.of(Literals.byte_Literal);

            case "char":
                return Optional.of(Literals.char_Literal);

            case "int":
                return Optional.of(Literals.int_Literal);

            case "float":
                return Optional.of(Literals.float_Literal);

            case "long":
                return Optional.of(Literals.long_Literal);

            case "bool":
                return Optional.of(Literals.bool_Literal);

            case "string":
                return Optional.of(Literals.string_Literal);

            case "null":
                return Optional.of(Literals.null_Literal);

            default:
                throw new TokenNotPresentException(token);
        }
    }
}
