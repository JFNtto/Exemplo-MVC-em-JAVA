
package com.mycompany.controller;

import java.util.List;
import javax.swing.JTable;


public interface Produtos {
    public abstract boolean cadastrar(int id, String nome, String descricao, int quantidade, String info);
    public abstract void preencher(JTable jTabela);
    public abstract void excluir(JTable jTabela);
    public abstract List<Object> pesquisar(int id);
    public abstract void editar(int id, String nome, String descricao, int quantidade, String genero);
}
