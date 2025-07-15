package org.example.app.model;

public class Patrimonio {

    public class Patrimonios {
        private int id;
        private String numeroPatrimonio;
        private String numeroSerie;
        private String nomeItem;
        private String codigoItem;
        private String tipo;
        private double preco;
        private String loja;
        private String setor;
        private String dataCompra;
        private String estadoConservacao;
        private String observacoes;

        public Patrimonios(int id, String numeroPatrimonio, String numeroSerie, String nomeItem, String codigoItem,
                          String tipo, double preco, String loja, String setor, String dataCompra,
                          String estadoConservacao, String observacoes) {
            this.id = id;
            this.numeroPatrimonio = numeroPatrimonio;
            this.numeroSerie = numeroSerie;
            this.nomeItem = nomeItem;
            this.codigoItem = codigoItem;
            this.tipo = tipo;
            this.preco = preco;
            this.loja = loja;
            this.setor = setor;
            this.dataCompra = dataCompra;
            this.estadoConservacao = estadoConservacao;
            this.observacoes = observacoes;
        }

        // Getters
        public int getId() { return id; }
        public String getNumeroPatrimonio() { return numeroPatrimonio; }
        public String getNumeroSerie() { return numeroSerie; }
        public String getNomeItem() { return nomeItem; }
        public String getCodigoItem() { return codigoItem; }
        public String getTipo() { return tipo; }
        public double getPreco() { return preco; }
        public String getLoja() { return loja; }
        public String getSetor() { return setor; }
        public String getDataCompra() { return dataCompra; }
        public String getEstadoConservacao() { return estadoConservacao; }
        public String getObservacoes() { return observacoes; }
    }

}
