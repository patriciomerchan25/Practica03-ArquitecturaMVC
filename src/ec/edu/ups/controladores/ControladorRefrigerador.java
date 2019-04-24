/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;
import ec.edu.ups.clases.Refrigerador;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


/**
 *
 * @author patrick
 */
public class ControladorRefrigerador {
    private SortedSet<Refrigerador> listaOrdenada;
    private int codigo;

    public ControladorRefrigerador() {
        listaOrdenada = new TreeSet<>();
        codigo = 0;
    }
    
    public void create(Refrigerador objeto){
       
        objeto.setCodigo(codigo);
         codigo++;
        listaOrdenada.add(objeto);
    }
    
    public Refrigerador read(int codigo){
        for (Refrigerador refrigerador : listaOrdenada) {
            if(refrigerador.getCodigo() == codigo){
                return refrigerador;
            }
        }
        return null;
    }            
    
    public void update(Refrigerador objeto){
        if(listaOrdenada.contains(objeto)){
            listaOrdenada.remove(objeto);
            listaOrdenada.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (Refrigerador refrigerador : listaOrdenada) {
            if(refrigerador.getCodigo() == codigo){
                listaOrdenada.remove(refrigerador);
                break;
            }
        }
    }
    
    public void imprimir(){
        System.out.println("Lista Ordenada por nombre");
        for (Refrigerador refrigerador : listaOrdenada) {
            System.out.println(refrigerador.getNombre());
        }
    }
}

