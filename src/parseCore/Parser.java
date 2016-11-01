package parseCore;

import parseCore.*;

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

    private TokenType.TokenTypes match(String token)
    {
        try
        {
            if (comments.match(token).isPresent())
            {

            }
        }
        catch (TokenNotPresentException e)
        {
        }
    }

    public List<String> getTokens()
    {
        return tokens;
    }
}
