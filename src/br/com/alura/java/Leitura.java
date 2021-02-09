package br.com.alura.java.io;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(
                new File("D:\\workspace - Léo\\usjt---init\\src\\br\\com\\alura\\java\\io\\contas.csv"),
                StandardCharsets.UTF_8);
        while (scan.hasNextLine()) {
            String linha = scan.nextLine();
            System.out.println(linha);

        }

    }

}
