import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Livro l1 = new Livro(1, "Harry Potter", 14.8F);
        Livro l2 = new Livro(2, "Diário de um Banana", 25.99F);

        System.out.println("Diretório atual: " + new File(".").getAbsolutePath());


        FileOutputStream arq = new FileOutputStream("dados/livros.db");
        DataOutputStream dos = new DataOutputStream(arq);

        dos.writeInt(l1.idLivro);
        dos.writeUTF(l1.nome);
        dos.writeFloat(l1.preco);

        dos.writeInt(l2.idLivro);
        dos.writeUTF(l2.nome);
        dos.writeFloat(l2.preco);

        dos.close();
    }
}
