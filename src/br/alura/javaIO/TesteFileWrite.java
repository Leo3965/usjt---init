package br.alura.javaIO;

import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWrite {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Workspace\\usjt---init\\src\\lorem.txt");
        fw.write("Léo");
        fw.write(System.lineSeparator());
        fw.write("aosmdhnoajf hdsoshcfnsdkjf");

        fw.close();
    }
}
