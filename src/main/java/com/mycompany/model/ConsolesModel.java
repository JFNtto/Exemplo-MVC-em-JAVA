
package com.mycompany.model;




public class ConsolesModel{
        private int id;
        private String nome;
        private String descricao;
        private int quantidade;
        private String fabricante;
    
    
        
        
    public ConsolesModel(){}
        
    public ConsolesModel(int id, String nome, String descricao, int quantidade, String fabricante) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
        
        
}
