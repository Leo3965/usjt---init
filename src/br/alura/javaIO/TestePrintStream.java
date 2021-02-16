package br.alura.javaIO;

import java.io.IOException;
import java.io.PrintStream;

public class TestePrintStream {
    
    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("C:\\Workspace\\usjt---init\\src\\lorem.txt");

        ps.println("Léo");
        ps.println("aosmdhnoajf hdsoshcfnsdkjf");

        ps.close();
    }
}
