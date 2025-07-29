package org.example.produto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Essa classe representa o que você está salvando no banco: o produto.

@Entity //diz pro Spring: “essa classe será uma tabela no banco!”
public class Produto {
    @Id //chave primária automática
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeItem;
    private String codigoItem;
    private String tipo;
    private String loja;
    private String setor;
    private String estadoConservacao;
    private String descricao;
    private Long patrimonio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(long patrimonio) {
        this.patrimonio = patrimonio;
    }
}
