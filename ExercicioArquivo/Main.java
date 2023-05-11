package ExercicioArquivo;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "C:/Users/isabella.veras/OneDrive - Group Software Ltda/Documentos/LP/Contas.txt";

        Manipula b = new Manipula();

        try {
            b.leitor(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
