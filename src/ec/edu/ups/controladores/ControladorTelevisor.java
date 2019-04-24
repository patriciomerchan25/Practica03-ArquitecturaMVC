/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;
import ec.edu.ups.clases.Televisor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author patrick
 */
public class ControladorTelevisor {
    
    private Set<Televisor> lista;
    private int codigo; 

    public ControladorTelevisor() {
        lista = new HashSet<>();
        codigo = 0;
    }
    
    public void crear(Televisor objeto){
        
        objeto.setCodigo(codigo);
        codigo++;
        lista.add(objeto);        
    }
    
    public Televisor read(int codigo){
        for (Televisor televisor : lista) {
            if(televisor.getCodigo() == codigo){
                return televisor;
            }
        }        
        return null;
    }
    
    public void update(Televisor objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (Televisor televisor : lista) {
            if(televisor.getCodigo() == codigo){
                lista.remove(televisor);
                break;
            }
        }  
    } 
    public void imprimir(){
        for (Televisor televisor : lista) {
            System.out.println(televisor.getNombre());   
        }
    }
}

