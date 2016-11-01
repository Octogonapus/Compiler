import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ryan Benasutti on 2/28/2016.
 */

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = null;
        String file = "";

        try
        {
            scanner = new Scanner(new BufferedReader(new FileReader("D:\\Documents\\Java_Programs\\Compiler\\res\\testProgram.txt")));

            while (scanner.hasNextLine())
                file += scanner.nextLine();
        }
        finally
        {
            if (scanner != null)
                scanner.close();
        }

        Parser parser = new Parser(file);
    }
}
