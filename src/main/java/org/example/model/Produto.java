package org.example.model;

public class Produto {
    private String nome;
    private String descricao;
    private int quantidade;

    public Produto(String nome, String descricao, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }
}
