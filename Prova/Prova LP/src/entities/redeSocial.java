package entities;

import java.util.ArrayList;

public class redeSocial {
    
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;
    private ArrayList<publicacao> publicacoes = new ArrayList<>();

    public redeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public void inserePublicacao(publicacao publi){
        publicacoes.add(publi);
    }

    public void imprimePublicacao(){
        System.out.printf("No momento temos %.0f publicações", publicacao.getContadorPublicacao());
        System.out.println();
        
        for (publicacao publi : publicacoes) {
            System.out.println("Data publicação: " + publi.getDataPublicacao());
            System.out.println("Texto publicação "+ publi.getTextoPublicacao());
        }

    }


}
