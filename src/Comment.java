import java.util.Optional;

/**
 * Created by Ryan Benasutti on 11/1/2016.
 */

public class Comment implements Token<Comment.Comments>
{
    enum Comments
    {
        line,
        blockStart,
        blockEnd
    }

    @Override
    public Optional<Comments> match(String token) throws TokenNotPresentException
    {
        switch (token)
        {
            case "//":
                return Optional.of(Comments.line);

            case "/*":
                return Optional.of(Comments.blockStart);

            case "*/":
                return Optional.of(Comments.blockEnd);

            default:
                throw new TokenNotPresentException(token);
        }
    }
}
