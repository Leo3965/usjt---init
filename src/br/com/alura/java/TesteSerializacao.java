package br.com.alura.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.usjt.exerciciosSemana9.Livro.LivroDeNotas;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // String nome = "Léo";
        // ObjectOutputStream oos = new ObjectOutputStream(new
        // FileOutputStream("objeto.bin"));
        // oos.writeObject(nome);
        // oos.close();

        LivroDeNotas livro = new LivroDeNotas("", 2);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("livro.bin"));
        oos.writeObject(livro);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("livro.bin"));
        LivroDeNotas livro_ = (LivroDeNotas) ois.readObject();
        ois.close();
        System.out.println(livro_);

    }
}
