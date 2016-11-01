package parseCore;

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
        divide_Equals,
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

            case "?":
                return Optional.of(Operators.questionMark);

            case ":":
                return Optional.of(Operators.colon);

            case "==":
                return Optional.of(Operators.doubleEquals);

            case "<=":
                return Optional.of(Operators.lessThan_Equals);

            case ">=":
                return Optional.of(Operators.greatThan_Equals);

            case "!=":
                return Optional.of(Operators.bang_Equals);

            case "&&":
                return Optional.of(Operators.doubleAmpersand);

            case "||":
                return Optional.of(Operators.doublePipe);

            case "++":
                return Optional.of(Operators.doublePlus);

            case "--":
                return Optional.of(Operators.doubleMinus);

            case "+":
                return Optional.of(Operators.plus);

            case "-":
                return Optional.of(Operators.minus);

            case "*":
                return Optional.of(Operators.multiply);

            case "/":
                return Optional.of(Operators.divide);

            case "&":
                return Optional.of(Operators.ampersand);

            case "|":
                return Optional.of(Operators.pipe);

            case "^":
                return Optional.of(Operators.carat);

            case "%":
                return Optional.of(Operators.percent);

            case "<<":
                return Optional.of(Operators.doubleLessThan);

            case ">>":
                return Optional.of(Operators.doubleGreaterThan);

            case ">>>":
                return Optional.of(Operators.tripleGreaterThan);

            case "+=":
                return Optional.of(Operators.plus_Equals);

            case "-=":
                return Optional.of(Operators.minus_Equals);

            case "*=":
                return Optional.of(Operators.multiply_Equals);

            case "/=":
                return Optional.of(Operators.divide_Equals);

            case "&=":
                return Optional.of(Operators.ampersand_Equals);

            case "|=":
                return Optional.of(Operators.pipe_Equals);

            case "^=":
                return Optional.of(Operators.carat_Equals);

            case "%=":
                return Optional.of(Operators.percent_Equals);

            case "<<=":
                return Optional.of(Operators.doubleLessThan_Equals);

            case ">>=":
                return Optional.of(Operators.doubleGreaterThan_Equals);

            case ">>>=":
                return Optional.of(Operators.tripleGreaterThan_Equals);

            default:
                throw new TokenNotPresentException(token);
        }
    }
}
