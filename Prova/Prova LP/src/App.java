import entities.publicacao;
import entities.redeSocial;

public class App {
    public static void main(String[] args) throws Exception {

        redeSocial rs = new redeSocial("dataCriacao", "nomeUsuario", "dataNascimento", "senha");

        publicacao p1 = new publicacao("dataPublicacao", "textoPublicacao", "linkMidia");
        publicacao p2 = new publicacao("2", "2", "2");

        rs.inserePublicacao(p1);
        rs.inserePublicacao(p2);
        rs.imprimePublicacao();

    }
}
