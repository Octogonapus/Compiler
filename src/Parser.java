import java.util.*;

/**
 * Created by Ryan Benasutti on 2/28/2016.
 */

public class Parser
{
    private List<String> tokens;

    Identifier identifier = new Identifier();
    Keyword keyword = new Keyword();
    Operator operator = new Operator();
    Separator separator = new Separator();
    Literal literal = new Literal();
    Comment comments = new Comment();

    public Parser(String toParse)
    {
        //Scanner for input
        Scanner scanner = new Scanner(toParse);

        //List of tokens
        tokens = new ArrayList<>();

        //Flag to keep reading
        boolean keepGoing = true;

        //Scan in string
        while (scanner.hasNext())
        {
            //Scan in next token
            String token = scanner.next();

            //Add token to token list
            tokens.add(token);

            match(token);
        }
    }

    private boolean match(String token)
    {
        try
        {
            return comments.match(token).isPresent() || literal.match(token).isPresent()

        } catch (TokenNotPresentException e)
        {
            e.printStackTrace();
        }
    }

    public List<String> getTokens()
    {
        return tokens;
    }
}
