
package com.mycompany.controller;

import com.mycompany.model.JogosModel;
import com.mycompany.model.ListaJogos;
import com.mycompany.views.EstatisticasJogosView;
import com.mycompany.views.ListarJogos;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Jogos implements Produtos{


 
      @Override  
    public boolean cadastrar(int id, String nome, String descricao, int quantidade, String genero){
        JogosModel jogos = new JogosModel(id, nome, descricao, quantidade, genero);
        return ListaJogos.getInstance().add(jogos);
    }
    
    
    @Override
    public void preencher(JTable jTabela){
        DefaultTableModel dtm = (DefaultTableModel) jTabela.getModel();
        
        dtm.setRowCount(ListaJogos.getInstance().size());
        jTabela.setModel(dtm);
        
        int posicaoLinha = 0;
        
        for(int i = 0; i < ListaJogos.getInstance().size(); i++){
            jTabela.setValueAt(ListaJogos.getInstance().get(i).getId(), posicaoLinha, 0);
            jTabela.setValueAt(ListaJogos.getInstance().get(i).getNome(), posicaoLinha, 1);
            jTabela.setValueAt(ListaJogos.getInstance().get(i).getDescricao(), posicaoLinha, 2);
            jTabela.setValueAt(ListaJogos.getInstance().get(i).getGenero(), posicaoLinha, 3);
            jTabela.setValueAt(ListaJogos.getInstance().get(i).getQuantidade(), posicaoLinha, 4);
            
            posicaoLinha += 1;
        }
        
    }
    
    @Override
    public void excluir(JTable jTabela){
        if(jTabela.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela", "ATENÇÃO", 0);
        }else{
            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que quer apagar?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION){
                ListaJogos.getInstance().remove(jTabela.getSelectedRow());
                
                preencher(jTabela);
            }
        }
    }
    
    @Override
    public List<Object> pesquisar(int id){
        boolean achou = false;
        int posicao = -1;
        
        for(int i = 0; i < ListaJogos.getInstance().size(); i++){
            if(ListaJogos.getInstance().get(i).getId() == id){
                achou = true;
                posicao = i;
            }
        }
        if(achou == true){
            String nomeJogo = ListaJogos.getInstance().get(posicao).getNome();
            String descricaoJogo = ListaJogos.getInstance().get(posicao).getDescricao();
            int quantidadeJogo = ListaJogos.getInstance().get(posicao).getQuantidade();
            String genero = ListaJogos.getInstance().get(posicao).getGenero();
            
            return Arrays.asList(id, nomeJogo, descricaoJogo, quantidadeJogo, genero);
        }else{
            JOptionPane.showMessageDialog(null, "Não foi encontrado", "ATENÇÃO", 0);
            return null;
        }
    }
    
    @Override
    public void editar(int id, String nome, String descricao, int quantidade, String genero) {
    List<Object> resultado = pesquisar(id);
    
    if (resultado != null) { 
        
        JogosModel jogos = new JogosModel(id, nome, descricao, quantidade, genero);
        
       
        for (int i = 0; i < ListaJogos.getInstance().size(); i++) {
            if (ListaJogos.getInstance().get(i).getId() == id) {
                ListaJogos.getInstance().set(i, jogos); // Atualiza o jogo na lista
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!"); 
                return;
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Erro ao editar, jogo não encontrado.", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
    public void listaEstatisticasJogos(EstatisticasJogosView etJogos) {
    ListarJogos listJogos = new ListarJogos();
    
    
    int quantidade = listJogos.getJTabelaJogos().getRowCount();
    etJogos.getTxtQuantidadeJogos().setText(String.valueOf(quantidade));
    
    Map<String, Integer> contagemGeneros = new HashMap<>();
    contagemGeneros.put("ação", 0);
    contagemGeneros.put("aventura", 0);
    contagemGeneros.put("RPG", 0);
    contagemGeneros.put("FPS", 0);
    contagemGeneros.put("Simulador", 0);
    contagemGeneros.put("Corrida", 0);
    
    List<JogosModel> jogos = ListaJogos.getInstance();
    
    for (JogosModel jogo : jogos) {
        String genero = jogo.getGenero();
        if (contagemGeneros.containsKey(genero)) {
            contagemGeneros.put(genero, contagemGeneros.get(genero) + 1);
        }
    }


    // Atualizando os txt
    // Gênero: Ação
etJogos.getTxtQuantidadeAcao().setText(String.valueOf(contagemGeneros.getOrDefault("ação", 0)));
int porcentagemAcao = (int) ((Integer.parseInt(etJogos.getTxtQuantidadeAcao().getText()) / (double) quantidade) * 100);
etJogos.getTxtPorcentoAcao().setText(String.valueOf(porcentagemAcao) + "%");

// Gênero: Aventura
etJogos.getTxtQuantidadeAventura().setText(String.valueOf(contagemGeneros.getOrDefault("aventura", 0)));
int porcentagemAventura = (int) ((Integer.parseInt(etJogos.getTxtQuantidadeAventura().getText()) / (double) quantidade) * 100);
etJogos.getTxtPorcentoAventura().setText(String.valueOf(porcentagemAventura) + "%");

// Gênero: RPG
etJogos.getTxtQuantidadeRPG().setText(String.valueOf(contagemGeneros.getOrDefault("RPG", 0)));
int porcentagemRPG = (int) ((Integer.parseInt(etJogos.getTxtQuantidadeRPG().getText()) / (double) quantidade) * 100);
etJogos.getTxtPorcentoRPG().setText(String.valueOf(porcentagemRPG) + "%");

// Gênero: FPS
etJogos.getTxtQuantidadeFPS().setText(String.valueOf(contagemGeneros.getOrDefault("FPS", 0)));
int porcentagemFPS = (int) ((Integer.parseInt(etJogos.getTxtQuantidadeFPS().getText()) / (double) quantidade) * 100);
etJogos.getTxtPorcentoFPS().setText(String.valueOf(porcentagemFPS) + "%");

// Gênero: Simulador
etJogos.getTxtQuantidadeSimulador().setText(String.valueOf(contagemGeneros.getOrDefault("Simulador", 0)));
int porcentagemSimulador = (int) ((Integer.parseInt(etJogos.getTxtQuantidadeSimulador().getText()) / (double) quantidade) * 100);
etJogos.getTxtPorcentoSimulador().setText(String.valueOf(porcentagemSimulador) + "%");

// Gênero: Corrida
etJogos.getTxtQuantidadeCorrida().setText(String.valueOf(contagemGeneros.getOrDefault("Corrida", 0)));
int porcentagemCorrida = (int) ((Integer.parseInt(etJogos.getTxtQuantidadeCorrida().getText()) / (double) quantidade) * 100);
etJogos.getTxtPorcentoCorrida().setText(String.valueOf(porcentagemCorrida) + "%");

    
    
    }
}

    

    
    
    
