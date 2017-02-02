import helper.LexerOnSteroids;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by rafaeldurelli on 9/15/16.
 * Modified by Pedro Henrique Ramos Souza
 */
public class Main {

    public static void main (String... args) throws IOException {

        String fileName = "arquivos/teste_correto.c";
//        String fileName = "arquivos/teste_errado_colchete_while.c";
//        String fileName = "arquivos/teste_errado_expressao_if.c";
//        String fileName = "arquivos/teste_errado_ponto_e_virgula.c";

        File file = new File(fileName);

        FileInputStream fis = null;

        fis = new FileInputStream(file);

        ANTLRInputStream input = new ANTLRInputStream(fis);

//        LexerOnSteroids les = new LexerOnSteroids(input);

        CMinusLexer scanner = new CMinusLexer(input);

        CommonTokenStream allTokensGenerated = new CommonTokenStream(scanner);

        CMinusParser parser = new CMinusParser(allTokensGenerated);

        CMinusParser.CompilationUnitContext compilationUnitContext = parser.compilationUnit();

//        ParseTreeWalker treeWalker = new ParseTreeWalker();

//        CMinusMyListener listener = new CMinusMyListener(parser, allTokensGenerated);

//        treeWalker.walk(listener, compilationUnitContext);

//        System.out.println("Modificado -->" +listener.tokenStreamRewriter.getText());



    }

}
