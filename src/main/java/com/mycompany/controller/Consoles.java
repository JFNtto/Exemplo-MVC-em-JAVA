
package com.mycompany.controller;

import com.mycompany.model.ConsolesModel;
import com.mycompany.model.ListaConsoles;
import com.mycompany.views.EstatisticasConsolesView;
import com.mycompany.views.ListarConsole;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Consoles implements Produtos{

    
    
        @Override
            public boolean cadastrar(int id, String nome, String descricao, int quantidade, String fabricante){
                ConsolesModel consoles = new ConsolesModel(id, nome, descricao, quantidade, fabricante);
            return ListaConsoles.getInstance().add(consoles);
        }
            
       @Override     
        public void preencher(JTable jTabela){
            DefaultTableModel dtm = (DefaultTableModel) jTabela.getModel();
        
            dtm.setRowCount(ListaConsoles.getInstance().size());
            jTabela.setModel(dtm);
        
            int posicaoLinha = 0;
        
            for(int i = 0; i < ListaConsoles.getInstance().size(); i++){
                jTabela.setValueAt(ListaConsoles.getInstance().get(i).getId(), posicaoLinha, 0);
                jTabela.setValueAt(ListaConsoles.getInstance().get(i).getNome(), posicaoLinha, 1);
                jTabela.setValueAt(ListaConsoles.getInstance().get(i).getDescricao(), posicaoLinha, 2);              
                jTabela.setValueAt(ListaConsoles.getInstance().get(i).getQuantidade(), posicaoLinha, 3);
                jTabela.setValueAt(ListaConsoles.getInstance().get(i).getFabricante(), posicaoLinha, 4);
            
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
                ListaConsoles.getInstance().remove(jTabela.getSelectedRow());
                
                preencher(jTabela);
            }
        }
    }
    
    @Override     
    public List<Object> pesquisar(int id) {
    boolean achou = false;
    int posicao = -1;

    for (int i = 0; i < ListaConsoles.getInstance().size(); i++) {
        if (ListaConsoles.getInstance().get(i).getId() == id) {
            achou = true;
            posicao = i;
        }
    }

    if (achou) {
        String nomeConsole = ListaConsoles.getInstance().get(posicao).getNome();
        String descricaoConsole = ListaConsoles.getInstance().get(posicao).getDescricao();
        int quantidadeConsole = ListaConsoles.getInstance().get(posicao).getQuantidade();
        String fabricante = ListaConsoles.getInstance().get(posicao).getFabricante();

        return Arrays.asList(id, nomeConsole, descricaoConsole, quantidadeConsole, fabricante);
    } else {
        JOptionPane.showMessageDialog(null, "Não foi encontrado"); 
        return null;
    }
}

    
@Override  
public void editar(int id, String nome, String descricao, int quantidade, String fabricante) {
    List<Object> resultado = pesquisar(id);

    if (resultado != null) { 
        
        ConsolesModel console = new ConsolesModel(id, nome, descricao, quantidade, fabricante);

        
        for (int i = 0; i < ListaConsoles.getInstance().size(); i++) {
            if (ListaConsoles.getInstance().get(i).getId() == id) {
                ListaConsoles.getInstance().set(i, console); 
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!"); 
                return;
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Erro ao editar, jogo não encontrado.", "ATENÇÃO", JOptionPane.ERROR_MESSAGE); 
    }
}
   


    public void listaConsoles(EstatisticasConsolesView etConsoles){
    ListarConsole listConsoles = new ListarConsole();

int quantidade = listConsoles.getjTabelaConsoles().getRowCount();
etConsoles.getTxtQuantidadeConsoles().setText(String.valueOf(quantidade));

Map<String, Integer> contagemConsoles = new HashMap<>();
contagemConsoles.put("Sony", 0);
contagemConsoles.put("Microsoft", 0);
contagemConsoles.put("Nintendo", 0);
contagemConsoles.put("Outros", 0); // Categoria para outros fabricantes

List<ConsolesModel> consoles = ListaConsoles.getInstance();

for (ConsolesModel console : consoles) {
    String fabricante = console.getFabricante();
    if (contagemConsoles.containsKey(fabricante)) {
        contagemConsoles.put(fabricante, contagemConsoles.get(fabricante) + 1);
    } else {
        contagemConsoles.put("Outros", contagemConsoles.get("Outros") + 1); // Incrementa a categoria "Outros"
    }
}

// Atualizando os txt
// Fabricante: Sony
etConsoles.getTxtConsolesSony().setText(String.valueOf(contagemConsoles.getOrDefault("Sony", 0)));
int porcentagemSony = (int) ((contagemConsoles.get("Sony") / (double) quantidade) * 100);
etConsoles.getTxtPorcentoSony().setText(String.valueOf(porcentagemSony) + "%");

// Fabricante: Microsoft
etConsoles.getTxtConsolesMicrosoft().setText(String.valueOf(contagemConsoles.getOrDefault("Microsoft", 0)));
int porcentagemMicrosoft = (int) ((contagemConsoles.get("Microsoft") / (double) quantidade) * 100);
etConsoles.getTxtPorcentoMicrosoft().setText(String.valueOf(porcentagemMicrosoft) + "%");

// Fabricante: Nintendo
etConsoles.getTxtConsolesNintendo().setText(String.valueOf(contagemConsoles.getOrDefault("Nintendo", 0)));
int porcentagemNintendo = (int) ((contagemConsoles.get("Nintendo") / (double) quantidade) * 100);
etConsoles.getTxtPorcentoNintendo().setText(String.valueOf(porcentagemNintendo) + "%");

// Categoria: Outros
etConsoles.getTxtConsolesOutros().setText(String.valueOf(contagemConsoles.getOrDefault("Outros", 0)));
int porcentagemOutros = (int) ((contagemConsoles.get("Outros") / (double) quantidade) * 100);
etConsoles.getTxtPorcentoOutros().setText(String.valueOf(porcentagemOutros) + "%");

    
    }

      
}
