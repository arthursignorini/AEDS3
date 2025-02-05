public class Livro {
    protected int idLivro;
    protected String nome;
    protected float preco;

    public Livro (int i, String n, float p) {
        idLivro = i;
        nome = n;
        preco = p;
    }

    @Override
    public String toString() {
        return "Livro [idLivro=" + idLivro + ", nome=" + nome + ", preco=" + preco + "]";
    }

}