
package com.mycompany.model;

import com.mycompany.controller.Jogos;
import java.util.ArrayList;
import java.util.List;


public class ListaJogos {
    private static List<JogosModel> lista;
    
    private ListaJogos(){}
    
    public static List<JogosModel> getInstance(){
        if(lista == null){
            lista = new ArrayList<>();
        }
        return lista;
    }
    
    
    
}

