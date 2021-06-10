package klarenbach.daniel.java2python;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Java2PythonTranspiler transpiler = new Java2PythonTranspiler();
        transpiler.runService(args[0], args[1]);
    }
}
