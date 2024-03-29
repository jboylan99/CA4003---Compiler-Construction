import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;

public class ccal
{
	public static void main(String[] args) throws Exception
	{
		String inputFile = null;

		if (args.length > 0)
			inputFile = args[0];

		InputStream inStream = System.in;
		if (inputFile != null)
			inStream = new FileInputStream(inputFile);

		ccalLexer lexer = new ccalLexer(CharStreams.fromStream(inStream));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ccalParser parser = new ccalParser(tokens);
		ParseTree tree = parser.program(); 
	}
}