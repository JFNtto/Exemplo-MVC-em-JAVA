
package com.mycompany.model;

import java.util.ArrayList;
import java.util.List;


public class ListaConsoles {
    private static List<ConsolesModel> lista;
    
    private ListaConsoles(){}
    
    public static List<ConsolesModel> getInstance(){
        if(lista == null){
            lista = new ArrayList<>();
        }
        return lista;
    }
}
