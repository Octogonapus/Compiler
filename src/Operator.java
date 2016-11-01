import java.util.Optional;

/**
 * Created by Ryan Benasutti on 10/31/2016.
 */

public class Operator implements Token<Operator.Operators>
{
    enum Operators
    {
        equals,
        greaterThan,
        lessThan,
        bang,
        questionMark,
        colon,
        doubleEquals,
        lessThan_Equals,
        greatThan_Equals,
        bang_Equals,
        doubleAmpersand,
        doublePipe,
        doublePlus,
        doubleMinus,
        plus,
        minus,
        multiply,
        divide,
        ampersand,
        pipe,
        carat,
        percent,
        doubleLessThan,
        doubleGreaterThan,
        tripleGreaterThan,
        plus_Equals,
        minus_Equals,
        multiply_Equals,
        divie_Equals,
        ampersand_Equals,
        pipe_Equals,
        carat_Equals,
        percent_Equals,
        doubleLessThan_Equals,
        doubleGreaterThan_Equals,
        tripleGreaterThan_Equals
    }

    @Override
    public Optional<Operators> match(String token) throws TokenNotPresentException
    {
        switch (token)
        {
            case "=":
                return Optional.of(Operators.equals);

            case ">":
                return Optional.of(Operators.greaterThan);

            case "<":
                return Optional.of(Operators.lessThan);

            case "!":
                return Optional.of(Operators.bang);


        }
        return null;
    }
}
