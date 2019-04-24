/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;
import ec.edu.ups.clases.ComputadoraPersonal;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author patrick
 */

public class ControladorComputadora {
      private Map<Integer,ComputadoraPersonal> lista;
      private int codigo;
    public ControladorComputadora() {
        lista = new TreeMap<>();
        codigo = 0;
    }
    
    public void create(ComputadoraPersonal objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);
    }
    
    public ComputadoraPersonal read(int codigo){
          if(lista.get(codigo) != null){
                return lista.get(codigo);
            }
          return null;
    }
    
    public void update(ComputadoraPersonal objeto){
        lista.put(objeto.getCodigo(), objeto);
    }
    
    public void delete(int codigo){
        lista.remove(codigo);
}
      public void imprimir(){
        System.out.println(lista.entrySet());
    }
    
}
