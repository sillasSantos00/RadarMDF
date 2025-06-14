package org.example.produtos;

import java.math.BigDecimal;

public class Produtos {
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int quantidade;

    public Produtos(String nome, String descricao, BigDecimal preco, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Produtos setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produtos setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Produtos setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produtos setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }
}
