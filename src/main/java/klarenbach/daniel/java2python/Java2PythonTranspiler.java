package klarenbach.daniel.java2python;

import klarenbach.daniel.antlr.Java11Lexer;
import klarenbach.daniel.antlr.Java11Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Java2PythonTranspiler {

    private String readJavaFile(String pathToFile) throws IOException {
        String content = Files.readString(Paths.get(pathToFile));
        return content;
    }

    private void writeToPythonFile(String pathToFile, String content) throws IOException {
        Files.write(Paths.get(pathToFile),content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    private String transpile(String source) {
        CharStream input = CharStreams.fromString(source);
        Java11Lexer lexer = new Java11Lexer(input);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        Java11Parser parser = new Java11Parser(tokenStream);
        ParseTree tree = parser.program();

        Java11VisitorImplementation visitor = new Java11VisitorImplementation();
        String output = visitor.visit(tree);

        return output;
    }

    public void runService(String pathToInputFile,String pathToOutputFile) throws IOException {
        String input = readJavaFile(pathToInputFile);
        String output = transpile(input);
        writeToPythonFile(pathToOutputFile,output);
    }
}
