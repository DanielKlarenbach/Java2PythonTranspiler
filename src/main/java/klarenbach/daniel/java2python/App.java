package klarenbach.daniel.java2python;

import klarenbach.daniel.antlr.Java11Lexer;
import klarenbach.daniel.antlr.Java11Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {
    public static void main(String[] args) {
        App calculator = new App();
        System.out.println(calculator.toPython(
                "class HelloWorld {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        System.out.println(\"Hello, World!\"); \n" +
                        "    }\n" +
                        "}"
        ));

    }

    private Double toPython(String source) {
        CodePointCharStream input = CharStreams.fromString(source);
        return compile(input);
    }

    private Double compile(CharStream source) {
        Java11Lexer lexer = new Java11Lexer(source);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        Java11Parser parser = new Java11Parser(tokenStream);
        ParseTree tree = parser.classDeclaration();
        Java11VisitorImplementation visitor = new Java11VisitorImplementation();
        return visitor.visit(tree);
    }

}
